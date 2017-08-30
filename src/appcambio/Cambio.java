/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcambio;

/**
 *
 * @developer Fabiano
 */
public class Cambio {
    
    public double Dolar(double valor) {
        double resultado; 
        resultado = valor / 3.15;
        return resultado;
    }
    
    public double Euro(double valor) {
        double resultado; 
        resultado = valor / 3.75;
        return resultado;
    }
    
    public double Iene(double valor) {
        double resultado; 
        resultado = valor * 34.961;
        return resultado;
    }

}