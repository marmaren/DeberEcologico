package impactoecologico;

public class Edificio implements ImpactoEcologicos {
    private String nombre;
    private double emisiones;

    public Edificio(String nombre, double emisiones) {
        this.nombre = nombre;
        this.emisiones = emisiones;
    }

    @Override
    public double obtenerImpactoEcologico() {
        return emisiones;
    }

    public String getNombre() {
        return nombre;
    }
     @Override
    public String obtenerNombre() {
        return nombre;
    }
}
