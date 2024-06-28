package desafioDoBanco_Dio;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar Conta Corrente");
            System.out.println("2. Criar Conta Poupança");
            System.out.println("3. Realizar Depósito");
            System.out.println("4. Realizar Saque");
            System.out.println("5. Realizar Transferência");
            System.out.println("6. Verificar Saldo");
            System.out.println("7. Sair");
            
            int opcao = obterOpcao(scanner);
            
            try {
                switch (opcao) {
                    case 1:
                        Conta cc = banco.criarContaCorrente();
                        System.out.println("Conta Corrente criada: Agência " + cc.getAgencia() + " / Conta " + cc.getNumero());
                        break;
                    case 2:
                        Conta cp = banco.criarContaPoupanca();
                        System.out.println("Conta Poupança criada: Agência " + cp.getAgencia() + " / Conta " + cp.getNumero());
                        break;
                    case 3:
                        int numContaDeposito = obterNumeroConta(scanner, banco);
                        Conta contaDeposito = banco.getContas().get(numContaDeposito - 1);
                        double valorDeposito = obterValor(scanner, "Valor do depósito: ");
                        contaDeposito.depositar(valorDeposito);
                        System.out.println("Depósito realizado com sucesso.");
                        break;
                    case 4:
                        int numContaSaque = obterNumeroConta(scanner, banco);
                        Conta contaSaque = banco.getContas().get(numContaSaque - 1);
                        double valorSaque = obterValor(scanner, "Valor do saque: ");
                        contaSaque.sacar(valorSaque);
                        System.out.println("Saque realizado com sucesso.");
                        break;
                    case 5:
                        int numContaOrigem = obterNumeroConta(scanner, banco);
                        Conta contaOrigem = banco.getContas().get(numContaOrigem - 1);
                        int numContaDestino = obterNumeroConta(scanner, banco);
                        Conta contaDestino = banco.getContas().get(numContaDestino - 1);
                        double valorTransferencia = obterValor(scanner, "Valor da transferência: ");
                        contaOrigem.transferir(contaDestino, valorTransferencia);
                        System.out.println("Transferência realizada com sucesso.");
                        break;
                    case 6:
                        int numContaSaldo = obterNumeroConta(scanner, banco);
                        Conta contaSaldo = banco.getContas().get(numContaSaldo - 1);
                        System.out.println("Saldo da conta " + numContaSaldo + ": " + contaSaldo.getSaldo());
                        break;
                    case 7:
                        System.out.println("Saindo...");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }
    }

    private static int obterOpcao(Scanner scanner) {
        while (true) {
            System.out.print("Digite a opção desejada: ");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Opção inválida. Por favor, insira um número.");
                scanner.next(); 
            }
        }
    }

    private static int obterNumeroConta(Scanner scanner, Banco banco) {
        while (true) {
            System.out.print("Número da conta: ");
            if (scanner.hasNextInt()) {
                int numeroConta = scanner.nextInt();
                if (numeroConta > 0 && numeroConta <= banco.getContas().size()) {
                    return numeroConta;
                } else {
                    System.out.println("Número de conta inválido. Por favor, tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); 
            }
        }
    }

    private static double obterValor(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Valor inválido. Por favor, insira um número.");
                scanner.next(); 
            }
        }
    }
}
