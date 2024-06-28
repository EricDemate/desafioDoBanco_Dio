# Desafio do Banco - DIO

## Descrição

Este projeto, é uma simulação de um sistema bancário simples em Java. Nele eu fiz um sistema permite a criação de contas correntes e poupanças, e a realização de operações básicas como depósitos, saques e transferências. Eu desenvolvi este projeto utilizando os conhecimentos adquiridos no Bootcamp Santander 2004 em parceria com a DIO, foi utilizado conceitos de Programação Orientada a Objetos e boas práticas de tratamento de exceções.

## Funcionalidades

- **Criação de Contas**: Permite criar contas correntes e poupanças com número de agência e conta sequenciais.
- **Operações Bancárias**:
  - Depósitos
  - Saques
  - Transferências entre contas
  - Consulta de saldo
- **Tratamento de Exceções**: Garante a robustez do sistema, lidando com entradas inválidas e condições de erro de maneira adequada.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

1. **Banco.java**:
   - Gerencia a criação e armazenamento das contas.
   - Mantém um registro das contas criadas e assegura que tanto as contas quanto as agências tenham números de quatro dígitos.

2. **Conta.java**:
   - Classe base abstrata para as contas bancárias.
   - Define os atributos e métodos comuns para as contas correntes e poupanças, como `agencia`, `numero`, `saldo`, `depositar`, `sacar` e `transferir`.

3. **ContaCorrente.java**:
   - Herda de `Conta`.
   - Representa uma conta corrente no sistema.

4. **ContaPoupanca.java**:
   - Herda de `Conta`.
   - Representa uma conta poupança no sistema.

5. **Main.java**:
   - Classe principal que contém o menu interativo para o usuário.
   - Permite que o usuário interaja com o sistema, realizando operações bancárias por meio de um console.

## Guia de Uso

### Requisitos

- Java 17 ou superior
- IDE de sua escolha (Eclipse, IntelliJ IDEA, etc.)

### Compilação e Execução

1. **Clonar o Repositório**:
   - Clone o repositório para sua máquina local usando `git` ou baixe o arquivo zip e extraia-o.
   
   ```bash
   git clone https://github.com/EricDemate/desafioDoBanco_Dio.git
