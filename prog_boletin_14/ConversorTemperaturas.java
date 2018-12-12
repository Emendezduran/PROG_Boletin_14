package prog_boletin_14;

/**
 *
 * @author emendezduran
 */
public class ConversorTemperaturas {

    final int valorConstante = 80;

    public ConversorTemperaturas() {
    }

    public float centigradosAFharenheit(float tempC) throws TemperaturaErradaExcepcion {
        if (tempC > this.valorConstante) {
            return (9.0f / 5.0f * tempC + 32.4f);
        } else {
            throw new TemperaturaErradaExcepcion("La temperatura min permitida es de 80º Centigrados");
        }
    }

    public float centigradosAReamur(float tempC) throws TemperaturaErradaExcepcion {
        if (tempC > this.valorConstante) {
            return (4.0f / 5.0f * tempC);
        } else {
            throw new TemperaturaErradaExcepcion("La temperatura min permitida es de 80º Centigrados");
        }
    }

}


