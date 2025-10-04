package deffencesystem.classes;

import deffencesystem.GUI.Helicopter;
import deffencesystem.GUI.MainController;
import deffencesystem.GUI.Submarine;
import deffencesystem.GUI.Tank;




/**
 *
 * @author Lenovo
 */
public class DeffenceSystem {

    
    public static void main(String[] args) {
       Observerable observerable = new Observerable();
       observerable.addWindow(new Helicopter(observerable));
       observerable.addWindow(new Tank(observerable));
       observerable.addWindow(new Submarine(observerable));
       
       MainController main= new MainController(observerable);
       observerable.addWindow(main);
       main.setVisible(true);
       
    }
    
}
