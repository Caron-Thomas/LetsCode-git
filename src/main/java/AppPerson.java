import java.util.List;

public class AppPerson extends MyOwnLists<Person> {

        public static void main (String[]args){

        {
        Person[] arrayPerson = new Person[6];
        arrayPerson[0] = new Person("Thomas", 40);
        arrayPerson[1] = new Person("Jhonatas", 32);
        arrayPerson[2] = new Person("Vítor", 24);
        arrayPerson[3] = new Person("gSilva", 27);
        arrayPerson[4] = new Person("gOlmos", 23);
        arrayPerson[5] = new Person("Mariana", 26);

        System.out.print("Array antes da conversão e sort.");
        for (int i = 0; i < 6; i++) {
            System.out.printf("\nNome: %s | Idade: %d", arrayPerson[i].getNome(), arrayPerson[i].getIdade());
        }
        System.out.printf("\n======================================");

        SortPersonByAge sort = new SortPersonByAge();
        List<Person> list = asListSorted(arrayPerson, sort);

        System.out.printf("\nLista ordenada por menor idade, após conversão e sort");
        for (Person person : list) {
            System.out.printf("\nNome: %s | Idade: %d", person.getNome(), person.getIdade());
        }
        } //Método do array e sort para a classe Person
    }
}
