import java.util.Comparator;

public class SortPersonByAge implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        if(p1.getIdade() > p2.getIdade()) {
            return 1;
        }else if (p1.getIdade() < p2.getIdade()){
            return -1;
        } else {
            return 0;
        }
    }
}
