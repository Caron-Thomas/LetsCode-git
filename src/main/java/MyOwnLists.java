import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class MyOwnLists<T> {

    public static <T>List<T> asListSorted(T[] array, Comparator<T> comparator ){
        List<T> asList = Arrays.asList(array);
        Collections.sort(asList, comparator);

    return asList;
    }
}

