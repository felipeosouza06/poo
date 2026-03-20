import java.util.Date;

public class TestaEcommerce {
    public static void main(String[] args) {
            Cliente cli1 = new Cliente("12345678901", "Felipe Souza", "Rua dos Passarinhos, 123");
        CarrinhoCompra cc1 = new CarrinhoCompra(1, new Date(), cli1);

        Produto pro1 = new Produto(10, "Memória RAM 16gb", "Memórria top", 500);
        cc1.adicionaItemCarrinho(100, 2, pro1);

        Produto pro2 = new Produto(7, "SSD 1tb", "SSD top", 750);
        cc1.adicionaItemCarrinho(50, 1, pro2);

        System.out.println(cc1.toString());
        cc1.calculaTotalCompra();
    }
}