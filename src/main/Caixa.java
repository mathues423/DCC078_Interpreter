package main;

import java.util.ArrayList;
import java.util.List;

public class Caixa {
    private List<Double> itens;
    private double desconto;

    public Caixa() {
        this.itens = new ArrayList<Double>();
    }

    public List<Double> getItens() {
        return itens;
    }

    public void setItens(List<Double> itens) {
        this.itens = itens;
    }

    public void addItens(double item){
        this.itens.add(item);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double calcularItens() {
        return Mercado.calcularItens(this.itens,this.desconto);
    }
}
