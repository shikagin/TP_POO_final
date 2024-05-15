package com.mycompany.tp_mekircha_bousdjira_g01;

// Exception personnalisée pour quand l'objectif n'existe pas
@SuppressWarnings("serial")
class ObjectifInexistantException extends Exception {

	public ObjectifInexistantException(String message) {
        super(message);
    }
}