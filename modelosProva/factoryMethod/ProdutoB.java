package modelosProva.factoryMethod;

import java.util.ArrayList;
import java.util.List;

/*
 * PAPEL NO PADRÃO: CONCRETE PRODUCT (outro produto concreto)
 *
 * Mostra dois casos comuns em enunciado:
 *  - acréscimo condicional ("fumantes pagam +50%");
 *  - documento "quando aplicável" (só entra na lista em certa condição).
 */
public class ProdutoB extends Produto {

    private final int idade;
    private final double capital;
    private final boolean fumante;
    private final boolean temAtestado;

    public ProdutoB(String cliente, int idade, double capital, boolean fumante, boolean temAtestado) {
        super("B-", cliente);   // número "B-000X"
        this.idade = idade;
        this.capital = capital;
        this.fumante = fumante;
        this.temAtestado = temAtestado;
    }

    @Override
    public double calcularValor() {
        double valor = (idade * 12) + (capital * 0.002);   // fórmula do enunciado
        if (fumante) {
            valor *= 1.50;                                 // +50%
        }
        return valor;
    }

    @Override
    public boolean validar() {
        // Aprovado se o capital for até 500 mil OU (||) se tiver atestado.
        // Ou seja: acima de 500 mil SEM atestado -> false -> rejeitado.
        return capital <= 500000 || temAtestado;
    }

    @Override
    public List<String> documentos() {
        // ArrayList permite adicionar itens (List.of sozinho não permite).
        List<String> docs = new ArrayList<>(List.of("RG", "CPF"));
        if (capital > 500000) {
            docs.add("Atestado médico");   // documento "quando aplicável"
        }
        return docs;
    }
}
