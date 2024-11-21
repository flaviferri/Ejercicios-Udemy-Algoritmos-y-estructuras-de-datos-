module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens Flaviaf.algoritmosEstructuradeDatos.arrayStringHashTable to javafx.fxml;
    exports Flaviaf.algoritmosEstructuradeDatos.arrayStringHashTable;
}