package domain;

public class Vendedor {

    private int codigo;
    private String nome;
    private double percentualComissao;

    public Vendedor(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", percentualComissao=" + percentualComissao +
                '}';
    }
}
