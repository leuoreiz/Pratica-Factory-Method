package modelosProva.polimorfismo;

/*
 * SUBCLASSE com atributo próprio (subordinados).
 * Regra do slide: 1,5% do salário x número de funcionários sob sua gestão.
 */
public class Diretor extends Funcionario {

    private final int subordinados;

    public Diretor(String nome, double salario, int subordinados) {
        super(nome, salario);            // a parte comum vai para a mãe
        this.subordinados = subordinados; // a parte específica fica aqui
    }

    @Override
    public double getBonificacao() {
        return salario * 0.015 * subordinados;
    }
}
