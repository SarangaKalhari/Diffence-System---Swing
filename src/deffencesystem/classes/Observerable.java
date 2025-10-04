
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
    private int sliderValue;
    
    public void addWindow(Observer observer){
        this.observers.add(observer);
    }
    
    public void removeWindow(Observer option){
        this.observers.remove(option);
    }
    
    public void notifyObservers(String status){
        for(Observer ob : observers){
            ob.updateStatus(status);
        }
    }
    
    public void addInterface(Observer newInterface){
        observers.add(newInterface);
    }
    
    public void setBtn(int value){
        for(Observer ob : observers){
            ob.setButton(value);
        }
    }

    public void sendMessage(String message){
        for(Observer ob : observers){
            ob.setMessage(message);
        }
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    
    @Override
    public void setSliderValue(int value) {
        if(this.sliderValue!=value){
            this.sliderValue=value;
            setBtn(sliderValue);
        }
    }
    
    
}
