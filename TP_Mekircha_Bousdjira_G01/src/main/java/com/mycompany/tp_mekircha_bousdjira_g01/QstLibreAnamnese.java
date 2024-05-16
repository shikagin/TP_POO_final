package com.mycompany.tp_mekircha_bousdjira_g01;

public abstract class QstLibreAnamnese {
	
	protected String enonce;
	
	public QstLibreAnamnese(String enonce) {
		this.enonce = enonce;
	}
	public String getEnonce()
	{
		return(this.enonce);
	}
	public void setEnonce(String enonce)
	{
		this.enonce = enonce;
	}

}
