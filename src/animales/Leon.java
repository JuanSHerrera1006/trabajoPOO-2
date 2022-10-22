package animales;

public class Leon extends Felino {

    @Override
    public String getSonido() {
        return "Rugido";
    }

    @Override
    public String getAlimentos() {
        return "Carnívoro";
    }

    @Override
    public String getHábitat() {
        return "Praderas";
    }

    @Override
    public String getNombreCientífico() {
        return "Panthera leo";
    }
}
