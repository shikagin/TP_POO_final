package com.mycompany.tp_mekircha_bousdjira_g01;

// Exception de la note d'un objectif
@SuppressWarnings("serial")
public class noteObjInacceptableException extends Exception {

	public noteObjInacceptableException(String message) {
		super(message);
	}
}