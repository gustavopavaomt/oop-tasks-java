package repository;

public interface VendedorRepository {

    double calcularPagamnetoComissao(double valorVenda);

    double calcularPagamnetoComissao(double valorVenda, double valorDesconto);

    String imprimirVenda(double valorVenda, double desconto );

    String imprimirVenda(double valorVenda);
}
