import java.util.ArrayList;

public class CarMgr {
    private ArrayList<Car> carList;

    public CarMgr() {
        this.carList = new ArrayList<Car>();
    }

    public String toString() {
        String results = "+";
        for (int i = 0; i < this.carList.size(); i++) {
            results += " " + this.carList.get(i);
        }
        return results;
    }
}
