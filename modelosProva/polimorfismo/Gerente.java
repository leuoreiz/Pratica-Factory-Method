package modelosProva.polimorfismo;

/*
 * SUBCLASSE DE SUBCLASSE: Gerente é um Analista, que é um Funcionario.
 * Serve para mostrar o uso de super.metodo().
 */
public class Gerente extends Analista {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonificacao() {
        // super.getBonificacao() = executa a versão do Analista (10% do salário).
        // Se a regra do Analista mudar, o Gerente acompanha automaticamente.
        return super.getBonificacao() + 1000;
    }
}
