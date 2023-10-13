/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

public class InmuebleVivienda extends Inmueble{
    protected int numHabitaciones;
    protected int numBaños;
    
    public InmuebleVivienda(int idInmobiliario, int area, String
    direccion, int numHabitaciones, int numBaños) {
    super(idInmobiliario, area, direccion);
    this.numHabitaciones = numHabitaciones;
    this.numBaños = numBaños;
}
    @Override
    void imprimir() {
    super.imprimir(); 
    System.out.println("Número de habitaciones = " + numHabitaciones + "\nNúmero de baños = " + numBaños);
}

}
