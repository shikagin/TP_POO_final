package com.mycompany.tp_mekircha_bousdjira_g01;

public class QstLibreAnamneseEnfant extends QstLibreAnamnese {
	
	private TypeQstAnamneseEnfant categorie;
	
	public QstLibreAnamneseEnfant(String enonce, TypeQstAnamneseEnfant categorie) {
		super(enonce);
		this.categorie = categorie;
	}

}
