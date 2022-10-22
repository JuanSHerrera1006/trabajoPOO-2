package animales;

public class Gato extends Felino {

    @Override
    public String getSonido() {
        return "Maullido";
    }

    @Override
    public String getAlimentos() {
        return "Ratones";
    }

    @Override
    public String getHábitat() {
        return "Doméstico";
    }

    @Override
    public String getNombreCientífico() {
        return "Felis silvestris catus";
    }
}
