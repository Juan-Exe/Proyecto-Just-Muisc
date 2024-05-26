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
public class Albumes_Controller implements Initializable {
    
      
    private viewExampleController_1 mainController_1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void WDTY(MouseEvent event) {
        
        if (mainController_1 != null) {
        mainController_1.WDTY_Page_1(event);
    }
        
    }

    @FXML
    private void Damn(MouseEvent event) {
        
        if (mainController_1 != null) {
        mainController_1.Damn(event);
    }
    }

    @FXML
    private void Mr_Morale(MouseEvent event) {
        
         if (mainController_1 != null) {
        mainController_1.Mr_Morale(event);
    }
    }

    @FXML
    private void LLA(MouseEvent event) {
        
        if (mainController_1 != null) {
        mainController_1.Long(event);
    }
        
    }

    @FXML
    private void Testing(MouseEvent event) {
        
        if (mainController_1 != null) {
        mainController_1.Testing(event);
    }
        
    }

    @FXML
    private void Days(MouseEvent event) {
        
         if (mainController_1 != null) {
        mainController_1.Days(event);
    }
        
    }

    @FXML
    private void Blurryface(MouseEvent event) {
        
        if (mainController_1 != null) {
        mainController_1.Blurryface(event);
    }
    }

    @FXML
    private void The_Getaway(MouseEvent event) {
        
        if (mainController_1 != null) {
        mainController_1.The_Getaway(event);
    }
        
    }

    @FXML
    private void Koi_No_Yokan(MouseEvent event) {
        
        if (mainController_1 != null) {
        mainController_1.Koi_No_Yokan(event);
    }
        
    }

    @FXML
    private void Californication(MouseEvent event) {
        
        if (mainController_1 != null) {
        mainController_1.California(event);
    }
        
    }

    @FXML
    private void Thriller(MouseEvent event) {
        
        if (mainController_1 != null) {
        mainController_1.Thriller(event);
    }
    
        
    }

    @FXML
    private void Lisa(MouseEvent event) {
        
        if (mainController_1 != null) {
        mainController_1.Lisa_Page(event);
    }
        
    }
    

    
    public void setMainController_1(viewExampleController_1 mainController_1) {
        this.mainController_1 = mainController_1;
    }


}
