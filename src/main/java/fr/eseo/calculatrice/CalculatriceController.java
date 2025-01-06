package fr.eseo.calculatrice;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

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
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Result.setText(model.toString());
    }

    public void additionBouton(MouseEvent mouseEvent) {
        model.operation(Integer.parseInt(num1.getText()),Integer.parseInt(num2.getText()));

    }
    public void soustractionBouton(MouseEvent mouseEvent) {
        model.operation(Integer.parseInt(num1.getText()),Integer.parseInt(num2.getText()));

    }
    public void multiplicationBouton(MouseEvent mouseEvent) {
        model.operation(Integer.parseInt(num1.getText()),Integer.parseInt(num2.getText()));
    }
}