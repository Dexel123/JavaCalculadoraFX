package org.angelmolina.view;
 
import java.util.Scanner;
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
    private CalculadoraController controlador;
    
    public CalculadoraView() {
        
        
        view = new VBox(15); 
        view.setPadding(new Insets(15)); 
        view.setAlignment(Pos.CENTER);
        view.setStyle("-fx-background-color: #b0d32a;"); 
        
        pantalla = new Label("0"); 
        pantalla.setFont(Font.font("Consolas", FontWeight.BOLD, 40));
        pantalla.setAlignment(Pos.CENTER_RIGHT); 
        pantalla.setPrefSize(235, 50); 
        
        cuadroBotones = new GridPane(); 
        cuadroBotones.setHgap(10);//INTERLINEADO ENTRE ELEMENTOS DE LA CUADRICULA
        cuadroBotones.setVgap(10);
        cuadroBotones.setAlignment(Pos.CENTER);// ALINEADO AL CENTRO
        
        
        //Quinta Fila
        Button btnRaiz = crearBoton("√");
        Button btnPotencia = crearBoton("x²");
        Button btnEliminar = crearBoton("⌫");
        Button btnDivision = crearBoton ("÷");
        //Cuarta Fila
        Button btnCuatro = crearBoton("4");
        Button btnCinco = crearBoton("5");
        Button btnSeis = crearBoton("6");
        Button btnMenos = crearBoton("-");
        //Tercera Fila
        Button btnSiete = crearBoton("7");
        Button btnOcho = crearBoton("8");
        Button btnNueve = crearBoton("9");
        Button btnPor = crearBoton("x");
        //Segunda Fila
        Button btnUno = crearBoton("1");
      
        Button btnDos = crearBoton("2");
        Button btnTres = crearBoton("3");
        Button btnMas = crearBoton("+");
        //Primera Fila
        Button btnCero = crearBoton("0");
        Button btnPunto = crearBoton(".");
        Button btnIgual = crearBoton("=");
        Button btnLimpiar = crearBoton ("C");

       

        
        cuadroBotones.add(btnPotencia,0,0);
        cuadroBotones.add(btnLimpiar,1,0);
        cuadroBotones.add(btnRaiz,2,0);
        cuadroBotones.add(btnMenos,3,3);
        cuadroBotones.add(btnUno,0,3);
        cuadroBotones.add(btnDos,1,3);
        cuadroBotones.add(btnTres,2,3);
        cuadroBotones.add(btnCinco,1,2);
        cuadroBotones.add(btnCuatro,0,2);
        cuadroBotones.add(btnMas,3,2);
        cuadroBotones.add(btnSeis,2,2);
        cuadroBotones.add(btnPor,3,1);
        cuadroBotones.add(btnSiete,0,1);
        cuadroBotones.add(btnOcho,1,1);
        cuadroBotones.add(btnNueve,2,1);
        cuadroBotones.add(btnDivision,3,0);
        cuadroBotones.add(btnIgual,3,4);
        cuadroBotones.add(btnPunto,2,4);
        cuadroBotones.add(btnCero,1,4);
        cuadroBotones.add(btnEliminar,0,4);
        
        
        
        view.getChildren().addAll(pantalla, cuadroBotones); 
    }
    public VBox getView() {
        return view; 
        
        
    }
    
      public Button crearBoton(String texto){
        Button btn = new Button(texto);
        btn.setPrefSize(50, 50);
        
        btn.setStyle("-fx-background-color: #6B8E23; -fx-text-fill:white; -ft-background-radius:5px; -fx-cursor: hand;");
 
        
        btn.setOnMousePressed(e -> {
        btn.setStyle("-fx-background-color: " + "#A1B6C3"+ "; -fx-text-fill:white; -ft-background-radops:5px");
        btn.setTranslateY(2);
        });
        btn.setOnMouseReleased(e -> {
            btn.setStyle("-fx-background-color: #6B8E23; -fx-text-fill:white; -ft-background-radops:5px");
            btn.setTranslateY(0);
            
             
        });
         btn.setOnAction(e-> controlador.procesoDeEntrada(texto, pantalla));
        return btn;
        
    }
      
      
    
}