package com.mycompany.tp_mekircha_bousdjira_g01;

public class BOEnfant extends BO {
    private String classeEtude;

    public BOEnfant( String classeEtude){
    this.classeEtude = classeEtude;
}
    public BOEnfant(Anamnese anamnese, Diagnostic diagnostic, String projetTherapeutique, String numTel, String classeEtude) {
        super(anamnese,diagnostic,projetTherapeutique,numTel);
        this.classeEtude = classeEtude;
    }

    public String getClasseEtude()
    {
        return(this.classeEtude);
    }
    public void setClasseEtude(String classeEtude)
    {
        this.classeEtude=classeEtude;
    }

}
