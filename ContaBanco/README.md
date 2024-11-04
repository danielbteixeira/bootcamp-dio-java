# Desafio - Conta Bancária
Este repositório foi criado para fins didáticos e representa o desafio de criar um simulador de conta bancária através do terminal.

Este projeto foi criado em colaboração entre a [Digital Innovation One](https://www.dio.me/) e o Santander, como parte do Bootcamp Claro - Java com Spring Boot.


## Objetivo
Praticar todo o conteúdo que foi aprendido no módulo de Sintaxe.

## Ferramentas e tecnologias
![Git](https://img.shields.io/badge/Git-000?style=for-the-badge&logo=git&logoColor=E94D5F)

![GitHub](https://img.shields.io/badge/GitHub-000?style=for-the-badge&logo=github&logoColor=30A3DC)

![Java](https://img.shields.io/badge/Java-000?style=for-the-badge&logo=openjdk&logoColor=ED8B00) 

## Funcionamento
O programa solicita que o usuário insira alguns dados via terminal (número da conta, agência e nome do cliente) e, em seguida, exibe uma mensagem de confirmação com essas informações, juntamente com o saldo inicial disponível.

## Descrição do desafio
1. Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.



| Atributo  | Tipo     | Exemplo   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Nome Cliente | Texto    | MARIO ANDRADE
| Saldo | Decimal |237.48



2. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

* Programa: "Por favor, digite o número da Agência !"
* Usuário: 1021 *(depois ENTER para o próximo campo)* 



3. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".*

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.

## Requisitos

Para executar este projeto, você precisa ter:

- [Java JDK](<https://www.oracle.com/java/technologies/javase-jdk11-downloads.html>) instalado na sua máquina (versão 8 ou superior).
- Um terminal ou IDE (como Eclipse, IntelliJ IDEA ou VS Code com extensão de Java) para compilar e executar o código.

## Como Executar o Projeto

### Passo 1: Clonar o Repositório (Opcional)

Se você está clonando o projeto de um repositório Git, execute o seguinte comando no terminal:

```bash
git clone <https://github.com/seu-usuario/ContaBanco.git>
cd ContaBanco


