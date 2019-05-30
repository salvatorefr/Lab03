package it.polito.tdp.spellchecker.model;

import java.util.ArrayList;
import java.util.List;

public class SpellcheckerModel {
	
	private List<RichWord > cercate;
	
	
	/*public List <RichWord> cercaInput(String textInput){
		List <RichWord> paroleCercate= new ArrayList<RichWord>();
		
	}*/

	public List<RichWord> analizza(String testoInserito,String lingua) {
			
			Dizionario dizionario=	new Dizionario();
			dizionario.caricaDizionario(lingua);
			dizionario.stampaProva();
	
		cercate= new ArrayList<RichWord>();
		testoInserito.replaceAll("[.,\\/#!$%\\^&\\*;:{}=\\-_`~()\\[\\]\"]", " "); 
		testoInserito.toLowerCase();
		String[] parole= testoInserito.split(" ");
	
		
		for (String p:parole) {
		
			if (dizionario.cercaParola(p)){
				
				cercate.add(new RichWord(p,true));
			
			}
			else {
				cercate.add(new RichWord(p,false));
				
			}
		}
		 
		return cercate;
	}
}
