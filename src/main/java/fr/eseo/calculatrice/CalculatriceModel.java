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
    public void operation(int nombre1, int nombre2) {
        int resultat = this.resultat;
        this.resultat = nombre1 + nombre2  ;
        changeSupport.firePropertyChange("operation", resultat, this.resultat);


    }

    public void soustraction(int nombre1, int nombre2) {
        int resultat = this.resultat;
        this.resultat = nombre1 - nombre2;
        changeSupport.firePropertyChange("soustraction", resultat, this.resultat);

    }

    public void multiplication(int nombre1, int nombre2) {
        int resultat = this.resultat;
        this.resultat = nombre1 * nombre2;
        changeSupport.firePropertyChange("multiplication", resultat, this.resultat);

    }

    public  void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }


    @Override
    public String toString () {
        return String.valueOf(resultat);
    }

}
