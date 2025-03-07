package fr.eseo.calculatrice;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CalculatriceController implements PropertyChangeListener {

    @FXML
    private TextField display;

    private CalculatriceModel model;
    private String currentInput = "";
    private String operator = "";
    private int firstOperand = 0;


    public void initialize() {
        System.out.println(display);
        model = new CalculatriceModel();
        model.addPropertyChangeListener(this);
    }


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("resultat".equals(evt.getPropertyName())) {
            display.setText(String.valueOf(evt.getNewValue()));
        }
    }

    public void handleButtonClick(MouseEvent mouseEvent) {
        String buttonText = ((javafx.scene.control.Button) mouseEvent.getSource()).getText();

        if ("+-*".contains(buttonText)) {
            if (!currentInput.isEmpty()) {
                firstOperand = Integer.parseInt(currentInput);
                operator = buttonText;
                currentInput = "";
                display.setText(operator);
            }
        } else {
            currentInput += buttonText;
            display.setText(currentInput);
        }
    }

    /**
     * Gère le clic sur le bouton "=".
     */
    public void handleEqual(MouseEvent mouseEvent) {
        if (!operator.isEmpty() && !currentInput.isEmpty()) {
            int secondOperand = Integer.parseInt(currentInput);
            model.calculer(firstOperand, secondOperand, operator);

            currentInput = String.valueOf(model.getResultat());
            operator = "";
            firstOperand = model.getResultat();
        }
    }

    /**
     * Gère le clic sur le bouton "C" pour réinitialiser la calculatrice.
     */
    public void handleClear(MouseEvent mouseEvent) {
        currentInput = "";
        operator = "";
        firstOperand = 0;
        display.setText("0");
    }
}
