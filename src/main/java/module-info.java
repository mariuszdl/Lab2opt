module pl.lublin.wsei.java.cwiczenia.lab2opt {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.lublin.wsei.java.cwiczenia.lab2opt to javafx.fxml;
    exports pl.lublin.wsei.java.cwiczenia.lab2opt;
}