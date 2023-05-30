import java.util.Scanner;

public class LeitorNota {
    private Scanner scanner;

    private int codigoItem;
    private String descricao;
    private int quantidade;
    private float precoUnitario;

    public LeitorNota(Scanner scanner, int codigoItem, String descricao, int quantidade, float precoUnitario) {
        this.scanner = scanner;
        this.setCodigoItem(codigoItem);
        this.setDescricao(descricao);
        this.setQuantidade(quantidade);
        this.setPrecoUnitario(precoUnitario);

    }

    public double getinvoiceAmount() {
        return quantidade * precoUnitario;
    }

    public Scanner getScanner() {
        return this.scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getCodigoItem() {
        return this.codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }

    public float getPrecoUnitario() {
        return this.precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if (precoUnitario < 0) {
            this.precoUnitario = 0;
        } else {
            this.precoUnitario = precoUnitario;
        }
    }

}
