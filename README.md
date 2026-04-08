# Simulador de Conta Bancária





Projeto simples em Java que simula operações básicas de uma conta bancária via terminal.

# Sobre o projeto

Este programa permite ao usuário interagir com uma conta bancária simulada, realizando operações como consulta de saldo, transferências e depósitos.

O sistema funciona através de um menu interativo no terminal.

- Funcionalidades
- Cadastro de nome e tipo de conta
- Consulta de saldo
- Transferência de valores
- Depósito de dinheiro
- Encerramento do sistema
- Regras de negócio
- Saldo inicial: R$ 2200,00
- Transferências só são realizadas se houver saldo suficiente
- Depósitos limitados a R$ 100.000,00
- Entradas inválidas são tratadas com exceção

# Demonstração
Digite seu nome
- Pedro

Qual é seu tipo de conta?
- Corrente

***********************************************

- Seja bem vindo ao Banco X
- Nome do Cliente: Pedro
- Tipo de Conta: Corrente

***********************************************

- Digite o que você deseja fazer

- 1 - Consultar saldo
- 2 - Transferência
- 3 - Depósito
- 4 - Sair

  # Como executar
- Pré-requisitos
Java instalado (JDK 8 ou superior)

## Passo a passo
### Clone o repositório
git clone https://github.com/Pedro-H-Salvatore/Conta_Bancaria.git

### Acesse a pasta
cd Conta_Bancaria

### Compile o programa
javac SimuladordeContaBancaria.java

### Execute
java SimuladordeContaBancaria

## Tecnologias
Java
Scanner (entrada de dados via terminal)
