package modelosProva.factoryMethod;

/*
 * PAPEL NO PADRÃO: CONCRETE CREATOR (criador concreto)
 *
 * A ÚNICA responsabilidade dele é dizer: "o produto que eu crio é o ProdutoA".
 * Ele NÃO reescreve o fluxo (processar é final no Criador).
 *
 * Como o método fábrica não recebe parâmetros, os dados necessários para
 * montar o produto entram pelo CONSTRUTOR do criador e ficam guardados aqui.
 */
public class CriadorA extends Criador {

    private final String cliente;
    private final double base;
    private final int idade;

    public CriadorA(String cliente, double base, int idade) {
        this.cliente = cliente;
        this.base = base;
        this.idade = idade;
    }

    // Implementação do método fábrica.
    @Override
    protected Produto criarProduto() {
        // ÚNICO lugar do sistema onde existe "new ProdutoA".
        // O retorno é do tipo Produto (abstrato): quem chamou não sabe que é um A.
        return new ProdutoA(cliente, base, idade);
    }
}
