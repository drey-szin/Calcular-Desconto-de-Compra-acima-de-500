package br.com.visao;

import br.com.controle.Compra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        var valor = new Compra();
        double compra;

        System.out.print("Digite o valor da compra: ");
        compra = sc.nextDouble();
        valor.setCompra(compra);

        if(compra > 500){
            valor.setValorCompraDesconto(compra);
        }

        System.out.println("Valor da compra com desconto: " + valor.getDescontoCompra());
        System.out.println("Valor da compra sem desconto: " + compra);

        sc.close();
    }
}
