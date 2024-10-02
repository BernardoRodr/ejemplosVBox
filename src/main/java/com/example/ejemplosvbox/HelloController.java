package com.example.ejemplosvbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private VBox dynamicVBox;

    private int labelCount = 0;

    // Método para añadir un nuevo Label al VBox dinámico
    @FXML
    public void addLabel(ActionEvent actionEvent) {
        Label newLabel = new Label("Nuevo Label " + (++labelCount));
        dynamicVBox.getChildren().add(newLabel);
    }

    // Método para limpiar el VBox dinámico
    @FXML
    public void clearVBox(ActionEvent actionEvent) {
        dynamicVBox.getChildren().clear();
        labelCount = 0;
    }

    // Método para aumentar el espaciado del VBox
    @FXML
    public void increaseSpacing(ActionEvent actionEvent) {
        dynamicVBox.setSpacing(dynamicVBox.getSpacing() + 5);
    }

    // Método para disminuir el espaciado del VBox
    @FXML
    public void decreaseSpacing(ActionEvent actionEvent) {
        if (dynamicVBox.getSpacing() > 5) {
            dynamicVBox.setSpacing(dynamicVBox.getSpacing() - 5);
        }
    }
}
