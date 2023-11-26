package impactoecologico;

public class Auto implements ImpactoEcologicos {
    private String modelo;
    private double emisiones;

    public Auto(String modelo, double emisiones) {
        this.modelo = modelo;
        this.emisiones = emisiones;
    }

    @Override
    public double obtenerImpactoEcologico() {
        return emisiones;
    }

    public String getModelo() {
        return modelo;
    }
     @Override
    public String obtenerNombre() {
        return modelo;
    }
}
