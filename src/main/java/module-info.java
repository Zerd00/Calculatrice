module fr.eseo.calculatrice {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.eseo.calculatrice to javafx.fxml;
    exports fr.eseo.calculatrice;
}