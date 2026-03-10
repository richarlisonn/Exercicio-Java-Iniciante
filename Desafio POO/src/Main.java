
public class Main {
    public static void main(String[] args) {

        Pessoa inae = new Pessoa("Inae", 16, "SP");
        Pessoa richarlison = new Pessoa("Richarlison", 18, "SP");

        inae.aprensentar();
        richarlison.aprensentar();
    }
}

class Pessoa {
    String nome;
    int idade;
    String cidade;

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public void aprensentar(){
        System.out.println("OLá, meu nome é " + nome + " Tenho " + idade + " anos e moro em " + cidade + "!");
    }
}
