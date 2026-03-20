public class ItemCarrinho{
    private int id;
    private float qtde;
    private Produto produto;

    public ItemCarrinho() {
    }

    public ItemCarrinho(int id, float qtde, Produto produto) {
        this.id = id;
        this.qtde = qtde;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getQtde() {
        return qtde;
    }
    public void setQtde(float qtde) {
        this.qtde = qtde;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\n--- Item do Carrinho ---\n" +
                "ID Item: " + id + "\n" +
                "Quantidade: " + qtde + "\n" +
                produto + "\n";
    }
}