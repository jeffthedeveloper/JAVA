# Projeto Java - Exemplo de Programação Orientada a Objetos (OOP)

Este é um repositório de um projeto Java simples, focado em demonstrar conceitos básicos de Programação Orientada a Objetos (OOP). O projeto define uma classe `cliente` e a instancia a partir de uma classe `Main`.

## Estrutura do Projeto

O código-fonte está estruturado em torno de duas classes principais:

  * **`cliente.java`**:

      * Uma classe de modelo (POJO) que representa um cliente.
      * **Atributos**: `nome` (String), `sobrenome` (String), `idade` (int).
      * **Construtor**: `public cliente(String nome, String sobrenome, int idade)` para inicializar o objeto.
      * **Método**: `boolean ehMenor()` que retorna `true` se a idade for menor que 18.

  * **`Main.java`**:

      * A classe de entrada (entry point) da aplicação.
      * Contém o método `public static void main(String[] args)`.
      * Demonstra a instanciação da classe `cliente` com valores de exemplo ("josé", "chavier", 25).

*(Nota: O arquivo `questao.java` parece ser um rascunho ou arquivo de teste separado, pois contém uma declaração de classe conflitante e sintaxe de campo de classe (`var idade = 18;`) que não é padrão para declaração de atributos de instância em Java.)*

## Tecnologias Utilizadas

  * **Java**
  * **JDK** (Java Development Kit) para compilação e execução.

## Como Executar o Projeto

Para compilar e executar este projeto localmente, siga os passos abaixo.

1.  **Pré-requisito:** Certifique-se de ter o **JDK** (Java Development Kit) instalado e configurado corretamente no seu sistema (você pode verificar com `java -version` e `javac -version`).

2.  **Navegue até o Diretório:**
    Abra um terminal e navegue até a pasta que contém os arquivos `.java` (ex: `.../JAVA-582d9f73c2babfde403cebcaf8ee3dd522c6f2f3/`).

3.  **Compile os Arquivos Java:**
    Execute o compilador Java para criar os arquivos `.class` a partir dos arquivos `.java`.

    ```bash
    javac Main.java cliente.java
    ```

4.  **Execute a Classe Principal:**
    Após a compilação bem-sucedida, execute a classe `Main` (sem a extensão `.java` ou `.class`).

    ```bash
    java Main
    ```

    *(Nota: A execução deste projeto, como está escrito em `Main.java`, não produzirá nenhuma saída no console, pois apenas instancia o objeto `cliente` sem utilizar métodos de impressão, como `System.out.println()`.)*
