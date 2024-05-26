/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.DBUtils;

/**
 * FXML Controller class
 *
 * @author DAMIANA
 */
public class SingUp_Oyente implements Initializable {

    @FXML
    private Button BtRegistrarse;
    @FXML
    private TextField IngreseUsuario;
    @FXML
    private TextField IngreseContraseña;
    @FXML
    private Button Bt_inicio_sesion;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
   private void Registrarse(ActionEvent event) throws IOException {
    DBUtils dbUtils = new DBUtils(); 
    if (!IngreseUsuario.getText().trim().isEmpty() && !IngreseContraseña.getText().trim().isEmpty()) {
        boolean registroExitoso = dbUtils.singUpUser(event, IngreseUsuario.getText(), IngreseContraseña.getText());
        
        if (registroExitoso) {
            Stage currentStage = (Stage) BtRegistrarse.getScene().getWindow();
            currentStage.close();
        }
    } else {
        System.out.println("Please fill in all information");
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("Por favor ingrese sus datos");
        alert.show();  
    }
}

    @FXML
    private void Iniciar_Sesion(ActionEvent event) throws IOException {
        
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Login_Oyente.fxml"));
    Parent root = loader.load();
    Login_Oyente controller2 = loader.getController();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setScene(scene);
    stage.show(); 
    
    Stage currentStage = (Stage) Bt_inicio_sesion.getScene().getWindow();
    currentStage.close();
    
        
    }
    
}
