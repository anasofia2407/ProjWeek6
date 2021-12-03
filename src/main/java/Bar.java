import java.util.List;

public abstract class   Bar  {
    private List<BarObserver> observers;
    public abstract boolean isHappyHour() ;
    public abstract void startHappyHour() ;
    public abstract void endHappyHour() ;
    public void Bar(List<BarObserver> observers){
        this.observers=observers;
    }
    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }

}
