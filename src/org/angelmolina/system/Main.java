
package org.angelmolina.system;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hola mundo");
        launch(args);
    }

    @Override
    public void start(Stage  escenarioPrincipal) throws Exception {
        VBox raiz = new VBox();
        
        Scene escena = new Scene(raiz);
        
        escenarioPrincipal.setTitle("Calculadora de Angel");
        escenarioPrincipal.setScene(escena); 
        escenarioPrincipal.show();
        
        
    }
    
}
