/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

public class Oficina extends Local {
    protected static double valorArea = 3500000;
    protected boolean esGobierno;
    
    public Oficina(int idInmobiliario, int area, String direccion, tipo tipoLocal, boolean esGobierno) {

    super(idInmobiliario, area, direccion, tipoLocal);
    this.esGobierno = esGobierno;
}
    @Override
    void imprimir() { 
        super.imprimir(); 
        System.out.println("Es oficina gubernamental = " + esGobierno + "\n"); }

}
