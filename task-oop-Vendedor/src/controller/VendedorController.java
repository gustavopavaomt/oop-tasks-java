package controller;

import domain.Vendedor;
import repository.VendedorRepository;

public class VendedorController implements VendedorRepository {

    private Vendedor vendedor;

    public VendedorController(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public double calcularPagamnetoComissao(double valorVenda) {
        return valorVenda* vendedor.getPercentualComissao() /100;
    }

    @Override
    public double calcularPagamnetoComissao(double valorVenda, double valorDesconto) {
        return calcularPagamnetoComissao(valorVenda) - valorDesconto;
    }

    @Override
    public String imprimirVenda(double valorVenda, double desconto) {
         return "Venda{" +
                "codigo=" + vendedor.getCodigo() +
                ", nome='" + vendedor.getNome() + '\'' +
                ", Valor da venda=" + valorVenda +
                ", desconto=" + desconto +
                ", Comissao de:" + calcularPagamnetoComissao(valorVenda) +
                '}';
    }

    @Override
    public String imprimirVenda(double valorVenda) {
        return "VendaSemDesconto{" +
                "codigo=" + vendedor.getCodigo() +
                ", nome='" + vendedor.getNome() + '\'' +
                ", Valor da venda=" + valorVenda +
                ", Comissao de:" + calcularPagamnetoComissao(valorVenda) +
                '}';
    }
}
