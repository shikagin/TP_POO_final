/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_poo_version1;

import java.util.*;


public class Cabinet {

	Set<Orthophoniste> setOrtho = new HashSet<>();

	public void creeCompte() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("nom: ");
		String nom = scanner.nextLine();
		System.out.print("prenom: ");
		String prenom = scanner.nextLine();
		System.out.print("email: ");
		String email = scanner.nextLine();
		System.out.print("adresse: ");
		String adresse = scanner.nextLine();
		System.out.print("adresse: ");
		String numTel = scanner.nextLine();
		System.out.print("numTel: ");
		Orthophoniste O = new Orthophoniste(nom, prenom, numTel, email, adresse);
		setOrtho.add(O);
	}

	public boolean Authentifier(Set<Orthophoniste> setOrtho, String email, String password) {
		
		for (Orthophoniste O : setOrtho) {
			if (email.equals(O.getEmail()) && password.equals(O.getPassword())) {
				return true; 
			}
		}
		return false; 
	}

	public void supprimerCompte(Orthophoniste O) {

		setOrtho.remove(O);
	}
}
