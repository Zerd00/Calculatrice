module fr.eseo.calculatrice {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens fr.eseo.calculatrice to javafx.fxml;
    exports fr.eseo.calculatrice;
}