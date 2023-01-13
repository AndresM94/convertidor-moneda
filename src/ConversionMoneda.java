/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ConversionMoneda {
    private double valor, resultado;

    public double getResultado() {
        return resultado;
    }
    private int divisa1, divisa2;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa1() {
        return divisa1;
    }

    public void setDivisa1(int divisa1) {
        this.divisa1 = divisa1;
    }

    public int getDivisa2() {
        return divisa2;
    }

    public void setDivisa2(int divisa2) {
        this.divisa2 = divisa2;
    }

    public ConversionMoneda() {
    }
    
    public double convertir() {
        /*if(divisa1 == 0 && divisa2 == 1) {
            resultado = valor * 0.85;
        }else if(divisa1 == 0 && divisa2 == 2) {
            resultado = valor * 4891.26;
        }*/
        if(divisa1 == divisa2) {
            resultado = valor;
        }else if(divisa1 == 0){//Conversion de Dolar a:
            if(divisa2 == 1) {//Euro
                resultado = valor * 0.85;
            }else if(divisa2 == 2) {//Pesos Colombianos
                resultado = valor * 4891.26;
            }else if(divisa2 == 3) {//Pesos Mexicanos
                resultado = valor * 19.14;
            }
        }else if(divisa1 == 1) {//Conversion de Euro a:
            if(divisa2 == 0) {//Dolar
                resultado = valor * 1.07;
            }else if(divisa2 == 2) {//Pesos Colombianos
                resultado = valor * 5180.01;
            }else if(divisa2 == 3) {//Pesos Mexicanos
                resultado = valor * 20.39;
            }
        }else if(divisa1 == 2) {//Conversion de Pesos Colombianos a:
            if(divisa2 == 0) {//Dollar
                resultado = (valor * 0.0002);
            }else if(divisa2 == 1) {//Euro
                resultado = valor * 0.00019;
            }else if(divisa2 == 3) {//Pesos Mexicanos
                resultado = valor * 0.0039;
            }
        }else if(divisa1 == 3) {//Conversion de Pesos Mexicanos a:
            if(divisa2 == 0) {//Dolar
                resultado = valor * 0.052;
            }else if(divisa2 == 1) {//Euro
                resultado = valor * 0.049;
            }else if(divisa2 == 2) {//Pesos Colombianos
                resultado = valor * 253.90;
            }
        }
        
        
        return resultado;
    }
    
    
}
