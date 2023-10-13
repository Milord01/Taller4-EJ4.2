/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana{
    protected static double valorArea = 2500000;
    protected int valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCampos;
    
    
    public CasaConjuntoCerrado(int idInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int numPisos,int valorAdministracion, boolean tienePiscina,boolean tieneCampos) {
    super(idInmobiliario, area, direccion, numHabitaciones, numBaños, numPisos);
    this.valorAdministracion = valorAdministracion;
    this.tienePiscina = tienePiscina;
    this.tieneCampos= tieneCampos;}
    
    @Override
    void imprimir() {
        super.imprimir(); 
        System.out.println("Valor de la administración = " + valorAdministracion + "\nTiene piscina? = " + tienePiscina + "\nTiene campos deportivos? = " + tieneCampos + "\n"); }

}
