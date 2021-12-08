import java.util.List;

public class StringBar extends Bar{


    public void StringBar() {
        super.setHh(false);
    }
    public boolean isHappyHour() {
        return super.getHh();
    }
    public void startHappyHour() {
        super.setHh(true);
        notifyObservers();};
    public void endHappyHour() {
        super.setHh(false);
        notifyObservers();
    };
    public void order(StringDrink drink, StringRecipe recipe){recipe.mix(drink);}
}
