/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author DAMIANA
 */
public class Artistas implements Initializable {

      
    private viewExampleController_1 mainController_1;
    

    
    public void setMainController_1(viewExampleController_1 mainController_1) {
        this.mainController_1 = mainController_1;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void A$AP_Page(MouseEvent event) {

        if (mainController_1 != null) {
        mainController_1.ASAP_Page(event);
    }
        
    }

    @FXML
    private void TOOL_page(MouseEvent event) {
        

        if (mainController_1 != null) {
        mainController_1.TooL_page(event);
    }
    }

    @FXML
    private void RHCP_Page(MouseEvent event) {

        if (mainController_1 != null) {
        mainController_1.rhcp_Page(event);
    }
    
    }

    @FXML
    private void TOP_page(MouseEvent event) {
        

        if (mainController_1 != null) {
        mainController_1.ToP_page(event);
    }
    
    }

    @FXML
    private void Kedrick_page(MouseEvent event) {
        

        if (mainController_1 != null) {
        mainController_1.Ken_page(event);
    }
    
    
    }

    @FXML
    private void Deftones_page(MouseEvent event) {
        

        if (mainController_1 != null) {
        mainController_1.Deft_page(event);
    }
    
    
    }

    @FXML
    private void Future(MouseEvent event) {
        
        if (mainController_1 != null) {
        mainController_1.Future(event);
    }
        
    }

    @FXML
    private void Metro(MouseEvent event) {
        
        if (mainController_1 != null) {
        mainController_1.Metro(event);
    }
        
    }

    @FXML
    private void Michael(MouseEvent event) {
        
        if (mainController_1 != null) {
        mainController_1.Michael(event);
    }
        
        
    }
    
}
