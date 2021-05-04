package refactoring_guru.estruturais.facade.facade;

import refactoring_guru.estruturais.facade.example.cardapio.MenuRestauranteAmbos;
import refactoring_guru.estruturais.facade.example.cardapio.MenuRestauranteNormal;
import refactoring_guru.estruturais.facade.example.cardapio.MenuRestauranteVegetariano;
import refactoring_guru.estruturais.facade.example.cardapio.RestauranteAmbos;
import refactoring_guru.estruturais.facade.example.cardapio.RestauranteNormal;
import refactoring_guru.estruturais.facade.example.cardapio.RestauranteVegetariano;

/**
 *
 * @author Guilherme Gomes
 */
public class RestauranteFacade {

    public MenuRestauranteNormal getMenuNormal() {
        RestauranteNormal rn = new RestauranteNormal("Carne de gato");
        MenuRestauranteNormal mn = (MenuRestauranteNormal) rn.exibirMenu();

        return mn;
    }

    public MenuRestauranteVegetariano getMenuVeg() {
        RestauranteVegetariano rn = new RestauranteVegetariano("Carne de galinha");
        MenuRestauranteVegetariano mn = (MenuRestauranteVegetariano) rn.exibirMenu();

        return mn;
    }
    
    public MenuRestauranteAmbos getMenuAmbos() {
        RestauranteAmbos rn = new RestauranteAmbos("Carne de porco");
        MenuRestauranteAmbos mn = (MenuRestauranteAmbos) rn.exibirMenu();

        return mn;
    }
} 
