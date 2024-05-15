package com.mycompany.tp_mekircha_bousdjira_g01;

public class QuestionLibre extends Question {
    protected String reponse ;
    
   

    public QuestionLibre (String enonce) {
        super(enonce) ; 
    }
    
    //LES AFFICHAGES 
    public void afficherReponse (){
        System.out.println(reponse);
    }

    public void setReponse (String reponse){
       this.reponse = reponse ; 
    }

    public String getReponse (){
        return reponse ; 
    }

   
}