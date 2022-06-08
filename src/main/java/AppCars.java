import java.util.List;

public class AppCars extends MyOwnLists<Car>{

    public static void main(String[] args) {

        {
            Car[] car = new Car[5];
            car[0] = new Car("Gol", 1992, true);
            car[1] = new Car("Fusca", 1964, false);
            car[2] = new Car("Palio", 2001, false);
            car[3] = new Car("X1", 2009, false);
            car[4] = new Car("A3", 1999, true);

            System.out.printf("\n+++++++++++++++++++++++++++++++++++++\n");
            System.out.print("Array de carros sem ordenação");
            for (int i = 0; i < car.length; i++) {
                System.out.printf("\nVeiculo modelo: %s, Ano fabricação: %d, Está em estado deplorável? %b",car[i].getModelo(),car[i].getAnoFabricacao(),car[i].isLataVelha());
            }
            System.out.printf("\n+++++++++++++++++++++++++++++++++++++\n");

            SortCarsByYear sortCars = new SortCarsByYear();
            List<Car> carsList = asListSorted(car, sortCars);

            for (Car cars: carsList) {
                System.out.printf("\nVeiculo modelo: %s, Ano fabricação: %d, Está em estado deplorável? %b",cars.getModelo(), cars.getAnoFabricacao(), cars.isLataVelha());
            }

        }//Método do array e sort para a classe Cars
    }
}
