package desafioDoBanco_Dio;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();
    private int contadorAgencia = 1000;
    private int contadorNumeroConta = 1000;

    public Conta criarContaCorrente() {
        ContaCorrente conta = new ContaCorrente(contadorAgencia, contadorNumeroConta);
        contas.add(conta);
        contadorNumeroConta++;
        if (contadorNumeroConta >= 10000) {
            contadorNumeroConta = 1000;
            contadorAgencia++;
            if (contadorAgencia >= 10000) {
                contadorAgencia = 1000;
            }
        }
        return conta;
    }

    public Conta criarContaPoupanca() {
        ContaPoupanca conta = new ContaPoupanca(contadorAgencia, contadorNumeroConta);
        contas.add(conta);
        contadorNumeroConta++;
        if (contadorNumeroConta >= 10000) {
            contadorNumeroConta = 1000;
            contadorAgencia++;
            if (contadorAgencia >= 10000) {
                contadorAgencia = 1000;
            }
        }
        return conta;
    }

    public List<Conta> getContas() {
        return contas;
    }
}
