package it.polito.tdp.spellchecker.model;

public class Word {
private String parola;


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((parola == null) ? 0 : parola.hashCode());
	return result;
}



@Override
public boolean equals(Object obj) {
Word altra= (Word) obj;

if (altra.getParola().compareTo(parola)==0) 
	return true;
	else return false;


}



@Override
public String toString() {

	return parola;
}

public Word(String parola) {
	
	this.parola = parola;
}

public String getParola() {
	return parola;
}

public void setParola(String parola) {
	this.parola = parola;
}
}
