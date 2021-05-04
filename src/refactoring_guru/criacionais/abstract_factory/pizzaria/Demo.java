package refactoring_guru.criacionais.abstract_factory.pizzaria;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import refactoring_guru.criacionais.abstract_factory.pizzaria.application.App;
import refactoring_guru.criacionais.abstract_factory.pizzaria.factories.PizzaioloAFactory;
import refactoring_guru.criacionais.abstract_factory.pizzaria.factories.PizzaioloBFactory;
import refactoring_guru.criacionais.abstract_factory.pizzaria.factories.PizzariaFactory;

/**
 *
 * @author Guilherme Gomes
 */
public class Demo {
    
    public static App test(Date date) {
        App app = null;
        PizzariaFactory factory;
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int day = cal.get(Calendar.DAY_OF_WEEK);
        
        switch (day) {
            case 2:
            case 4:
            case 6:
                factory = new PizzaioloAFactory();
                app = new App(factory);
                break;
            case 3:
            case 5:
            case 7:
                factory = new PizzaioloBFactory();
                app = new App(factory);
                break;
            default:
                System.out.println("Domingo pizzaria fechada!");
                break;
        }
        
        return app;
    }
    
    public static void main(String[] args) {
        Date date = new Date();
        App app = test(date);
        
        if(app == null) {
            return;
        }
        app.prepararPizza();
    }
}
