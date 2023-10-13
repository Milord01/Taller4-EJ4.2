/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

public class Casa extends InmuebleVivienda{
    protected int numPisos;
     
    public Casa(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int numPisos) {
    super(idInmobiliario, area, direccion, numHabitaciones, numBaños);
    this.numPisos = numPisos;}
     
    @Override
 void imprimir() {
    super.imprimir(); 
    System.out.println("Número de pisos = " + numPisos);
    
}}
