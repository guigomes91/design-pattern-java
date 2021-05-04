package refactoring_guru.estruturais.facade.example;

import java.io.File;
import refactoring_guru.estruturais.facade.example.cardapio.MenuRestauranteNormal;
import refactoring_guru.estruturais.facade.facade.RestauranteFacade;
import refactoring_guru.estruturais.facade.facade.VideoConversionFacade;

/**
 *
 * @author Guilherme Gomes
 */
public class Demo {
    public static void main(String[] args) {
        //VideoConversionFacade converter = new VideoConversionFacade();
        //File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
        
        RestauranteFacade facade = new RestauranteFacade();
        
        MenuRestauranteNormal menu = facade.getMenuNormal();
        menu.exibirMenu();
    }
}
