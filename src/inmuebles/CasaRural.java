/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;
public class CasaRural extends Casa{
    
    protected static double valorArea = 1500000;
    protected int distanciaCabera;
    protected int altitud;
    
    public CasaRural(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int numPisos, int distanciaCabera, int altitud) {
    super(idInmobiliario, area, direccion, numHabitaciones, numBaños, numPisos); 
    this.distanciaCabera = distanciaCabera;
    this.altitud = altitud;
    }
    @Override
    void imprimir() {
    super.imprimir(); 
    System.out.println("Distancia a la cabecera municipal = " + distanciaCabera + " km.\nAltitud sobre el nivel del mar = " + altitud + " metros.\n"); }

    
}
