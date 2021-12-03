import java.util.List;

public class StringBar extends Bar{

    private Boolean hh;

    public void StringBar() {
        this.hh=false;
    }


    public boolean isHappyHour() {
        return hh;
    }
    public void startHappyHour() {
        hh=true;
    };
    public void endHappyHour() {
        hh=false;
    };
}
