import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Gasto conta = new Gasto();
        ArrayList<Gasto> vetorGastos = new ArrayList<>();

        int num;
        do {
            System.out.println("======================");
            System.out.println("1 - Adicionar gasto");
            System.out.println("2 - Remover gasto ");
            System.out.println("3 - Exibir dados");
            System.out.println("4 - Sair");
            System.out.println("======================");
            num = input.nextInt();
            input.nextLine(); // Limpa buffer

            switch (num) {
                case 1:
                    System.out.println("Categoria: ");
                    String categoria = input.nextLine();

                    System.out.println("Valor: ");
                    double valor = input.nextDouble();
                    input.nextLine(); // Limpa buffer

                    System.out.println("Data: ");
                    String data = input.nextLine();

                    // Cria e adiciona um objeto no array
                    Gasto novoGasto = new Gasto();
                    novoGasto.setCategoria(categoria);
                    novoGasto.setValor(valor);
                    novoGasto.setData(data);
                    vetorGastos.add(novoGasto);

                    System.out.println("Adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Removendo gastos...");
                    break;

                case 3:
                    System.out.println("===================");
                    System.out.println("====  Gastos  ====");
                    if (vetorGastos.isEmpty()) {
                        System.out.println("Nenhum gasto cadastrado.");
                        continue;
                    } else {
                        for (Gasto xpto : vetorGastos) {
                            System.out.println(xpto.getGasto());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;
            }
        } while (num != 4);
    }
}
