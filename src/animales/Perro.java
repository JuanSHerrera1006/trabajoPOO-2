package animales;

public class Perro extends Canido {

    @Override
    public String getSonido() {
        return "Ladrido";
    }

    @Override
    public String getAlimentos() {
        return "Carnívoro";
    }

    @Override
    public String getHábitat() {
        return "Doméstico";
    }

    @Override
    public String getNombreCientífico() {
        return "Canis lupus familiaris";
    }

}
