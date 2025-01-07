package fr.eseo.calculatrice;

import javax.naming.PartialResultException;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.List;

public class CalculatriceModel {

    private int nombre1;
    private int nombre2;
    private int resultat;
    private final PropertyChangeSupport changeSupport;


    public CalculatriceModel() {
        this.nombre1 = 0;
        this.nombre2 = 0;
        this.changeSupport = new PropertyChangeSupport(this);
        this.resultat = 0;
    }

    public int getNombre1() {
        return nombre1;
    }
    public void setNombre1(int nombre1) {
        this.nombre1 = nombre1;
    }
    public int getNombre2() {
        return nombre2;
    }
    public void setNombre2(int nombre2) {
        this.nombre2 = nombre2;
    }

    public int getResultat() {
        return  resultat;
    }

    public void setResultat(int resultat) {
        this.resultat = resultat;
    }
    public void calculer(int nombre1, int nombre2, String operator) {
        int oldResultat = this.resultat;

        switch (operator) {
            case "+":
                this.resultat = nombre1 + nombre2;
                break;
            case "-":
                this.resultat = nombre1 - nombre2;
                break;
            case "*":
                this.resultat = nombre1 * nombre2;
                break;
            default:
                throw new IllegalArgumentException("Opérateur non pris en charge : " + operator);
        }
        changeSupport.firePropertyChange("resultat", oldResultat, this.resultat);
    }

    public  void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }
    public  void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }


    @Override
    public String toString () {
        return String.valueOf(resultat);
    }

}