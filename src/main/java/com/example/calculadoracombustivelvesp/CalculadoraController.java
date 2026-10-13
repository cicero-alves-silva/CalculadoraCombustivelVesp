package com.example.calculadoracombustivelvesp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculadoraController {

    @FXML
    private Label lbResultado;

    @FXML
    private TextField tfValorAlcool;

    @FXML
    private TextField tfValorGasolina;

    @FXML
    void compararPrecos(ActionEvent event) {
        String precoAlcoolString = tfValorAlcool.getText();
        String precoGasolinaString = tfValorGasolina.getText();
        if (precoAlcoolString.isBlank() || precoGasolinaString.isBlank()) {
            lbResultado.setText("Digite os preços antes de calcular.");
        } else {
            double precoAlcool = Double.parseDouble(precoAlcoolString);
            double precoGasolina = Double.parseDouble(precoGasolinaString);
        }
    }

}
