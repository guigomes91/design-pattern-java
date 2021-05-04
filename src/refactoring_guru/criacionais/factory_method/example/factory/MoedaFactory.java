package refactoring_guru.criacionais.factory_method.example.factory;

import refactoring_guru.criacionais.factory_method.example.buttons.Moeda;
import refactoring_guru.criacionais.factory_method.example.buttons.Real;
import refactoring_guru.criacionais.factory_method.example.buttons.USDolar;

/**
 *
 * @author Guilherme Gomes
 */
public class MoedaFactory {

    public static Moeda criarMoeda(Pais pais) {
        if (pais.equals(Pais.BRASIL)) {
            return new Real();
        } else if (pais.equals(Pais.EUA)) {
            return new USDolar();
        }

        throw new IllegalArgumentException("Não existe pais");
    }
}
