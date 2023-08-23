public class cliente {
    String nome, sobrenome = "";
    int idade = 18;

    public cliente(String nome, String sobrenome, int idade) 
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    boolean ehMenor() {
        return idade < 18 ? true : false;
    }
}