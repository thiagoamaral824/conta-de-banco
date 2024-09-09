import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Craque Daniel";
        String tipoConta = "Corrente";
        double saldo = 240.32;
        int opcao = 0;

        System.out.println("*******************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n*******************");

        String menu = """
                ** Digite uma opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao==1){
                System.out.println("Seu saldo é de: R$ " + saldo);
            }else if (opcao==2){
                System.out.println("Qual valor voce deseja transferir");
                double valor = leitura.nextDouble();
                if(valor > saldo ){
                    System.out.println("Saldo não suficiente para realizar esta operação!");
                }else{
                    saldo -= valor;
                    System.out.println("Novo saldo: R$ " + saldo);
                }
            } else if (opcao==3) {
                System.out.println("Valor recebido: " );
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: R$ " + saldo);
            } else if (opcao!=4) {
                System.out.println("Opção inválida!!");
            }
        }
    }
}
