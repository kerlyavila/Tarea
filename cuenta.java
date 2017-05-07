/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber;

import java.util.Date;

/**
 *
 * @author Josseline
 */
public class cuenta {
     private int id;
    private double saldo;
    private double inte_anual;
    private Date fecha;

    public cuenta() {
        this.id = 0;
        this.saldo = 0;
        this.inte_anual = 0;
    }

    public cuenta(int id, double saldo) {
        this.id = 12;
        this.saldo = 140;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInte_anual() {
        return inte_anual;
    }

    public void setInte_anual(double inte_anual) {
        this.inte_anual = inte_anual;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

     public double getinteres_mensual (){
        System.out.println(" **** El Interés Mensual ES:____");
        System.out.println(" **** Interes anual / 12 ...");
        return 0;
    }
    
    void retiro(double retiro){
        saldo = saldo - retiro;
    }
    
    void deposito(double deposito){
        saldo = saldo + deposito;
    }
     
    public static void main (String[]args){
        cuenta cnt = new cuenta();
        cnt.getinteres_mensual();        
    }

}
