import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> listaPessoas = Arrays.asList(
                new Person("Gustavo", 23, "Cuiaba"),
                new Person("João", 28, "São Paulo"),
                new Person("Maria", 34, "Rio de Janeiro"),
                new Person("Pedro", 21, "São Paulo"),
                new Person("Ana", 40, "Curitiba"),
                new Person("Carlos", 30, "São Paulo")
        );

        listaPessoas.stream()
                .filter(index -> index.cidade.equals("São Paulo")) //filtrou por cidade
                .sorted(Comparator.comparing(p -> p.idade)) //ordenou por idade
                .map(i -> i.nome)       //selecinou apenas o propriedade nome
                .forEach(System.out::println); //Imprime na tela usando um loop
    }
}