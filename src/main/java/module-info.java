module fr.eseo.calculatrice {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.naming;


    opens fr.eseo.calculatrice to javafx.fxml;
    exports fr.eseo.calculatrice;
}