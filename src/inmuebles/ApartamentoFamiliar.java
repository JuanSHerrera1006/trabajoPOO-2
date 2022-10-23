package inmuebles;

public class ApartamentoFamiliar extends Apartamento {

    protected static double valorArea = 2000000;
    protected int valorAdministracion;

    public ApartamentoFamiliar(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños, int valorAdministracion) {
        super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños);
        this.valorAdministracion = valorAdministracion;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administración = $" + valorAdministracion);
        System.out.println();

    }

}
