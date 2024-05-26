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
public class TOP_Page_Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
   private viewExampleController mainController;
      
    private viewExampleController_1 mainController_1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
         public void setMainController(viewExampleController mainController) {
        this.mainController = mainController;
    }
    
    public void setMainController_1(viewExampleController_1 mainController_1) {
        this.mainController_1 = mainController_1;
    }

    @FXML
    private void Trench(MouseEvent event) {
        
        if (mainController != null) {
        mainController.Trench(event);
    }
        if (mainController_1 != null) {
        mainController_1.Trench(event);
    }
    
    }

    @FXML
    private void Blurryface(MouseEvent event) {
        
         if (mainController != null) {
        mainController.Blurryface(event);
    }
        if (mainController_1 != null) {
        mainController_1.Blurryface(event);
    }
        
    }
}
