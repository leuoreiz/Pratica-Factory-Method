package modelosProva.factoryMethod;

/*
 * PAPEL NO PADRÃO: CONCRETE CREATOR (criador concreto)
 *
 * Mesma ideia do CriadorA, mas cria o ProdutoB.
 * Para um tipo novo (ex.: ProdutoC) basta criar ProdutoC + CriadorC,
 * sem mexer em nenhuma classe existente (princípio Aberto/Fechado).
 */
public class CriadorB extends Criador {

    private final String cliente;
    private final int idade;
    private final double capital;
    private final boolean fumante;
    private final boolean temAtestado;

    public CriadorB(String cliente, int idade, double capital, boolean fumante, boolean temAtestado) {
        this.cliente = cliente;
        this.idade = idade;
        this.capital = capital;
        this.fumante = fumante;
        this.temAtestado = temAtestado;
    }

    @Override
    protected Produto criarProduto() {
        return new ProdutoB(cliente, idade, capital, fumante, temAtestado);   // único "new ProdutoB"
    }
}
