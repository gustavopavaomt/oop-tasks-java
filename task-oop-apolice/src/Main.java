import domain.ApoliceVeicular;
import repository.ApoliceCalculo;
import service.IApoliceVeicular;

public class Main{

    public static void main(String[] args) {

        ApoliceVeicular apolice = new ApoliceVeicular(1,"Apolice test",
                26,'M',69.000);
        IApoliceVeicular acordo = new ApoliceCalculo(apolice);
        Double value = acordo.calcularValor();
        System.out.println(apolice.toString());
        System.out.println("O valor do acordo foi de: "+ value);
    }
}