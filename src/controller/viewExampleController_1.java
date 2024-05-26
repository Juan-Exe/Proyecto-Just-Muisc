package controller;

import static controller.viewExampleController.mediaPlayer;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class viewExampleController_1 implements Initializable {

    @FXML
     BorderPane bp;
    @FXML
     AnchorPane ap;
    @FXML
    private Button Bt_albums;
    @FXML
    private Button Bt_art;
    @FXML
    private Button BT_Pls;
    @FXML
    private Button shuffleButton;
    @FXML
    private Button resetButton;
    @FXML
    private Button playButton;
    @FXML
    private Button nextButton;
    @FXML
    private Button bucleButton;
    @FXML
    private Slider volumeSlider;
    @FXML
    private ImageView SongIVW;
    @FXML
    private Label SongLabel;
    @FXML
    private Label AlbumLabel;
    @FXML
    private Button Logout_Button;
    
    //DECLARAR VOLUMESLIDER.........................................................
    
    private void handleVolumeChange() {
        
        double volume = volumeSlider.getValue() / 100.0;
        
        if (deftonesController != null) {
            deftonesController.setMediaPlayerVolume(volume);
        }
        if (thrillerController != null) {
        thrillerController.setMediaPlayerVolume(volume);
        }
        
        if (WDTY_1 != null) {
        WDTY_1 .setMediaPlayerVolume(volume);
        
        }
        
        if (WDTY_2 != null) {
        WDTY_2 .setMediaPlayerVolume(volume);
        
        }
        
        if (Lis != null) {
        Lis.setMediaPlayerVolume(volume);
        }
        
        if (KNY != null) {
        KNY.setMediaPlayerVolume(volume);
       
        }
        
        if (damn != null) {
        damn.setMediaPlayerVolume(volume);
       
        }
        
        if (mr != null) {
        mr.setMediaPlayerVolume(volume);
       
        }
        
        if (trench != null) {
              trench.setMediaPlayerVolume(volume);
       
        }
        
        if (Blurry != null) {
              Blurry.setMediaPlayerVolume(volume);
       
        }
        
        if (TGA != null) {
              TGA.setMediaPlayerVolume(volume);
       
        }
        
        if (Cali != null) {
              Cali.setMediaPlayerVolume(volume);
       
        }
        
        if (dayz != null) {
              dayz.setMediaPlayerVolume(volume);
       
        }
        
        if (Lat != null) {
              Lat.setMediaPlayerVolume(volume);
       
        }
        
        if (test != null) {
              test.setMediaPlayerVolume(volume);
       
        }
        
        if (lon != null) {
              lon.setMediaPlayerVolume(volume);
       
        }
    }
    
    private Metro_Controller metro;
           
    private Future_Controller futu;
    
    private Michael_Controller mic;       
            
    private Albumes_Controller alb;
    
    private Playlist_Controller Play;
    
    private Artistas art;
    
    private Testing_Controller test;
    
    private L_L_A_Controller lon;
    
    private Logout_Controller logout;
    
    private Deftones_White_Pony_Controller deftonesController;
    
    private Damn_Controller damn;
 
    private Mr_Morale_Controller mr;
    
    private Trench_Controller trench;
    
    private Days_Controller dayz;
            
    private Lateralus_Controller Lat;       
    
    private Blurryface_Controller Blurry;
    
    private Deftones_Koi_No_Yokan_Controller KNY;
    
    private Thriller_Controller thrillerController;
    
    private WDTY_Controller_1 WDTY_1;
    
    private WDTY_Controller_2 WDTY_2;
    
    private Lisa_Page Lis;
    
    private The_Getaway_Controller TGA;
            
    private Californication_Controller Cali;
            
    private ASAP_Page_Controller Sap;
    
    private Deftones_Page_Controller Deft;
    
    private Kendrick_Lamar_Page_Controller Kend;
    
    private Tool_Page_Controller tool;
    
    private RHCP_Page_Controller red;
    
    private TOP_Page_Controller top;
    
    private Down_page DP;
    
    private viewExampleController_1 mainController_1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
        //INICIALIZAR VOLUMESLIDER......................................................
        
          volumeSlider.valueProperty().addListener(new ChangeListener<Number>() {
              
        @Override
        
        public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
            double volume = newValue.doubleValue() / 100.0;
            
            if (deftonesController != null) {
                deftonesController.setMediaPlayerVolume(volume);
            }
            if (thrillerController != null) {
                thrillerController.setMediaPlayerVolume(volume);
            }
            if (WDTY_1 != null) {
                WDTY_1.setMediaPlayerVolume(volume);
            }
            
             if (WDTY_2 != null) {
                WDTY_2.setMediaPlayerVolume(volume);
            }
             if (Lis != null) {
                Lis.setMediaPlayerVolume(volume);
            }
              if (KNY != null) {
                KNY.setMediaPlayerVolume(volume);
            }
              if (damn != null) {
              damn.setMediaPlayerVolume(volume);
            }
              if (mr != null) {
              mr.setMediaPlayerVolume(volume);
       
        }
              if (trench != null) {
              trench.setMediaPlayerVolume(volume);
       
        }
              if (Blurry != null) {
              Blurry.setMediaPlayerVolume(volume);
       
        }
              if (TGA != null) {
              TGA.setMediaPlayerVolume(volume);
       
        }
        
              if (Cali != null) {
              Cali.setMediaPlayerVolume(volume);
       
        }
              if (dayz != null) {
              dayz.setMediaPlayerVolume(volume);
       
        }
        
        if (Lat != null) {
              Lat.setMediaPlayerVolume(volume);
       
        }
        
        if (test != null) {
              test.setMediaPlayerVolume(volume);
       
        }
        
        if (lon != null) {
              lon.setMediaPlayerVolume(volume);
       
        }
        
              
        }
        
    });

    
    }

    //CONFIGURACION DE CAMBIO DE PAGINA.............................................    
    
    void loadPage(String page) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/view/" + page + ".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(viewExampleController.class.getName()).log(Level.SEVERE, null, ex);
        }
        bp.setCenter(root);
    }
    
    //ACCIONES...................................................................... 
   
    public ImageView getSongImageView() {
        return SongIVW;
    }

    public static void setMediaPlayer(MediaPlayer player) {
        mediaPlayer = player;
    }

    @FXML
    private void Escuchar_Page(MouseEvent event) {
        System.out.println("Se ha accedido a la página: Inicial"); 
        bp.setCenter(ap);
    }
    
    
    @FXML
    private void Deftones_White_Pony_Page(MouseEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Deftones_White_Pony_Page.fxml"));
        Parent root = loader.load();
        deftonesController = loader.getController();
        if (deftonesController != null) {
            deftonesController.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Deftones_White_Pony_Page"); // Agregar esta línea
        } else {
            System.out.println("No se pudo obtener el controlador de Deftones White Pony.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
     void Koi_No_Yokan(MouseEvent event) {
   try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Deftones_Koi_No_Yokan_Page_.fxml"));
        Parent root = loader.load();
        KNY = loader.getController();
        if (KNY != null) {
            KNY.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Deftones_White_Pony_Page");
        } else {
            System.out.println("No se pudo obtener el controlador de Deftones White Pony.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
    void White_Pony_Page(MouseEvent event) {
   try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Deftones_White_Pony_Page.fxml"));
        Parent root = loader.load();
        deftonesController = loader.getController();
        if (deftonesController != null) {
            deftonesController.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Deftones_White_Pony_Page"); // Agregar esta línea
        } else {
            System.out.println("No se pudo obtener el controlador de Deftones White Pony.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    

    @FXML
    private void Thriller_Page(MouseEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Thriller_Page.fxml"));
        Parent root = loader.load();
        thrillerController = loader.getController();
        if (thrillerController != null) {
            thrillerController.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Thriller_Page"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Thriller.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    }
    
    void Thriller(MouseEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Thriller_Page.fxml"));
        Parent root = loader.load();
        thrillerController = loader.getController();
        if (thrillerController != null) {
            thrillerController.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Thriller_Page"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Thriller.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    }

    @FXML
    private void WDTY_Page(MouseEvent event) {
         try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/WDTY_Page.fxml"));
        Parent root = loader.load();
        WDTY_1 = loader.getController();
        if (WDTY_1 != null) {
            WDTY_1.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: WDTY_Page"); 
        } else {
            System.out.println("No se pudo obtener el controlador de WDTY.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    }
    
     void WDTY_Page_2(MouseEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/WDTY_Page_2.fxml"));
        Parent root = loader.load();
        WDTY_2 = loader.getController();
        if (WDTY_2 != null) {
            WDTY_2.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: WDTY_Page_2"); 
        } else {
            System.out.println("No se pudo obtener el controlador de WDTY.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
        
}
    
    void WDTY_Page_1(MouseEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/WDTY_Page.fxml"));
        Parent root = loader.load();
        WDTY_1 = loader.getController();
        if (WDTY_1 != null) {
            WDTY_1.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: WDTY_Page_1"); 
        } else {
            System.out.println("No se pudo obtener el controlador de WDTY.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
    void Lisa_Page(MouseEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Lisa_Page.fxml"));
        Parent root = loader.load();
        Lis = loader.getController();
        if (Lis != null) {
            Lis.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Lisa"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Lisa.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    @FXML
    private void A$AP_Page(MouseEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Page_Asap.fxml"));
        Parent root = loader.load();
        Sap = loader.getController();
        if (Sap != null) {
            Sap.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
    void Testing(MouseEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Asap_Rocky_Testing.fxml"));
        Parent root = loader.load();
        test = loader.getController();
        if (test != null) {
            test.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
    void Long(MouseEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Asap_Rocky_L_L_A.fxml"));
        Parent root = loader.load();
        lon = loader.getController();
        if (lon != null) {
            lon.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
     void ASAP_Page(MouseEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Page_Asap.fxml"));
        Parent root = loader.load();
        Sap = loader.getController();
        if (Sap != null) {
            Sap.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
    @FXML
    private void TOOL_page(MouseEvent event) {
         try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Page_Tool.fxml"));
        Parent root = loader.load();
        tool = loader.getController();
        if (tool != null) {
            tool.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    }
    
    void TooL_page(MouseEvent event) {
        
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Page_Tool.fxml"));
        Parent root = loader.load();
        tool = loader.getController();
        if (tool != null) {
            tool.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    }
    
    void Lateralus(MouseEvent event) {
        
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Tool_Lateralus.fxml"));
        Parent root = loader.load();
        Lat = loader.getController();
        if (Lat != null) {
            Lat.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    }
    
    void Days(MouseEvent event) {
        
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Tool_10_000_Days.fxml"));
        Parent root = loader.load();
        dayz = loader.getController();
        if (dayz != null) {
            dayz.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    }

    @FXML
    private void RHCP_Page(MouseEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Page_RHCP.fxml"));
        Parent root = loader.load();
        red = loader.getController();
        if (red != null) {
            red.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    
    }
    
        void The_Getaway(MouseEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/RHCP_The_Getaway.fxml"));
        Parent root = loader.load();
        TGA = loader.getController();
        if (TGA != null) {
            TGA.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    
    }
    
    void California(MouseEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/RHCP_Californication.fxml"));
        Parent root = loader.load();
        Cali = loader.getController();
        if (Cali != null) {
            Cali.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    
    }
    
    void rhcp_Page(MouseEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Page_RHCP.fxml"));
        Parent root = loader.load();
        red = loader.getController();
        if (red != null) {
            red.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    
    }

    @FXML
    private void TOP_page(MouseEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Page_TOP.fxml"));
        Parent root = loader.load();
        top = loader.getController();
        if (top != null) {
            top.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    
    }
    
    void Trench(MouseEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/TOP_Trench.fxml"));
        Parent root = loader.load();
        trench = loader.getController();
        if (trench != null) {
            trench.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    
    }
    
    void Blurryface(MouseEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/TOP_Blurryface.fxml"));
        Parent root = loader.load();
        Blurry = loader.getController();
        if (Blurry != null) {
            Blurry.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    
    }
    
    void ToP_page(MouseEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Page_TOP.fxml"));
        Parent root = loader.load();
        top = loader.getController();
        if (top != null) {
            top.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    
    }

    @FXML
    private void Kedrick_page(MouseEvent event) {
        
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Page_Kendrick_Lamar.fxml"));
        Parent root = loader.load();
        Kend = loader.getController();
        if (Kend != null) {
            Kend.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
    void Ken_page(MouseEvent event) {
        
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Page_Kendrick_Lamar.fxml"));
        Parent root = loader.load();
        Kend = loader.getController();
        if (Kend != null) {
            Kend.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
    void Damn(MouseEvent event) {
        
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Kendrick_Damn.fxml"));
        Parent root = loader.load();
        damn = loader.getController();
        if (damn != null) {
            damn.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
    
     void Mr_Morale(MouseEvent event) {
        
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Kendrick_Mr_Morale.fxml"));
        Parent root = loader.load();
        mr = loader.getController();
        if (mr != null) {
            mr.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

   @FXML
    private void Deftones_page(MouseEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Page_Deftones.fxml"));
        Parent root = loader.load();
        Deft = loader.getController();
        if (Deft != null) {
            Deft.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    }

    void Deft_page(MouseEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Page_Deftones.fxml"));
        Parent root = loader.load();
        Deft = loader.getController();
        if (Deft != null) {
            Deft.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Asap"); 
        } else {
            System.out.println("No se pudo obtener el controlador de Asap.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    }

    @FXML
    private void Down_page(MouseEvent event) {
      try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Down_page.fxml"));
        Parent root = loader.load();
        DP = loader.getController();
        if (DP != null) {
            DP.setMainController_1(this); 
            bp.setCenter(root);
        } else {
            System.out.println("No se pudo obtener el controlador de WDTY.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
  
    }


     @FXML
    private void Page_Ab(ActionEvent event) {  
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Albumes .fxml"));
        Parent root = loader.load();
        alb = loader.getController();
        if (alb != null) {
            alb.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Deftones_White_Pony_Page");
        } else {
            System.out.println("No se pudo obtener el controlador de Deftones White Pony.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

   

    @FXML
    private void Page_Art(ActionEvent event) {
        
           try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Artistas .fxml"));
        Parent root = loader.load();
        art = loader.getController();
        if (art != null) {
            art.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Deftones_White_Pony_Page");
        } else {
            System.out.println("No se pudo obtener el controlador de Deftones White Pony.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
     void Future(MouseEvent event) {
        
           try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Page_Future.fxml"));
        Parent root = loader.load();
        futu = loader.getController();
        if (futu != null) {
            futu.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Deftones_White_Pony_Page");
        } else {
            System.out.println("No se pudo obtener el controlador de Deftones White Pony.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
     void Metro(MouseEvent event) {
        
           try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Page_Metro.fxml"));
        Parent root = loader.load();
        metro = loader.getController();
        if (metro != null) {
            metro.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Deftones_White_Pony_Page");
        } else {
            System.out.println("No se pudo obtener el controlador de Deftones White Pony.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
     
     void Michael(MouseEvent event) {
        
           try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Page_Michael.fxml"));
        Parent root = loader.load();
        mic = loader.getController();
        if (mic != null) {
            mic.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Deftones_White_Pony_Page");
        } else {
            System.out.println("No se pudo obtener el controlador de Deftones White Pony.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    

    @FXML
    private void Page_plast(ActionEvent event) {
        
     try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Playlist.fxml"));
        Parent root = loader.load();
        Play = loader.getController();
        if (Play != null) {
            Play.setMainController_1(this); 
            bp.setCenter(root);
            System.out.println("Se ha accedido a la página: Deftones_White_Pony_Page");
        } else {
            System.out.println("No se pudo obtener el controlador de Deftones White Pony.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    //CONTROLREPRODUCTOR............................................................

    @FXML
    private void shuffleMedia(ActionEvent event) {
        
         if (deftonesController != null) {
        String randomSong = deftonesController.toggleRandomMode();
    }
         if (thrillerController != null) {
        String randomSong = thrillerController.toggleRandomMode();
    
    }
         
         if (WDTY_1 != null) {
        String randomSong = WDTY_1.toggleRandomMode();
         
    }
         if (WDTY_2 != null) {
        String randomSong = WDTY_2.toggleRandomMode();
        }
         
        if (Lis != null) {
        String randomSong = Lis.toggleRandomMode();
        }
        
        if (KNY != null) {
        String randomSong = KNY.toggleRandomMode();
        }
        
        if (damn != null) {
        String randomSong = damn.toggleRandomMode();
        }
        
        if (mr != null) {
        String randomSong = mr.toggleRandomMode();
        }
        
        if (trench != null) {
        String randomSong = trench.toggleRandomMode();
        }
        
        if (Blurry != null) {
        String randomSong = Blurry.toggleRandomMode();
        }
        
        if (TGA != null) {
        String randomSong = TGA.toggleRandomMode();
        }
        
        if (Cali != null) {
        String randomSong = Cali.toggleRandomMode();
        }
        
        if (dayz != null) {
        String randomSong = dayz.toggleRandomMode();
        }
        
        if (Lat != null) {
        String randomSong = Lat.toggleRandomMode();
        }
        
        if (test != null) {
        String randomSong = test.toggleRandomMode();
        }
        
        if (lon != null) {
        String randomSong = lon.toggleRandomMode();
        }
    }

    @FXML
    private void resetMedia(ActionEvent event) {
        
         if (deftonesController != null) {
        deftonesController.playPreviousSong();
         
    }
    
         if (thrillerController != null) {
        thrillerController.playPreviousSong();
   
    }   
         
         if (WDTY_1 != null) {
        WDTY_1.playPreviousSong();
         }
    
        
        if (WDTY_2 != null) {
        WDTY_2.playPreviousSong();
  
    }
        if (Lis != null) {
        Lis.playPreviousSong();
        } 
        
        if (KNY != null) {
        KNY.playPreviousSong();
        }
        
        if (damn != null) {
        damn.playPreviousSong();
        }
        
        if (mr != null) {
        mr.playPreviousSong();
        }
        
        if (trench != null) {
        trench.playPreviousSong();
        }
        
        if (Blurry != null) {
        Blurry.playPreviousSong();
        }
        
        if (TGA != null) {
        TGA.playPreviousSong();
        }
        
        if (Cali != null) {
        Cali.playPreviousSong();
        }
        
         if (dayz != null) {
        dayz.playPreviousSong();
        }
        
        if (Lat != null) {
        Lat.playPreviousSong();
        }
        
        if (test != null) {
        test.playPreviousSong();
        }
        
        if (lon != null) {
        lon.playPreviousSong();
        }
  
         
}
    
    @FXML
    private void play_pauseMedia(ActionEvent event) {
      
         if (deftonesController != null) {
        deftonesController.playOrPause();
   
    }
     
         if (thrillerController != null) {
        thrillerController.playOrPause();
    
    }
         
         if (WDTY_1 != null) {
        WDTY_1.playOrPause();
   
    }
    
         if (WDTY_2 != null) {
        WDTY_2.playOrPause();
   
    }
         if (Lis != null) {
        Lis.playOrPause();
        } 
         
         if (KNY != null) {
        KNY.playOrPause();
        }
         
        if (damn != null) {
        damn.playOrPause();
        }
        
        if (mr != null) {
        mr.playOrPause();
        }
        
        if (trench != null) {
        trench.playOrPause();
        }
        
        if (Blurry != null) {
        Blurry.playOrPause();
        }
        
        if (TGA != null) {
        TGA.playOrPause();
        }
        
        if (Cali != null) {
        Cali.playOrPause();
        }
        
        if (Lat != null) {
        Lat.playOrPause();
        }
        
        if (dayz != null) {
        dayz.playOrPause();
        }
        
        if (test != null) {
        test.playOrPause();
        }
        
        if (lon != null) {
        lon.playOrPause();
        }
         
}

    @FXML
    private void NextMedia(ActionEvent event) {
        
         if (deftonesController != null) {
        deftonesController.playNextSong();
   
    }
    
         if (thrillerController != null) {
        thrillerController.playNextSong();
    
    }
         
         if (WDTY_1 != null) {
        WDTY_1.playNextSong();

    }
         
         if (WDTY_2 != null) {
        WDTY_2.playNextSong();

    }
         if (Lis != null) {
        Lis.playNextSong();
        } 
         
         if (KNY != null) {
        KNY.playNextSong();
        }
         if (damn != null) {
        damn.playNextSong();
        }
         
         if (mr != null) {
        mr.playNextSong();
        }
         
         if (trench != null) {
        trench.playNextSong();
        }
         
         if (Blurry != null) {
        Blurry.playNextSong();
        }
         
         if (TGA != null) {
        TGA.playNextSong();
        }
        
        if (Cali != null) {
        Cali.playNextSong();
        }
        
        if (Lat != null) {
        Lat.playNextSong();
        }
        
        if (dayz != null) {
        dayz.playNextSong();
        }
        
        if (test != null) {
        test.playNextSong();
        }
        
        if (lon != null) {
        lon.playNextSong();
        }
}

    @FXML
    private void bucleMedia(ActionEvent event) {
        
         if (deftonesController != null) {
        deftonesController.toggleLoopMode();

    }
    
         if (thrillerController != null) {
        thrillerController.toggleLoopMode();
 
    }
         
         if (WDTY_1 != null) {
        WDTY_1.toggleLoopMode();
   
    }
    
         if (WDTY_2 != null) {
        WDTY_2.toggleLoopMode();
    
    }
         if (Lis != null) {
        Lis.toggleLoopMode();
        } 
         if (KNY != null) {
        KNY.toggleLoopMode();
        } 
         
         if (damn != null) {
        damn.toggleLoopMode();
        } 
         
         if (mr != null) {
        mr.toggleLoopMode();
        }
         
         if (trench != null) {
        trench.toggleLoopMode();
        }
         
         if (Blurry != null) {
        Blurry.toggleLoopMode();
        }
         
         if (TGA != null) {
        TGA.toggleLoopMode();
        }
        
        if (Cali != null) {
        Cali.toggleLoopMode();
        }
        
        if (Lat != null) {
        Lat.toggleLoopMode();
        }
        
        if (dayz != null) {
        dayz.toggleLoopMode();
        }
        
        if (test != null) {
        test.toggleLoopMode();
        }
        
        if (lon != null) {
        lon.toggleLoopMode();
        }
    }
    
     public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }
     
       public void setMainController_1(viewExampleController_1 mainController_1) {
        this.mainController_1 = mainController_1;
        
       }

    public void setSongLabel(String songName) {
        SongLabel.setText(songName);
    }
    
    public void setAlbumLabel(String albumName) {
        AlbumLabel.setText(albumName);
    }

    @FXML
    private void Logout(MouseEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Logout.fxml"));
             Parent root = loader.load();
             Logout_Controller controller = loader.getController();
             Scene scene = new Scene(root);
             Stage stage = new Stage();
             stage.setScene(scene);
             stage.show();
             Stage currentStage = (Stage) Logout_Button.getScene().getWindow();
             currentStage.close();
             getMediaPlayer().stop();
    }
        
    
    
        
}