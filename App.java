
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] ft = new Car[2];
        
        int opcao;

        for (int i = 0; i < ft.length; i++) {
            ft[i] = new Car();

            System.out.println(" digite a placa: ");
            ft[i].setPlaca(sc.nextLine());
            System.out.println("digite a marca: ");
            ft[i].setMarca(sc.nextLine());
            System.out.println("digite o modelo: ");
            ft[i].setModelo(sc.nextLine());
            System.out.println("digite o ano do carro: ");
            ft[i].setAno(sc.nextInt());
            System.out.println("digite a cor do carro: ");
            sc.nextLine();
            ft[i].setCor(sc.nextLine());

            
        }

        do {
            System.out.println("\n======menu======");
            System.out.println("1--> lista carros.");
            System.out.println("2-- > pesquisa carro.");
            System.out.println("0 --> sair.");
            
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 :
                    for (int i = 0; i < ft.length; i++) {
                        System.out.println(ft[i].toString());
                    }
                case 2:
                    System.out.println("digit o nome do carro: ");
                    String placaBuscar = sc.nextLine();
                    boolean encontrou = false;

                    for (int i = 0; i < ft.length; i++) {
                        if (ft[i].getPlaca().equalsIgnoreCase(placaBuscar)){
                            encontrou = true;

                        }
                    }
                    if (!encontrou) {
                        System.out.println("carro não encontrado !");
                    }
                case 0 :
                    System.out.println("você saiu do sistema.");
                    break;
                default:
                    System.out.println("opção invalida !");
                    throw new AssertionError();
            }
        } while (opcao != 0);
        sc.close();
    }
}