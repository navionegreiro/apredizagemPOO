
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // declaração da função scanner e da fução car
        Scanner sc = new Scanner(System.in);
        Car[] ft = new Car[2];

        String opcao;
        // laço para a inserção de dados
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
        // menu interativo ultilizando o while
        do {
            System.out.println("\n======menu======");
            System.out.println("1 --> lista carros.");
            System.out.println("2 --> pesquisa carro.");
            System.out.println("3 --> editar  carro.");
            System.out.println("4 --> remover carro.");
            System.out.println("0 --> sair.");
            // inseção do valor da opção e a limpeza de buffer
            opcao = sc.nextLine();
            
            // a aplicação de casos para as opções do menu
            switch (opcao) {
                // caso listagem de dados
                case "1":
                    for (int i = 0; i < ft.length; i++) {
                        if (ft[i] != null) {
                            System.out.println(ft[i].toString());
                        }
                        
                    }
                    break;
                // caso de busca de placa
                case "2":
                    System.out.print("digit o placa do carro: ");
                    String placaBuscar = sc.nextLine();
                    boolean encontrou = false;

                    for (int i = 0; i < ft.length; i++) {
                        if (ft[i].getPlaca().equalsIgnoreCase(placaBuscar)) {
                            encontrou = true;
                            System.out.println(ft[i].toString());

                        }
                    }
                    if (!encontrou) {
                        System.out.println("carro não encontrado !");
                    }

                    break;
                // caso editar dados
                case "3":
                    do {
                        System.out.println("===escolha===");
                        System.out.println("1 --> editar a placa.");
                        System.out.println("2 --> editar cor.");
                        System.out.println("3 --> sair do sistema.");
                        opcao = sc.nextLine();
                        

                        switch (opcao) {
                            case "1":
                                System.out.print("digite a placa do que vc quer edita: ");
                                String plBuscar = sc.nextLine();
                                boolean plencontrou = false;

                                for (int i = 0; i < ft.length; i++) {
                                    System.out.println(ft[i].toString());

                                    if (ft[i].getPlaca().equalsIgnoreCase(plBuscar)) {

                                        plencontrou = true;
                                        System.out.print("digite a placa nova: ");
                                        ft[i].setPlaca(sc.nextLine());

                                        System.out.print("placa alterada.");
                                        System.out.println(ft[i].toString());
                                    }
                                }
                                break;
                            case "2":
                                boolean corencontrou = false;
                                System.out.println("digite a placa do carro que vc quer alterar a cor: ");
                                String corBuscar = sc.nextLine();
                                for (int i = 0; i < ft.length; i++) { 
                                    
                                    if (ft[i] != null && ft[i].getPlaca().equalsIgnoreCase(corBuscar)) {

                                        corencontrou = true;
                                        System.out.print("digite a cor nova: ");
                                        ft[i].setCor(sc.nextLine());

                                        System.out.println("cor alterada.");
                                        System.out.println(ft[i].toString());
                                    }

                                }
                                break;
                            case "3":
                                System.out.println(" você saiu da editagem.");
                                break;
                            default:
                                System.out.println("opção invalida, tente usar uma opção válida.");
                                break;
                        }
                        break;
                    } while (!opcao.equals("3"));
                    break;
                case "4":
                    System.out.print("digite a placa do carro que vc quer remover: ");
                    String plaBuscar = sc.nextLine();
                    boolean rencontrou = false;

                    for (int i = 0; i < ft.length; i++) {
                        if (ft[i] != null && ft[i].getPlaca().equalsIgnoreCase(plaBuscar)) {

                            rencontrou = true;
                            System.out.println(ft[i]);
                            System.out.print("deseja mesmo apagar o carro (sim/não) ?");

                            String pgrNS = sc.nextLine();

                            if (pgrNS.equalsIgnoreCase("sim")) {
                                ft[i] = null;
                                System.out.println("carro apagado.");
                            } else if (pgrNS.equalsIgnoreCase("não") || pgrNS.equalsIgnoreCase("nao")) {
                                System.out.println("exclusão cancelada !");

                            } else {
                                System.out.println("opção invalida !");
                            }

                        }
                    }
                    break;
                // caso sair do sistema
                case "0":
                    System.out.println("você saiu do sistema.");
                    break;
                default:
                    System.out.println("opção invalida !");
                    break;

            }
            // while nao permite que o sistema quebre até que opção seja igual a zero
        } while (!opcao.equals("0"));
        sc.close();
    }
}