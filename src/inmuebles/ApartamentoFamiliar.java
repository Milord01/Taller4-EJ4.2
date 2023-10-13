/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    protected int valorAdministracion;
    
    public ApartamentoFamiliar(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int valorAdministracion) {
    super(idInmobiliario, area, direccion, numHabitaciones, numBaños);
    this.valorAdministracion=valorAdministracion;
    }
    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administración = $" + valorAdministracion + "\n"); }

}
