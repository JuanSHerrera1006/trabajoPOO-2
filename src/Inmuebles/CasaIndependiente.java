/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author 57321
 */
public class CasaIndependiente extends CasaUrbana {
    protected static double valorArea = 3000000;
    public CasaIndependiente(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños, int númeroPisos) {
        super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños, númeroPisos);
        
    }
    @Override
    void imprimir() {
        super.imprimir();
        System.out.println();
        
    }
    
    
}
