import java.util.Scanner;

public class Default {

    private static Object Conversor;

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);;
        Object USD = new Object();
        CurrencyConverter currencyConverter = new CurrencyConverter("USD");
        System.out.println("Digite a moeda a ser convertida: ");

        String String = leitura.nextLine();

        try {
            Conversor novoConversor;
            novoConversor = currencyConverter.conversorDeMoeda(Conversor);
            System.out.println(novoConversor);

        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação! ");
        }
    }
}
