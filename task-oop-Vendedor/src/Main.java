import controller.VendedorController;
import domain.Vendedor;
import repository.VendedorRepository;

public class Main {

    public static void main(String[] args) {
        Vendedor jose = new Vendedor(1,"Jose", 10);
        VendedorRepository venda = new VendedorController(jose);
        System.out.println(venda.imprimirVenda(1000));
    }
}