package modelosProva.polimorfismo;

/*
 * SUBCLASSE: herda nome e salário de Funcionario (extends).
 */
public class Analista extends Funcionario {

    public Analista(String nome, double salario) {
        super(nome, salario);   // super(...) = chama o construtor da classe mãe
    }

    @Override
    public double getBonificacao() {
        return salario * 0.10;  // 10% do salário
    }
}
