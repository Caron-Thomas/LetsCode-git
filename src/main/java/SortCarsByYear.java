import java.util.Comparator;

public class SortCarsByYear implements Comparator<Cars> {

    @Override
    public int compare(Cars c1, Cars c2) {
        if(c1.getAnoFabricacao() > c2.getAnoFabricacao()){
            return -1;
        } else if (c1.getAnoFabricacao() > c2.getAnoFabricacao()){
            return 1;
        } else {
            return 0;
        }
    }
}
