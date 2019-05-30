package it.polito.tdp.spellchecker.controller;

	import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;


import it.polito.tdp.spellchecker.model.RichWord;
import it.polito.tdp.spellchecker.model.SpellcheckerModel;

import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.ComboBox;
	import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

	public class SpellCheckerController {
		private SpellcheckerModel model;

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;
	    @FXML
	    private Label tempoCompletamento;
	    
	    @FXML
	    private TextArea textInserito;

	    @FXML
	    private TextArea txtErrori;


	    @FXML
	    private ComboBox<String> languageSelect;

	    @FXML
	    private Label erroriTrovati;

		

	    @FXML
	    void clearText(ActionEvent event) {
	    	this.textInserito.clear();
	    	this.txtErrori.clear();

	    }

	    @FXML
	    void doSpellCheck(ActionEvent event) {
	    	
		    this.txtErrori.clear();
	    	String stampa="";
	    	//passo come parametri la stringa con le parole e la lingua in cui cercarle;
	    	String paroleDaCercare=this.textInserito.getText();
	    	String lingua=this.languageSelect.getValue();
	    	System.out.println("lingua inserita: "+lingua+"\n");
	    	List<RichWord> paroleCercate=model.analizza(	paroleDaCercare,lingua);
	    	for (RichWord rw:paroleCercate) {
	    		if(!rw.isCorretto()) {
	    			stampa+=rw.getParola()+" ";
	    			
	    		}
	    	}
	    this.txtErrori.appendText(stampa);
	    	

	    }

	    @FXML
	    void initialize() {
	        assert languageSelect != null : "fx:id=\"languageSelect\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert erroriTrovati != null : "fx:id=\"erroriTrovati\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	      
	       
	        	  	languageSelect.getItems().addAll("Italian","English");
	        	  	languageSelect.setValue("English");
	        	

	    }
	  


		public void setModel(SpellcheckerModel model) {
			this.model=model;
			
		}
	

	
}
