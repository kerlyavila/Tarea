/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber;

/**
 *
 * @author Josseline
 */
public class rectangulo {
    double ancho;
    double altura;

    public rectangulo() {
        this.ancho = 1.00d;
        this.altura = 1.00d;
    }

    public rectangulo(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }
    
    public double getArea(){
        return ancho * altura;
    }
    
    public double getPerimetro(){
        return (ancho + altura) * 2;
    }
    
    public static void main(String [] args){
        rectangulo recta = new rectangulo();
        recta.getArea();
        recta.getPerimetro();
    }
}
