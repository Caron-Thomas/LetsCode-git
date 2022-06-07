import java.util.ArrayList;
import java.util.List;
import java.lang.Class;

public class App {

        public static void main(String[] args) {

        Cars car1 = new Cars("Gol", 1998, true);
        MyOwnLists<Integer, Cars> carsList = new MyOwnLists<>();
        carsList.add(car1);

        System.out.println(car1.getModelo());
        System.out.println("++++++++++++++++++");
        for (Cars car:  carsList ) {
            System.out.println(car.getModelo());
                }





//        MyOwnLists nome = new MyOwnLists();
//        nome.set("Thomas");
//
//        MyOwnLists numero = new MyOwnLists();
//        numero.set(7);
//
//        List<MyOwnLists> listaTeste = new ArrayList<>();
//
//        listaTeste.add(nome);
//        listaTeste.add(numero);
//        System.out.println(nome.get());
//        System.out.println(numero.get());
//        System.out.println("++++++++++++++++++++");
//        for (MyOwnLists item: listaTeste ) {
//            System.out.println(item.get());
//            }



    }

}


