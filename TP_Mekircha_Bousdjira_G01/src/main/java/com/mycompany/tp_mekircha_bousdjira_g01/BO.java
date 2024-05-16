package com.mycompany.tp_mekircha_bousdjira_g01;

import java.util.*;

public class BO {

	private Anamnese anamnese;
	private ArrayList<EpreuveClinique> listeEpreuves;
	private Diagnostic diagnostic;
	private String projetTherapeutique;
	private String numTel;

	public BO() {
	}

	public BO(Anamnese anamnese, Diagnostic diagnostic, String projetTherapeutique, String numTel) {
		this.anamnese = anamnese;
		this.diagnostic = diagnostic;
		this.projetTherapeutique = projetTherapeutique;
		this.numTel = numTel;
	}

	public Anamnese getAnamnese() {
		return anamnese;
	}

	public void setAnamnese(Anamnese anamnese) {
		this.anamnese = anamnese;
	}

	public void setListeEpreuves(ArrayList listeEpreuves) {
		this.listeEpreuves = listeEpreuves;
	}

	public Diagnostic getDiagnostic() {
		return diagnostic;
	}

	public void setDiagnostic(Diagnostic diagnostic) {
		this.diagnostic = diagnostic;
	}

	public String getProjetTherapeutique() {
		return projetTherapeutique;
	}

	public void setProjetTherapeutique(String projetTherapeutique) {
		this.projetTherapeutique = projetTherapeutique;
	}

	public String getNumTel() {
		return (this.numTel);
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public void creerEpreuveClinique() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Voulez vous ajouter l'Observation ");
		String observation = scanner.nextLine();
		EpreuveClinique e = new EpreuveClinique(observation);
		e.creerTest();
		this.listeEpreuves.add(e);
	}

	public void creerAnamnese(TypePatient typeP) {

		Anamnese e = new Anamnese();
		e.creerTest(typeP);
		this.anamnese = e;
	}

}
