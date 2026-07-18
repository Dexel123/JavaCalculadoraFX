package org.angelmolina.view;
 
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import org.angelmolina.controller.CalculadoraController;
 
public class CalculadoraView {
    private VBox view; 
    private Label pantalla; 
    private GridPane cuadroBotones; 
    //controller
    private CalculadoraController Controlador; 
    public CalculadoraView() {
        Controlador = new CalculadoraController(); 
        
        view = new VBox(15); 
        view.setPadding(new Insets(15)); 
        view.setAlignment(Pos.CENTER);
        view.setStyle("-fx-background-color: #202020;"); 
        
        pantalla = new Label("0"); 
        pantalla.setFont(Font.font("Consolas", FontWeight.BOLD, 50));
        pantalla.setAlignment(Pos.CENTER_RIGHT); 
        pantalla.setPrefSize(260, 55); 
        pantalla.setStyle("-fx-background-color: #202020; -fx-text-fill:white;"); 
        
        cuadroBotones = new GridPane(); 
        cuadroBotones.setHgap(5);//INTERLINEADO ENTRE ELEMENTOS DE LA CUADRICULA
        cuadroBotones.setVgap(5);
        cuadroBotones.setAlignment(Pos.CENTER);// ALINEADO AL CENTRO
        
        
        //Quinta Fila
        Button btnRaiz = crearBoton("√");
        
        
         btnRaiz.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radius:5px; -fx-cursor: hand;");
         btnRaiz.setOnMousePressed(e -> {
              btnRaiz.setStyle("-fx-background-color: " + "#A1B6C3"+ "; -fx-text-fill:black; -ft-background-radops:5px; -fx-cursor: hand;");
              btnRaiz.setTranslateY(2);
        });
          btnRaiz.setOnMouseReleased(e -> {
            btnRaiz.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radops:5px; -fx-cursor: hand;");
         btnRaiz.setTranslateY(0);
            });
         
          
          
         //----------------------POTENCIA--------------
        Button btnPotencia = crearBoton("x²");
        
       btnPotencia.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radius:5px; -fx-cursor: hand;");
        btnPotencia.setOnMousePressed(e -> {
             btnPotencia.setStyle("-fx-background-color: " + "#A1B6C3"+ "; -fx-text-fill:black; -ft-background-radops:5px; -fx-cursor: hand;");
             btnPotencia.setTranslateY(2);
        });
          btnPotencia.setOnMouseReleased(e -> {
             btnPotencia.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radops:5px; -fx-cursor: hand;");
         btnPotencia.setTranslateY(0);
            });
         
         
         //---------------ELIMINAR----
        Button btnEliminar = crearBoton("⌫");
        
           btnEliminar.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radius:5px; -fx-cursor: hand;");
         btnEliminar.setOnMousePressed(e -> {
              btnEliminar.setStyle("-fx-background-color: " + "#A1B6C3"+ "; -fx-text-fill:black; -ft-background-radops:5px; -fx-cursor: hand;");
             btnEliminar.setTranslateY(2);
        });
         btnEliminar.setOnMouseReleased(e -> {
             btnEliminar.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radops:5px; -fx-cursor: hand;");
        btnEliminar.setTranslateY(0);
            });
         
          //------------DIVISION------
        Button btnDivision = crearBoton ("÷");
        
            btnDivision.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radius:5px; -fx-cursor: hand;");
          btnDivision.setOnMousePressed(e -> {
              btnDivision.setStyle("-fx-background-color: " + "#A1B6C3"+ "; -fx-text-fill:black; -ft-background-radops:5px; -fx-cursor: hand;");
               btnDivision.setTranslateY(2);
        });
           btnDivision.setOnMouseReleased(e -> {
             btnDivision.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radops:5px; -fx-cursor: hand;");
         btnDivision.setTranslateY(0);
            });
         
         
        //Cuarta Fila
        Button btnCuatro = crearBoton("4");
        Button btnCinco = crearBoton("5");
        Button btnSeis = crearBoton("6");
        
        
        
        
        //----------MENOS------
        Button btnMenos = crearBoton("-");
        
        btnMenos.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radius:5px; -fx-cursor: hand;");
         btnMenos.setOnMousePressed(e -> {
              btnMenos.setStyle("-fx-background-color: " + "#A1B6C3"+ "; -fx-text-fill:black; -ft-background-radops:5px; -fx-cursor: hand;");
              btnMenos.setTranslateY(2);
        });
          btnMenos.setOnMouseReleased(e -> {
             btnMenos.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radops:5px; -fx-cursor: hand;");
         btnMenos.setTranslateY(0);
            });
         
         
        //Tercera Fila
        Button btnSiete = crearBoton("7");
        Button btnOcho = crearBoton("8");
        Button btnNueve = crearBoton("9");
        
        //-------------POR--------
        Button btnPor = crearBoton("*");
         
        btnPor.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radius:5px; -fx-cursor: hand;");
         btnPor.setOnMousePressed(e -> {
              btnPor.setStyle("-fx-background-color: " + "#A1B6C3"+ "; -fx-text-fill:black; -ft-background-radops:5px; -fx-cursor: hand;");
              btnPor.setTranslateY(2);
        });
           btnPor.setOnMouseReleased(e -> {
             btnPor.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radops:5px; -fx-cursor: hand;");
         btnPor.setTranslateY(0);
            });
         
         
        //Segunda Fila
        Button btnUno = crearBoton("1");
      
        Button btnDos = crearBoton("2");
        Button btnTres = crearBoton("3");
        
       //--------------MAS----------
        Button btnMas = crearBoton("+");
        
        btnMas.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radius:5px; -fx-cursor: hand;");
         btnMas.setOnMousePressed(e -> {
               btnMas.setStyle("-fx-background-color: " + "#A1B6C3"+ "; -fx-text-fill:black; -ft-background-radops:5px; -fx-cursor: hand;");
              btnMas.setTranslateY(2);
        });
            btnMas.setOnMouseReleased(e -> {
              btnMas.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radops:5px; -fx-cursor: hand;");
         btnMas.setTranslateY(0);
            });
         
        //Primera Fila
        Button btnCero = crearBoton("0");
        
        
        //------------------------porcentaje------------
        Button btnPorcentaje = crearBoton("%");
        
         btnPorcentaje.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radius:5px; -fx-cursor: hand;");
          btnPorcentaje.setOnMousePressed(e -> {
                btnPorcentaje.setStyle("-fx-background-color: " + "#A1B6C3"+ "; -fx-text-fill:black; -ft-background-radops:5px; -fx-cursor: hand;");
               btnPorcentaje.setTranslateY(2);
        });
             btnPorcentaje.setOnMouseReleased(e -> {
              btnPorcentaje.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radops:5px; -fx-cursor: hand;");
          btnPorcentaje.setTranslateY(0);
            });
        
        //----------------------CE--------------
        Button btnCe = crearBoton("CE");
        
         btnCe.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radius:5px; -fx-cursor: hand;");
         btnCe.setOnMousePressed(e -> {
               btnCe.setStyle("-fx-background-color: " + "#A1B6C3"+ "; -fx-text-fill:black; -ft-background-radops:5px; -fx-cursor: hand;");
              btnCe.setTranslateY(2);
        });
            btnCe.setOnMouseReleased(e -> {
             btnCe.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radops:5px; -fx-cursor: hand;");
          btnCe.setTranslateY(0);
            });
        
        
        //---------------------masmenos----------
        Button btnCamSig = crearBoton("+/-");
        
          btnCamSig.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radius:5px; -fx-cursor: hand;");
          btnCamSig.setOnMousePressed(e -> {
               btnCamSig.setStyle("-fx-background-color: " + "#A1B6C3"+ "; -fx-text-fill:black; -ft-background-radops:5px; -fx-cursor: hand;");
              btnCamSig.setTranslateY(2);
        });
             btnCamSig.setOnMouseReleased(e -> {
              btnCamSig.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radops:5px; -fx-cursor: hand;");
           btnCamSig.setTranslateY(0);
            });
        
        
        //------------------------PI------------
        Button btnPi = crearBoton("ℼ");
          btnPi.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radius:5px; -fx-cursor: hand;");
          btnPi.setOnMousePressed(e -> {
               btnPi.setStyle("-fx-background-color: " + "#A1B6C3"+ "; -fx-text-fill:black; -ft-background-radops:5px; -fx-cursor: hand;");
              btnPi.setTranslateY(2);
        });
              btnPi.setOnMouseReleased(e -> {
              btnPi.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radops:5px; -fx-cursor: hand;");
            btnPi.setTranslateY(0);
            });
        
        
        //---------------punto-------------------
        Button btnPunto = crearBoton(".");
         btnPunto.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radius:5px; -fx-cursor: hand;");
          btnPunto.setOnMousePressed(e -> {
               btnPunto.setStyle("-fx-background-color: " + "#A1B6C3"+ "; -fx-text-fill:black; -ft-background-radops:5px; -fx-cursor: hand;");
              btnPunto.setTranslateY(2);
        });
              btnPunto.setOnMouseReleased(e -> {
              btnPunto.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radops:5px; -fx-cursor: hand;");
            btnPunto.setTranslateY(0);
            });
         
         
         
         //---------------------igual------------------------
        Button btnIgual = crearBoton("=");
        btnIgual.setStyle("-fx-background-color: #00FFFF; -fx-text-fill:black; -ft-background-radius:5px; -fx-cursor: hand;");
        btnIgual.setOnMousePressed(e -> {
             btnIgual.setStyle("-fx-background-color: " + "#A1B6C3"+ "; -fx-text-fill:black; -ft-background-radops:5px; -fx-cursor: hand;");
             btnIgual.setTranslateY(2);
        });
            btnIgual.setOnMouseReleased(e -> {
            btnIgual.setStyle("-fx-background-color: #00FFFF; -fx-text-fill:black; -ft-background-radops:5px; -fx-cursor: hand;");
            btnIgual.setTranslateY(0);
            });
            
            
            
            //------------------Limpiar--------
        Button btnLimpiar = crearBoton ("C");
         btnLimpiar.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radius:5px; -fx-cursor: hand;");
         
             btnLimpiar.setOnMousePressed(e -> {
             btnLimpiar.setStyle("-fx-background-color: " + "#A1B6C3"+ "; -fx-text-fill:black; -ft-background-radops:5px; -fx-cursor: hand;");
             btnLimpiar.setTranslateY(2);
        });
            btnLimpiar.setOnMouseReleased(e -> {
            btnLimpiar.setStyle("-fx-background-color: #323232; -fx-text-fill:white; -ft-background-radops:5px; -fx-cursor: hand;");
            btnLimpiar.setTranslateY(0);
            });
       

        
        cuadroBotones.add(btnPotencia,1,1);
        cuadroBotones.add(btnLimpiar,1,0);
        cuadroBotones.add(btnRaiz,2,1);
        cuadroBotones.add(btnMenos,3,3);
        cuadroBotones.add(btnUno,0,4);
        cuadroBotones.add(btnDos,1,4);
        cuadroBotones.add(btnTres,2,4);
        cuadroBotones.add(btnCinco,1,3);
        cuadroBotones.add(btnCuatro,0,3);
        cuadroBotones.add(btnMas,3,4);
        cuadroBotones.add(btnSeis,2,3);
        cuadroBotones.add(btnPor,3,2);
        cuadroBotones.add(btnSiete,0,2);
        cuadroBotones.add(btnOcho,1,2);
        cuadroBotones.add(btnNueve,2,2);
        cuadroBotones.add(btnDivision,3,1);
        cuadroBotones.add(btnIgual,3,5);
        cuadroBotones.add(btnPunto,2,5);
        cuadroBotones.add(btnCero,1,5);
        cuadroBotones.add(btnEliminar,3,0);
        cuadroBotones.add(btnPorcentaje,0,1);
        cuadroBotones.add(btnCe,2,0);
        cuadroBotones.add(btnCamSig,0,5);
        cuadroBotones.add(btnPi,0,0);
        
        
       
        
        view.getChildren().addAll(pantalla, cuadroBotones); 
        }
                
    public VBox getView() {
        return view; 
        
        
    }
    
      public Button crearBoton(String texto){
        Button btn = new Button(texto);
        btn.setPrefSize(70, 50);
        
        btn.setStyle("-fx-background-color: #3b3b3b; -fx-text-fill:white; -ft-background-radius:5px; -fx-cursor: hand;");
 
        
        btn.setOnMousePressed(e -> {
        btn.setStyle("-fx-background-color: " + "#A1B6C3"+ "; -fx-text-fill:black; -ft-background-radops:5px; -fx-cursor: hand;");
        btn.setTranslateY(2);
        });
        btn.setOnMouseReleased(e -> {
            btn.setStyle("-fx-background-color: #3b3b3b; -fx-text-fill:white; -ft-background-radops:5px; -fx-cursor: hand;");
            btn.setTranslateY(0);
            
             
        });
         btn.setOnAction(e-> Controlador.procesoDeEntrada(texto, pantalla));
        return btn;
        
    }
      
      
    
}