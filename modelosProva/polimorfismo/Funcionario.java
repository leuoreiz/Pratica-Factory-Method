package modelosProva.polimorfismo;

/*
 * CLASSE BASE ABSTRATA
 *
 * Junta o que é comum a todo funcionário (nome, salário).
 * "abstract": não existe um funcionário "genérico"; só Analista, Gerente, Diretor.
 */
public abstract class Funcionario {

    protected final String nome;       // protected: as subclasses enxergam
    protected final double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // MÉTODO ABSTRATO: todo funcionário TEM bonificação, mas cada tipo
    // calcula de um jeito. Fica sem corpo e as subclasses implementam.
    // Se o método saísse daqui, o Financeiro não conseguiria chamar
    // getBonificacao() em um Funcionario.
    public abstract double getBonificacao();
}
