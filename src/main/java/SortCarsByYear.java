import java.util.Comparator;

public class SortCarsByYear implements Comparator<Car> {

    @Override
    public int compare(Car c1, Car c2) {
        if(c1.getAnoFabricacao() > c2.getAnoFabricacao()){
            return -1;
        } else if (c1.getAnoFabricacao() > c2.getAnoFabricacao()){
            return 1;
        } else {
            return 0;
        }
    }
}
