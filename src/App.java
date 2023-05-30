import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // new CarangoVelho(scanner).CarangoVelho();
        LeitorNota lei = new LeitorNota(scanner, 1, "Mousepad", 10, 50.0f);

        System.out.println("valor total: " + lei.getinvoiceAmount());

        scanner.close();
    }
}
