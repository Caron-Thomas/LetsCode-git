import java.util.ArrayList;
import java.util.List;

public class MyOwnLists<K, T>  {

    private K comparator;
    private List<T> myList = new ArrayList<>();

    public MyOwnLists(K comparator, List<T> myList) {
        this.comparator = comparator;
        this.myList = myList;
    }

    public MyOwnLists(){ };

    public void add(T item) {
        myList.add(item);
    }

}


//Crie a classe MyOwnLists com um ii) método asListedSorted estático.
//i) Este método deve ter dois valores, um array de valores de um determinado tipo T e um Comparator de mesmo tipo.
// iii) Este método deve retornar uma lista (List) de elementos do tipo T ordenados pela definição do Comparator.
//Permita que seja possível transformar qualquer array de um determinado tipo em uma lista de mesmo tipo de forma ordenada.



    //    private T t;
//
//    public void set(T t){
//        this.t = t;
//    }
//    public T get() {
//        return t;
//    }


