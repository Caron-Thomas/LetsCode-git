import java.util.List;

public class AppPersonCars {

    public static void main(String[] args) {

        Person[] arrayPerson;
        Car[] arrayCars;

        {
            arrayPerson = new Person[6];
            arrayPerson[0] = new Person("Thomas", 40);
            arrayPerson[1] = new Person("Jhonatas", 32);
            arrayPerson[2] = new Person("Vítor", 24);
            arrayPerson[3] = new Person("gSilva", 27);
            arrayPerson[4] = new Person("gOlmos", 23);
            arrayPerson[5] = new Person("Mariana", 26);
        } // Arrey de carregamento das Pessoas
        {
            arrayCars = new Car[5];
            arrayCars[0] = new Car("Gol", 1992, true);
            arrayCars[1] = new Car("Fusca", 1964, false);
            arrayCars[2] = new Car("Palio", 2001, false);
            arrayCars[3] = new Car("X1", 2009, false);
            arrayCars[4] = new Car("A3", 1999, true);
        } // Arrey de carregamento dos carros
        {
            System.out.println("MyOwnList of Person sorted by age");
            SortPersonByAge sort = new SortPersonByAge();
            List<Person> listPerson = MyOwnLists.asListSorted(arrayPerson, sort);
            System.out.print("Da pessoa mais nova para a mais velha:");
            for (Person person : listPerson) {
                System.out.printf("\nNome: %s | Idade: %d", person.getNome(), person.getIdade());
            }
        } // Consumindo o método SortPersonByAge
        {
            System.out.printf("\n*******************************\n");
            SortCarsByYear sortCars = new SortCarsByYear();
            List<Car> listCars = MyOwnLists.asListSorted(arrayCars, sortCars);
            System.out.println("MyOwnList of Car sorted by year");
            System.out.print("Do carro mais novo pro mais antigo:");
            for (Car car : listCars ) {
                System.out.printf("\nModelo: %s | Ano de fabricação: %d | Conservação está caindo aos pedaços? %b.", car.getModelo(), car.getAnoFabricacao(), car.isLataVelha());
            }
        }
    }
}
