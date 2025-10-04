
package deffencesystem.classes;

import deffencesystem.interfaces.MainCaller;
import deffencesystem.interfaces.Observer;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Observerable implements MainCaller{
    private ArrayList<Observer>observers=new ArrayList<>();
    
    public void addWindow(Observer observer){
        this.observers.add(observer);
    }
    
    public void removeWindow(Observer option){
        this.observers.remove(option);
    }
    
    public void notifyWindow(String status){
        for(Observer ob : observers){
            ob.updateStatus(status);
        }
    }

    @Override
    public void setSliderValue(int value) {
        
    }
    
    
}
