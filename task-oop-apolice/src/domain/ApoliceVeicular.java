package domain;

public class ApoliceVeicular {

    private Integer numero;
    private String nome;
    private Integer idade;
    private Character sexo;
    private Double valorAutomovel;

    public ApoliceVeicular(Integer numero, String nome, Integer idade, Character sexo, Double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Character getSexo() {
        return sexo;
    }

    public Double getValorAutomovel() {
        return valorAutomovel;
    }

    @Override
    public String toString() {
        return "ApoliceVeicular{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", valorAutomovel=" + valorAutomovel +
                '}';
    }
}
