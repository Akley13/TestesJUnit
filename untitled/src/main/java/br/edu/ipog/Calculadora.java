package br.edu.ipog;

public class Calculadora {

    public int somar (int a, int b){
        return a + b;
    }

    public int subtrair (int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();

        System.out.println("2 + 3 = 5 - " + (calcular.somar(2,3) == 5));
        System.out.println("5 + 5 = 10 - " + (calcular.somar(5,5) == 10));
        System.out.println("1 + 1 = 2 - " + (calcular.somar(1,1) == 2));

        System.out.println("2 - 3 = -1 - " + (calcular.subtrair(2,3) == -1));
        System.out.println("5 - 5 = 0 - " + (calcular.subtrair(5,5) == 0));
        System.out.println("1 - 1 = 0 - " + (calcular.subtrair(1,1) == 0));
    }

}
