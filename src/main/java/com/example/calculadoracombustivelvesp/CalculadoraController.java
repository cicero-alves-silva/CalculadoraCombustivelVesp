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
        String precoAlcoolString = tfValorAlcool.getText().replace(",", ".");
        String precoGasolinaString = tfValorGasolina.getText().replace(",", ".");
        if (precoAlcoolString.isBlank() || precoGasolinaString.isBlank()) {
            lbResultado.setText("Digite os preços antes de calcular.");
        } else {
            try {
                double precoAlcool = Double.parseDouble(precoAlcoolString);
                double precoGasolina = Double.parseDouble(precoGasolinaString);
                if (precoAlcool <= 0 || precoGasolina <= 0) {
                    lbResultado.setText("Digite apenas valores maiores" +
                            " que zero para os preços.");
                } else if ((precoAlcool / precoGasolina) > 0.7) {
                    lbResultado.setText("Abasteça com Gasolina.");
                } else {
                    lbResultado.setText("Abasteça com Álcool.");
                }
            } catch (NumberFormatException nfe) {
                lbResultado.setText("Digite apenas valores " +
                        "numéricos para os preços.");
            }
        }
    }

}
