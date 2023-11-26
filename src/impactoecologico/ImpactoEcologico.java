package impactoecologico;

import java.util.ArrayList;

public class ImpactoEcologico {
    public static void main(String[] args) {
        // Crear objetos de cada clase
        Edificio edificio1 = new Edificio("Edificio A", 500.0);
        Auto auto1 = new Auto("Toyota", 200.0);
        Bicicleta bicicleta1 = new Bicicleta("Montaña");

        // Crear ArrayList<ImpactoEcologico> y agregar objetos
        ArrayList<ImpactoEcologicos> objetos = new ArrayList<>();
        objetos.add(edificio1);
        objetos.add(auto1);
        objetos.add(bicicleta1);

        // Iterar y calcular el impacto ecológico
        for (ImpactoEcologicos objeto : objetos) {
            System.out.println("Objeto: " + objeto.obtenerNombre() +
                    ", Impacto Ecológico: " + objeto.obtenerImpactoEcologico() + " toneladas de CO2");
        }
    }
}
