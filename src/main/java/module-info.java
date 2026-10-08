module com.example.calculadoracombustivelvesp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculadoracombustivelvesp to javafx.fxml;
    exports com.example.calculadoracombustivelvesp;
}