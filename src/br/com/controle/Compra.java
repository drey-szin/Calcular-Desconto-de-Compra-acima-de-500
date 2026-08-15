package br.com.controle;

public class Compra {
    double valorCompra, descontoCompra, valorFinalDesconto;

    public  void setCompra(double valorCompra){
        this.valorCompra = valorCompra;
    }
    public void setValorCompraDesconto(double valorCompra) {
        this.descontoCompra = valorCompra * 10 / 100;
        valorFinalDesconto = this.valorCompra - this.descontoCompra;
    }

    public double getDescontoCompra() {
        return valorFinalDesconto;
    }
}