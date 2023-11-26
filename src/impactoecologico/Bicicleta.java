package impactoecologico;

public class Bicicleta implements ImpactoEcologicos {
    private String tipo;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Bicicletas no emiten carbono
        return 0;
    }

    public String getTipo() {
        return tipo;
    }
     @Override
    public String obtenerNombre() {
        return tipo + " Bicicleta";
    }
}
