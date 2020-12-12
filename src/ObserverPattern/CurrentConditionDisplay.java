package ObserverPattern;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;

    public CurrentConditionDisplay(Subject weatherData){
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temperature:" + temp);
    }

    @Override
    public void update(float temp) {
        this.temp = temp;
        display();
    }
}
