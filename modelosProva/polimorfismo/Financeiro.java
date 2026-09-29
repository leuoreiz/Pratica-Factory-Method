package modelosProva.polimorfismo;

/*
 * POLIMORFISMO na prática.
 *
 * O parâmetro é do tipo da classe BASE (Funcionario), então aceita
 * Analista, Gerente, Diretor e qualquer subclasse criada no futuro.
 * Cada objeto responde getBonificacao() do seu próprio jeito.
 */
public class Financeiro {

    private double total = 0;

    public void registra(Funcionario funcionario) {
        // Não precisa de if (tipo == Gerente)...: o Java chama a versão certa sozinho.
        total += funcionario.getBonificacao();
    }

    public double getTotal() {
        return total;
    }
}
