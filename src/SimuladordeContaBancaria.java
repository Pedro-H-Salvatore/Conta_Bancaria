import java.util.Scanner;

public class SimuladordeContaBancaria {
    public static void main(String[] args) {
        int opcao = 0;
        double saldo = 2200, valor = 0;
        String nome, menu, tipoDeConta;
        menu = "\nDigite o que você deseja fazer\n\n1 - Consultar saldo\n2 - Transferência\n3 - Depósito\n4 - Sair";
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite seu nome");
            nome = scan.nextLine();
            System.out.println("Qual é seu tipo de conta?");
            tipoDeConta = scan.nextLine();
            System.out.printf("***********************************************\n\nSeja bem vindo o Banco X\nNome do Cliente: %s\nTipo de Conta: %s\n\n***********************************************\n", nome, tipoDeConta);
            while (opcao != 4) {
                System.out.println(menu);
                opcao = scan.nextInt();
                switch (opcao){
                    case 1:
                        System.out.printf("Seu saldo é de R$ %.2f", saldo);
                        break;
                    case 2:
                        System.out.println("Digite o valor que você deseja transferir");
                        valor = scan.nextDouble();
                        if (valor <= saldo) {
                            saldo = saldo - valor;
                            System.out.printf("Seu saldo atualizado é de R$ %.2f", saldo);
                        } else {
                            System.out.println("Saldo insuficiente");
                        }
                        break;
                    case 3:
                        System.out.println("Digite o valor que você vai depositar");
                        valor = scan.nextDouble();
                        if (valor <= 100000) {
                            saldo = saldo + valor;
                            System.out.printf("Seu saldo atualizado é de R$ %.2f", saldo);
                        }else {
                            System.out.println("o Banco X não permite depósitos acima do valor de R$ 100000,00");
                        }
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Formato de número inválido");
        }
    }
}
