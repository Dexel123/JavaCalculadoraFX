package org.angelmolina.controller;
 
import javafx.scene.control.Label;
 
public class CalculadoraController {
    private String opcion1 = "";
    private String operador = "";
    private String opcion2 = "";
    private boolean calculoTerminado = true;
    public CalculadoraController() {       
    }
    public void procesoDeEntrada(String entrada, Label pantalla) {
        if (entrada.equals("C")) {
            opcion1 = "";
            operador = "";
            opcion2 = "";
            pantalla.setText(""); 
        }
        
        if (entrada.equals("CE")) {
            if (!opcion2.isEmpty()) {
                opcion2 = ""; 
            } else {
                opcion1 = ""; 
            }
            actualizarPantalla(pantalla);
            return; 
        }
        
          
        if (entrada.equals("⌫") ) {   
            if (!opcion2.isEmpty()) {
                opcion2 = opcion2.substring(0, opcion2.length() - 1);
            }         
            else if (!operador.isEmpty()) {
                operador = "";
            }           
            else if (!opcion1.isEmpty()) {
                opcion1 = opcion1.substring(0, opcion1.length() - 1);
            }           
            actualizarPantalla(pantalla);
            return;
            
            
            
        }
        
        if (opcion1.equals("Error")) {
            opcion1 = "";
        }
        
        
        if (calculoTerminado &&( entrada.matches("[0-9]") || entrada.equals("."))){
            opcion1 = "";
            operador = "";
            opcion2 = "";
        }
        calculoTerminado = false;
        
        if  (entrada.matches("[0-9]") || entrada.equals(".")) {
            if (operador.isEmpty()) {
                
                if (entrada.equals(".")) {
                    if (opcion1.contains(".")) return;
                    if (opcion1.isEmpty()) opcion1 = "0"; 
                }
                opcion1 += entrada; 
            }else {
                 
                if (entrada.equals(".")) {
                    if (opcion2.contains(".")) return;
                    if (opcion2.isEmpty()) opcion2 = "0";
                }
                    
                opcion2 += entrada; 
            }

 
            actualizarPantalla(pantalla);   
    
        }else if(entrada.equals("+") || entrada.equals("-") || entrada.equals("*") || entrada.equals("÷")  || entrada.equals("x²") || entrada.equals("√") || entrada.equals("%")) {
            
            if (opcion1.isEmpty()) {
                return;
            }
            
           
            if (entrada.equals("x²")) {
                operador = "²";   
                
           } else if (entrada.equals("%")) {
                
                if (operador.isEmpty()) {
                    double num = Double.parseDouble(opcion1);
                    opcion1 = String.valueOf(num / 100);
                } else {
                    if (!opcion2.isEmpty()) {
                        double num1 = Double.parseDouble(opcion1);
                        double num2 = Double.parseDouble(opcion2);
                        if (operador.equals("+") || operador.equals("-")) {
                            opcion2 = String.valueOf((num1 * num2) / 100);
                        } else if (operador.equals("*") || operador.equals("÷")) {
                            opcion2 = String.valueOf(num2 / 100);
                        }
                    }
                }
            } else {
                
                operador = entrada;
            }
            actualizarPantalla(pantalla);        
        } else if(entrada.equals("=")) {
            if (operador.isEmpty()) return;
            if (opcion2.isEmpty() && !operador.equals("²") && !operador.equals("√")) return;
            
            try {
            if (operador.equals("+")) {                  
                opcion1 = resultadoSuma(opcion1, opcion2);  
                } else if (operador.equals("-")) {
            opcion1 = resultadoResta(opcion1, opcion2);
        
                } else if (operador.equals("*")) {
            opcion1 = resultadoMultiplicacion(opcion1, opcion2);
            
                } else if (operador.equals("÷")) {
            opcion1 = resultadoDivision(opcion1, opcion2);
            
                } else if (operador.equals("²")) {
            opcion1 = resultadoPotencia(opcion1);
            
                } else if (operador.equals("√")) {
            opcion1 = resultadoRaiz(opcion1);
                }
             else if (operador.equals("%")) {
                    opcion1 = String.valueOf(Double.parseDouble(opcion1) / 100);
                }
      
                } catch (Exception e) {
                opcion1 = "Error";
            }
                operador = "";
                opcion2 = "";
                calculoTerminado = true;
                
            
            actualizarPantalla(pantalla);
        
            
        }
        }
    
    
    
    private void actualizarPantalla(Label pantalla) {
       if (opcion1.equals("Error")) {
        pantalla.setText("Error");
        
         } else if (operador.isEmpty()) {
           pantalla.setText(limpiarDecimal(opcion1));
                   
            } else if (operador.equals("√")) {
            pantalla.setText(operador + limpiarDecimal(opcion1));
            
        } else {
            pantalla.setText(limpiarDecimal(opcion1) + "" + operador + "" + limpiarDecimal( opcion2));
            
            
        }
    }
    
    private String limpiarDecimal(String numero) {
        if (numero == null || numero.isEmpty()) {
            return "";
        }
        // Si el número termina en ".0", se lo cortamos por completo
        if (numero.endsWith(".0")) {
            return numero.substring(0, numero.length() - 2);
        }
        return numero;
    }
    
    private String resultadoSuma(String numeroUno, String numeroDos) {
        String resultado; 
        double datoUno = Double.parseDouble(numeroUno); 
        double datoDos = Double.parseDouble(numeroDos);
        double suma = datoUno + datoDos;         
        return resultado = String.valueOf(suma);
    }

    private String resultadoResta(String numeroUno, String numeroDos) {
        String resultado; 
         double datoUno = Double.parseDouble(numeroUno); 
        double datoDos = Double.parseDouble(numeroDos);
        double resta = datoUno - datoDos;         
        return resultado = String.valueOf(resta);
        
    }
    private String resultadoMultiplicacion(String numeroUno, String numeroDos) {
        String resultado; 
        double datoUno = Double.parseDouble(numeroUno); 
        double datoDos = Double.parseDouble(numeroDos);
        double multi = datoUno * datoDos;         
        return resultado = String.valueOf(multi);
        
    }
    private String resultadoDivision(String numeroUno, String numeroDos) {
        String resultado; 
        double datoUno = Double.parseDouble(numeroUno); 
        double datoDos = Double.parseDouble(numeroDos);
        if (datoDos == 0) {
            return "Error";
        }
        double division = datoUno / datoDos;         
        return resultado = String.valueOf(division);
        
    }
    private String resultadoPotencia(String numeroUno) {
        String resultado; 
        double datoUno = Double.parseDouble(numeroUno); 
       
        double potencia = datoUno *  datoUno;         
        return resultado = String.valueOf(potencia);
        
    }
    private String resultadoRaiz(String numeroUno) {
        String resultado; 
        Double datoUno = Double.parseDouble(numeroUno); 
       if (datoUno < 0) {
        return "Error";
    }
     double raiz = Math.sqrt(datoUno);         
     return resultado =  String.valueOf(raiz);
    

        
    }
   
}