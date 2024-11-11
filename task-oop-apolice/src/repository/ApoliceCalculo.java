package repository;

import domain.ApoliceVeicular;
import service.IApoliceVeicular;

public class ApoliceCalculo implements IApoliceVeicular {

    private ApoliceVeicular apoliceVeicular;

    public ApoliceCalculo(ApoliceVeicular apolice) {
        this.apoliceVeicular = apolice;
    }


    @Override
    public double calcularValor() {
        if(apoliceVeicular.getSexo() == 'M' && apoliceVeicular.getIdade() <=25){
            return apoliceVeicular.getValorAutomovel()* 10/100;
        }else if(apoliceVeicular.getSexo() == 'M' && apoliceVeicular.getIdade() >25){
            return apoliceVeicular.getValorAutomovel()* 5/100;
        }else if(apoliceVeicular.getSexo() == 'F'){
            return apoliceVeicular.getValorAutomovel()* 2/100;
        }
        return 0;
    }
}
