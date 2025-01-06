package fr.eseo.calculatrice;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;
import java.io.File;
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
    public void operation(int nombre1, int nombre2) {
        resultat = nombre1 + nombre2 ;
    }

    public void soustraction(int nombre1, int nombre2) {
        resultat = nombre1 - nombre2;
    }

    public void multiplication(int nombre1, int nombre2) {
        resultat = nombre1 * nombre2;
    }

    public  void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }


}
