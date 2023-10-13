/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

public class Inmueble {
    protected int idInmobiliario;
    protected int area;
    protected String direccion;
    protected double precioVenta;
    
    Inmueble(int idInmobiliario, int area, String direccion) {
     this.idInmobiliario = idInmobiliario;
     this.area = area;
     this.direccion = direccion;
    }
    double calcularprecio(double valorArea){
       precioVenta=area*valorArea;
       return precioVenta;
    }
    void imprimir() {
        System.out.println("Identificador inmobiliario = " + idInmobiliario + "\nÁrea = " + area + "\nDirección = " + direccion + "\nPrecio de venta = $" + precioVenta);
    }
}
