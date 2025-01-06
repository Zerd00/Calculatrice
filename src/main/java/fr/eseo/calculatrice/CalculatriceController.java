package fr.eseo.calculatrice;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CalculatriceController implements PropertyChangeListener {
    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private Label Result;

    public Button additionBouton;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }
}