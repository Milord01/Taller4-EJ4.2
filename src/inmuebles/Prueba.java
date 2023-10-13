/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inmuebles;

import inmuebles.Local.tipo;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) { 
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Que tipo de inmueble busca?\n1.Inmueble vivienda\n2.Local");
            int valor = scanner.nextInt();
            
            switch (valor) {
               
                case 1 -> {
                    System.out.println("Que tipo de vivienda busca?\n1.Casa Rural\n2.Casa conjunto cerrado\n3.Casa independiente\n4.Apartamento Familiar\n5.Apartaestudio");
                    try (Scanner scanner2 = new Scanner(System.in)) {
                        int valor2 = scanner2.nextInt();
                        
                        switch (valor2) {
                            case 1 -> {
                                CasaRural casa1 = new CasaRural(1030796, 500, "El Retiro", 4, 2,2,50, 2000);
                                System.out.println("Datos casa");
                                casa1.calcularprecio(CasaRural.valorArea);
                                casa1.imprimir();
                            }
                            case 2 -> {
                                CasaConjuntoCerrado casa1 = new CasaConjuntoCerrado(10307643, 50, "Avenida Brasil ", 3, 1,1, 250000,true,false);
                                System.out.println("Datos casa");
                                casa1.calcularprecio(CasaConjuntoCerrado.valorArea);
                                casa1.imprimir();
                            }
                            case 3 -> {
                                CasaIndependiente casa1 = new CasaIndependiente(12347645, 55, "Calle 23F 65-89 ", 3, 2,1);
                                System.out.println("Datos casa");
                                casa1.calcularprecio(CasaConjuntoCerrado.valorArea);
                                casa1.imprimir();
                            }
                            case 4 -> {
                                ApartamentoFamiliar apto1 = new ApartamentoFamiliar(103067, 120, "Avenida Santander 45-45", 3, 2, 200000);
                                System.out.println("Datos apartamento");
                                apto1.calcularprecio(ApartamentoFamiliar.valorArea);
                                apto1.imprimir();
                            }
                            case 5 -> {
                                System.out.println("Datos apartamento");
                                Apartaestudio aptestudio1 = new Apartaestudio(12354, 50, "Avenida Caracas 30-15", 1, 1);
                                aptestudio1.calcularprecio(Apartaestudio.valorArea);
                                aptestudio1.imprimir();
                            }}}}
                
                case 2 -> {
                    System.out.println("Que tipo de local busca?\n1.LocalComercial\n2.Oficina");
                    try (Scanner scanner1 = new Scanner(System.in)) {
                        int valor1 = scanner1.nextInt();
                        
                        switch (valor1) {
                            case 1 -> {
                                
                                System.out.print("Ingrese el identificador inmobiliario: ");
                                int idInmobiliario = scanner.nextInt();
                                
                                System.out.print("Ingrese el área: ");
                                int area = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.print("Ingrese la dirección: ");
                                String direccion = scanner.nextLine();
                                
                                System.out.print("Ingrese el centro comercial: ");
                                String comercial = scanner.nextLine();
                                System.out.println("");
                                
                                LocalComercial local1 = new LocalComercial(idInmobiliario, area, direccion,tipo.CALLE,  comercial);
                                
                                System.out.println("Datos LocalComercial");
                                local1.calcularprecio(LocalComercial.valorArea);
                                local1.imprimir();
                            }
                            case 2 -> {
                                System.out.print("Ingrese el identificador inmobiliario: ");
                                int idInmobiliario = scanner.nextInt();
                                
                                System.out.print("Ingrese el área: ");
                                int area = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.print("Ingrese la dirección: ");
                                String direccion = scanner.nextLine();
                                
                                System.out.print("Es oficina de gobierno?: ");
                                boolean esGobierno = scanner.nextBoolean();
                                System.out.println("");
                                
                                Oficina local1 = new Oficina(idInmobiliario, area, direccion,tipo.INTERNO,  esGobierno);
                                
                                System.out.println("Datos Oficina");
                                local1.calcularprecio(Oficina.valorArea);
                                local1.imprimir();  
                            }}}}}}}}