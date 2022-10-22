/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author 57321
 */
public class Apartamento  extends InmuebleVivienda {
     public Apartamento(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños) {
        super(identificadorInmobiliario, área, dirección,númeroHabitaciones, númeroBaños);
        }
     @Override
    void imprimir() {
        super.imprimir();
    }   
    
}
