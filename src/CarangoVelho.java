import java.util.Scanner;

public class CarangoVelho {
    private Scanner scanner;

    public CarangoVelho(Scanner scanner) {
        this.scanner = scanner;
    }

    public void CarangoVelho() {
        int anoFabricacao = 0;
        float valorVeiculo = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;

        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;

        char desejaRepetir = 's';

        while (desejaRepetir == 's' || desejaRepetir == 'S') {
            System.out.println("Digite o ano de fabricação do veículo:");
            anoFabricacao = scanner.nextInt();
            System.out.println("Digite o valor do veículo:");
            valorVeiculo = scanner.nextInt();

            if (anoFabricacao <= 2000) {
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;
            }
            totalCarros++;

            valorDesconto = valorVeiculo * porcentagemDesconto;
            System.out.println("O desconto é: " + valorDesconto);
            System.out.println("O valor do veículo é: " + (valorVeiculo - valorDesconto));

            System.out.println("Deseja fazer mais cadastros? S - Sim / N = Não");
            desejaRepetir = scanner.next().charAt(0);
        }
        System.out.println("Total de carros seminovos: " + totalCarrosSemiNovos);
        System.out.println("Total de carros: " + totalCarros);
    }
}
