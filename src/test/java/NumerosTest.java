import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class NumerosTest {

    @Test
    public void unDígito(){
        ArrayList<Numeros> roman = new ArrayList<>();
        Arrays.stream(Numeros.values()).forEach(x -> roman.add(x));
        ArrayList<Integer> decimal = new ArrayList<>();
        Arrays.stream(Numeros.values()).forEach(x -> decimal.add(x.getNumero()));
        int indice = 0;
        for ( Numeros i : roman) {
            Numeros numero = roman.get(indice);
            assertThat(numero).isInstanceOf(Numeros.class);
            assertThat(numero.ordinal()).isEqualTo(indice);
            assertThat(numero.name()).isEqualToIgnoringCase(i.toString());
            assertThat(numero.compareTo(numero.I)).isEqualTo(indice);
            assertThat(numero.toString()).isEqualToIgnoringCase(i.toString());
            assertThat(numero.equals(numero)).isEqualTo((true));
            assertThat(Numeros.values()[indice]).isEqualTo((numero));
            assertThat(decimal.get(indice)).isEqualTo(numero.getNumero());
            assertThat(numero.getNumero()).isEqualTo(decimal.get(indice));
            indice += 1;
        }
    }
}
