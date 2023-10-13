/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

public class CasaIndependiente extends CasaUrbana {
    protected static double valorArea = 3000000;
    
  
    public CasaIndependiente(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int numPisos) {
    super(idInmobiliario, area, direccion, numHabitaciones, numBaños, numPisos); }
    
    @Override
    void imprimir() {
    super.imprimir();
    System.out.println();}
}
