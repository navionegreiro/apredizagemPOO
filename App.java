
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        // declaração da função scanner e da fução car
        Scanner sc = new Scanner(System.in);
        Car[] ft = new Car[2];
        
        int opcao;
        //laço para a inserção de dados 
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
        //menu interativo ultilizando o while 
        do {
            System.out.println("\n======menu======");
            System.out.println("1 --> lista carros.");
            System.out.println("2 --> pesquisa carro.");
            System.out.println("3 --> editar placa do carro.");
            System.out.println("0 --> sair.");
            // inseção do valor da opção e a limpeza de buffer
            opcao = sc.nextInt();
            sc.nextLine();
            // a aplicação de casos para as opções do menu 
            switch (opcao) {
                //caso listagem de dados
                case 1 :
                    for (int i = 0; i < ft.length; i++) {
                        System.out.println(ft[i].toString());
                    }
                    break;
                //caso de busca de placa 
                case 2:
                    System.out.println("digit o nome do carro: ");
                    String placaBuscar = sc.nextLine();
                    boolean encontrou = false;

                    for (int i = 0; i < ft.length; i++) {
                        if (ft[i].getPlaca().equalsIgnoreCase(placaBuscar)){
                            encontrou = true;
                            System.out.println(ft[i].toString());

                        }
                    }
                    if (!encontrou) {
                        System.out.println("carro não encontrado !");
                    }

                    break;
                // caso editar dados 
                case 3:
                     
                    String editBuscar = sc.nextLine();
                    boolean editencontrou = false;

                    for (int i = 0; i < ft.length; i++) {
                        if(ft[i].getPlaca().equalsIgnoreCase(editBuscar));
                        editencontrou = true;
                        ft[i].setPlaca(sc.nextLine());
                    }
                    break;
                //caso sair do sistema
                case 0 :
                    System.out.println("você saiu do sistema.");
                    break;
                default:
                    System.out.println("opção invalida !");
                    throw new AssertionError();
            }
            //while nao permite que o sistema quebre até que opção seja igual a zero 
        } while (opcao != 0);
        sc.close();
    }
}