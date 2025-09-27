import java.util.Scanner;

public class Gasto {
    private String categoria;
    private double valor;
    private String data;
    
    //Getters
    public String getGasto() {

        String exibir ="Categoria: " + categoria +
                "\nValor: R$" + String.format("%.2f", valor) +
                "\nData: " + data + "\n--------------\n";
        return exibir;
    }
    public String getCategoria() { return categoria; }

    public double getValor() { return valor; }

    public String getData() {
        return data;
    }
    // Setters
    public void setCategoria(String categoria) {

        this.categoria = categoria;

    }

    public void setValor(double valor) {

        this.valor = valor;
    }

    public void setData(String data) {

        this.data = data;
    }

}
