package animales;

public class Lobo extends Canido {

    @Override
    public String getSonido() {
        return "Aullido";
    }

    @Override
    public String getAlimentos() {
        return "Carnívoro";
    }
    
    @Override
    public String getHábitat() {
        return "Bosque";
    }
    
    @Override
    public String getNombreCientífico() {
        return "Canis lupus";
    }

}
