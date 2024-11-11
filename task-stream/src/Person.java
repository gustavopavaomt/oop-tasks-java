public class Person {

    String nome;
    int idade;
    String cidade;

    Person(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return nome + " (" + idade + ") de " + cidade;
    }
}
