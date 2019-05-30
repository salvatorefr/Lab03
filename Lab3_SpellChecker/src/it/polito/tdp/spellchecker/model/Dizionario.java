package it.polito.tdp.spellchecker.model;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;


public class Dizionario {
	boolean linguaCaricata=false;
	private List <Word> vocaboli= new ArrayList<Word>();
	
		public void caricaDizionario(String lingua) {
			System.out.println("cerco la lingua "+lingua+"\n");
		FileReader fr;
		
		try {
			fr=new  FileReader("rsc/"+lingua+".txt");
			
BufferedReader br= new BufferedReader(fr);
String word;
while ((word=br.readLine())!=null) { vocaboli.add(new Word(word));}
	

			br.close();
			
		}catch (IOException e){ System.out.println("errore");}

linguaCaricata=true;

	}
	public boolean cercaParola(String parolaCercata) {
	
		
		Word cercala=new Word(parolaCercata);
		
		if (vocaboli.contains(cercala)){
			
			return true;
			}
		else return false;
	}
	@Override
	public String toString() {
		String stampa="";
		for (Word parola:vocaboli) {
			stampa+=parola.toString()+" ";
		}
		return stampa;
	}
	public List <Word> getTutte() {
		
		return vocaboli;
	}
	public void stampaProva() {
	
		
	}
	
		
}
