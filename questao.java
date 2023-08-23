public class cliente {
    String nome, sobrenome = "";
    var idade = 18;}
    
    public questao(String nome) {
        this.nome = nome;
    }

    boolean ehMenor() {
        return idade < 18 ? true : false;
    }
}