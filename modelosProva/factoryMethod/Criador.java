package modelosProva.factoryMethod;

/*
 * PAPEL NO PADRÃO: CREATOR (criador abstrato)
 *
 * É o coração do Factory Method. Ele tem duas coisas:
 *
 *  1) O MÉTODO FÁBRICA (criarProduto): abstrato, sem corpo.
 *     O Criador NÃO sabe qual produto vai ser criado; quem decide é a subclasse.
 *
 *  2) O FLUXO COMUM (processar): o passo a passo que é igual para todos os tipos.
 *     Ele usa o produto só pelo tipo abstrato "Produto".
 *
 * Regras que o professor cobra:
 *  - aqui NÃO pode ter "new ProdutoA()" nem "new ProdutoB()";
 *  - aqui NÃO pode ter if/switch decidindo o tipo do produto.
 */
public abstract class Criador {

    // MÉTODO FÁBRICA.
    // protected: só as subclasses implementam/usam; o Main não chama direto.
    // abstract: cada CriadorX é obrigado a dizer qual produto cria.
    protected abstract Produto criarProduto();

    // FLUXO COMUM.
    // final = nenhuma subclasse pode sobrescrever este método,
    // então o passo a passo é garantido igual para todos.
    public final void processar() {
        // Passo 1: pede o produto ao método fábrica.
        // Aqui o Java chama o criarProduto() da subclasse (CriadorA ou CriadorB).
        Produto produto = criarProduto();

        // Passo 2: valida. Este if é de VALIDAÇÃO (permitido), não de tipo.
        if (!produto.validar()) {   // "!" = negação: se NÃO for válido...
            System.out.println("Contratação REJEITADA para " + produto.cliente);
            return;                 // return encerra o método aqui: não imprime resumo
        }

        // Passo 3: tudo certo, imprime o resumo padronizado.
        System.out.println(produto.gerarResumo());
    }
}
