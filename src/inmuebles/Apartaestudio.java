/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

public class Apartaestudio extends Apartamento {
    protected static double valorArea = 1500000;
    
    public Apartaestudio(int idInmobiliario, int area, String direccion,int numHabitaciones, int numBaños) {
    super(idInmobiliario, area, direccion,1, 1);
}
    @Override
    void imprimir() {
        super.imprimir();
        System.out.println();}
}
