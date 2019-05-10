package it.polito.tdp.spellchecker.controller;

	import java.net.URL;
	import java.util.ResourceBundle;
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.ComboBox;
	import javafx.scene.control.Label;

	public class SpellCheckerController {

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private ComboBox<?> languageSelect;

	    @FXML
	    private Label erroriTrovati;

	    @FXML
	    void clearText(ActionEvent event) {

	    }

	    @FXML
	    void doSpellCheck(ActionEvent event) {

	    }

	    @FXML
	    void initialize() {
	        assert languageSelect != null : "fx:id=\"languageSelect\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert erroriTrovati != null : "fx:id=\"erroriTrovati\" was not injected: check your FXML file 'SpellChecker.fxml'.";

	    }
	

	
}
