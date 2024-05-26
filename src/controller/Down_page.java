/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;



/**
 * FXML Controller class
 *
 * @author DAMIANA
 */
public class Down_page implements Initializable {

      private viewExampleController mainController;
      
    private viewExampleController_1 mainController_1;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void A$AP_Page(MouseEvent event) {
        
        if (mainController != null) {
        mainController.ASAP_Page(event);
    }
        if (mainController_1 != null) {
        mainController_1.ASAP_Page(event);
    }
        
    }

    @FXML
    private void TOOL_page(MouseEvent event) {
        
        if (mainController != null) {
        mainController.TooL_page(event);
    }
        if (mainController_1 != null) {
        mainController_1.TooL_page(event);
    }
    }

    @FXML
    private void RHCP_Page(MouseEvent event) {
        
        if (mainController != null) {
        mainController.rhcp_Page(event);
    }
        if (mainController_1 != null) {
        mainController_1.rhcp_Page(event);
    }
    
    }

    @FXML
    private void TOP_page(MouseEvent event) {
        
    if (mainController != null) {
        mainController.ToP_page(event);
    }
        if (mainController_1 != null) {
        mainController_1.ToP_page(event);
    }
    
    }

    @FXML
    private void Kedrick_page(MouseEvent event) {
        
        if (mainController != null) {
        mainController.Ken_page(event);
    }
        if (mainController_1 != null) {
        mainController_1.Ken_page(event);
    }
    
    
    }

    @FXML
    private void Deftones_page(MouseEvent event) {
        
          if (mainController != null) {
        mainController.Deft_page(event);
    }
        if (mainController_1 != null) {
        mainController_1.Deft_page(event);
    }
    
    
    }

      @FXML
    private void Up_page(MouseEvent event) {
        
        if (mainController != null && mainController.ap != null) {
      
        BorderPane borderPane = mainController.bp;
      
        borderPane.setCenter(mainController.ap);
    } else {
       
        System.out.println("Error: No se puede acceder al controlador principal o al AnchorPane.");
    }
        
      
        if (mainController_1 != null && mainController_1.ap != null) {
      
        BorderPane borderPane = mainController_1.bp;
      
        borderPane.setCenter(mainController_1.ap);
    } else {
       
        System.out.println("Error: No se puede acceder al controlador principal o al AnchorPane.");
    }  
}
    
  
    
     public void setMainController(viewExampleController mainController) {
        this.mainController = mainController;
    }
    
    public void setMainController_1(viewExampleController_1 mainController_1) {
        this.mainController_1 = mainController_1;
    }

      @FXML
    private void Lisa_Page(MouseEvent event) {
          if (mainController != null) {
        mainController.Lisa_Page(event);
    }
        if (mainController_1 != null) {
        mainController_1.Lisa_Page(event);
    }
        
    }

      @FXML
    private void Mr_Morale(MouseEvent event) {
        
    if (mainController != null) {
        mainController.Mr_Morale(event);
    }
        if (mainController_1 != null) {
        mainController_1.Mr_Morale(event);
    }
        
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
    private void Lateralus(MouseEvent event) {
        
        if (mainController != null) {
        mainController.Lateralus(event);
    }
        if (mainController_1 != null) {
        mainController_1.Lateralus(event);
    }
        
    
    }

      @FXML
    private void Testing(MouseEvent event) {
        
        if (mainController != null) {
        mainController.Testing(event);
    }
        if (mainController_1 != null) {
        mainController_1.Testing(event);
    }
    }

    
        
    
}
