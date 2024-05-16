package com.mycompany.tp_mekircha_bousdjira_g01;

import java.util.*;

public class Anamnese {

	Set<QstLibreAnamnese> listeQuestions;

	public Anamnese() {
		listeQuestions = new HashSet<>();
	}

	public void ajouterQuestion(TypePatient typeP) {
		QstLibreAnamnese question;
		Scanner scanner = new Scanner(System.in);
		System.out.println("donner l'enonce de la question que vous devez ajouter   :");
		String enonce = scanner.nextLine();

		if (null == typeP) {
			throw new IllegalArgumentException("Invalid type ");
		} else {
			switch (typeP) {
				case ENFANT:
					System.out.println("donner le Type de question :");
					String type = scanner.nextLine();
					question = new QstLibreAnamneseEnfant(enonce, getTypeFromString(type));
					break;
				case ADULTE:
					question = new QstLibreAnamneseAdulte(enonce);
					break;
				default:
					throw new IllegalArgumentException("Invalid type ");
			}
		}
		listeQuestions.add(question);
	}

	public void modifierQuestion(QstLibreAnamnese ancienneQuestion, QstLibreAnamnese nouvelleQuestion) {
		if (listeQuestions.contains(ancienneQuestion)) {
			listeQuestions.remove(ancienneQuestion);
			listeQuestions.add(nouvelleQuestion);
		} else {
			System.out.println("La question à modifier n'existe pas dans la liste.");
		}
	}

	public void supprimerQuestion(QstLibreAnamnese question) {
		listeQuestions.remove(question);
	}

	public void creerTest(TypePatient typeP) {

		System.out.println("choisir : ");
		System.out.println("1_ ajouter une question .");
		System.out.println("2_modifier une question . ");
		System.out.println("3_supprimer une question . ");
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt();
		switch (c) {
			case 1:

				this.ajouterQuestion(typeP);

				break;
			case 2:

				System.out.println("donner l'enonce de la question que vous devez modifier  :");
				String enonce = scanner.nextLine();

				QstLibreAnamnese q = rechrecherQuestion(enonce);

				System.out.println("donner le nouveau enonce :");
				enonce = scanner.nextLine();
				QstLibreAnamnese q1;
				if (q instanceof QstLibreAnamneseAdulte) {

					q1 = new QstLibreAnamneseAdulte(enonce);

				} else {
					System.out.println("donner le Type de question :");
					String type = scanner.nextLine();

					q1 = new QstLibreAnamneseEnfant(enonce, getTypeFromString(type));
				}

				this.modifierQuestion(q, q1);

				break;
			case 3:

				System.out.println("donner l'enonce de la question que vous devez modifier  :");
				enonce = scanner.nextLine();
				q = rechrecherQuestion(enonce);
				this.supprimerQuestion(q);
		}
	}

	public QstLibreAnamnese rechrecherQuestion(String enonce) throws NoSuchElementException {
		for (QstLibreAnamnese q : this.listeQuestions) {
			if (q.getEnonce().equals(enonce)) {
				return q;

			}
		}
		throw new NoSuchElementException("la question n'existe pas  ");
	}

	public static TypeQstAnamneseEnfant getTypeFromString(String str) {
		try {
			return TypeQstAnamneseEnfant.valueOf(str);
		} catch (IllegalArgumentException e) {
			return null;
		}
	}

}
