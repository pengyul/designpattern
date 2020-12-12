package ObserverPattern;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temp;

    public StatisticsDisplay(Subject weatherData){
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("统计：温度" + temp);
    }

    @Override
    public void update(float temp) {
        this.temp = temp;
        display();
    }
}
