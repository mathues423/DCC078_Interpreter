package main;

import java.util.List;

public class Mercado {

    public static String formula = "itens / desconto";

    public static double calcularItens(List<Double> itens, double desconto) {
        String expressao_inicial = "itens";
        String expressao;
        for(int i = 0; i < itens.size()-1; i++) {
            expressao_inicial = expressao_inicial.replace("itens", Double.toString(itens.get(i))+" + itens");
        }
        expressao = formula.replace("itens", expressao_inicial.replace("itens", Double.toString(itens.get(itens.size()-1))));
        expressao = expressao.replace("desconto", Double.toString(desconto));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
