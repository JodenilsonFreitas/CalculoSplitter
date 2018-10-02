package Logica;

public class Contas {

    public double[] calculo(double SplitterA) {
        double resultado[] = new double[2];

        if (SplitterA == 0) {
            System.out.println("nenhum splitter selecionado");
        }
        if (SplitterA == 1) {

            resultado[0] = 3.7;
            resultado[1] = 3.7;
        }

        return resultado;
    }

}
