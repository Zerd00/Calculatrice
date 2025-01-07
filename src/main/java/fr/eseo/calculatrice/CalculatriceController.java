package fr.eseo.calculatrice;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CalculatriceController implements PropertyChangeListener {
    @FXML
    private TextField num1;

    @FXML
    private TextField num2;



    @FXML
    private Label Result;

    private CalculatriceModel model;

    public void initialize() {
        model = new CalculatriceModel();
        model.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Result.setText(String.valueOf(evt.getNewValue()));
    }

    public void additionBouton(MouseEvent mouseEvent) {
        model.operation(Integer.parseInt(num1.getText()),Integer.parseInt(num2.getText()));
        System.out.println(model.getResultat());

    }
    public void soustractionBouton(MouseEvent mouseEvent) {
        model.soustraction(Integer.parseInt(num1.getText()),Integer.parseInt(num2.getText()));

    }
    public void multiplicationBouton(MouseEvent mouseEvent) {
        model.multiplication(Integer.parseInt(num1.getText()),Integer.parseInt(num2.getText()));
    }


    public void handleButtonAction(ActionEvent actionEvent) {

    }

    public void handleEqual(ActionEvent actionEvent) {

    }

    public void handleClear(ActionEvent actionEvent) {

    }
}