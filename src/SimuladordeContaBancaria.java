import java.util.Scanner;

public class SimuladordeContaBancaria {
    public static void main(String[] args) {
        int opcao = 0;
        double saldo = 2200;
        String nome, menu, tipoDeConta;
        menu = "\nDigite o que você deseja fazer\n\n1 - Consultar saldo\n2 - Transferência\n3 - Depósito\n4 - Sair";
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite seu nome");
            nome = scan.nextLine();
            System.out.println("Qual é seu tipo de conta?");
            tipoDeConta = scan.nextLine();
            System.out.printf("***********************************************\n\nSeja bem vindo o Banco X\nNome do Cliente: %s\nTipo de Conta: %s\n\n***********************************************", nome, tipoDeConta);
            
        } catch (Exception e) {
            System.out.println("Formato de número inválido");
        }
    }
}
