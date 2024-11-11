import java.util.*;
import java.util.stream.*;

public class Main{


    public static void main(String[] args) {

        //Listando apenas numeros pares apartir de uma lista de inteira

     /*   List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> listTOInt = list.stream().filter(i -> i % 2  ==0)
                .collect(Collectors.toList());
        listTOInt.forEach(System.out::println);*/

        //Lista de nomes usando MAP para listar nomes maisculos

       /* List<String> list = Arrays.asList("Gustavo","Pedro","Ana","Jose", "Amanda");

        List listAsString = list.stream().map(String::toUpperCase)
                .collect(Collectors.toList());

        listAsString.forEach(System.out::println);*/

        //soma de uma lista de numeros usando stream.

     /*   List<Integer> list = Arrays.asList(10,20,30,40,50);

        int listToInt = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(listToInt); */

        //Lista de inteiros que retorna QUANTIDADE de Numeros maior que 50

       /* List<Integer> list = Arrays.asList(10, 25, 60, 80, 40, 100, 45);

        long listMaiorQue50 = list.stream().filter(i -> i > 50)
                .count();
       System.out.println(listMaiorQue50);*/


        //Encontrando o maior número

        /*List<Integer> list = Arrays.asList(2, 5, 8, 3, 12, 1, 9);

        Optional listMoreThen = list.stream().max(Integer::compareTo);
        listMoreThen.ifPresent(System.out::println);*/

        //Ordenando uma lista de pessoas por faixa etaria de idade

    /*    List<Pessoas> listPessoas = Arrays.asList(
                new Pessoas("Ana", 17),
                new Pessoas("Carlos", 25),
                new Pessoas("João", 32),
                new Pessoas("Maria", 45),
                new Pessoas("Pedro", 15),
                new Pessoas("Paula", 52)
        );

        Map<String, List<Pessoas>>  agrupamentoPorFaixaEtaria =
                listPessoas.stream().collect(Collectors.groupingBy( p -> {
                    if(p.getIdade() < 18) return "Menores de 18";
                    else if (p.getIdade() >=18 && p.getIdade() < 30) return "18-30";
                    else if (p.getIdade() > 30 && p.getIdade() <=50) return "30-50";
                    else return "Maiores de 50";
                }));

        agrupamentoPorFaixaEtaria.forEach((faixa, lista) -> {
            System.out.println(faixa + ":");
            lista.forEach(p -> System.out.println(" " + p.getNome()));
        });*/


        //Ordenando uma lista de inteiros de crescente a decrescente

      /*  List<Integer> list = Arrays.asList(15, 42, 7, 89, 32);

        List<Integer> listOrdemCrescente = list.stream().sorted()
                .collect(Collectors.toList());
        listOrdemCrescente.forEach(System.out::println);

        System.out.println("Ordem Crescente");
        System.out.println("***************************");

        List<Integer> listOrdemDecrescente = list.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        listOrdemDecrescente.forEach(System.out::println);

        System.out.println("Ordem Decrescente");
        System.out.println("***************************");*/
    }
}