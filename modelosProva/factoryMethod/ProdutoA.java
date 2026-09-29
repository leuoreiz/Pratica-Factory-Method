package modelosProva.factoryMethod;

import java.util.List;

/*
 * PAPEL NO PADRÃO: CONCRETE PRODUCT (produto concreto)
 *
 * Uma "linha de produto" de verdade (no enunciado seria, por exemplo, Apólice Auto).
 * Aqui ficam AS REGRAS DE NEGÓCIO DESTE TIPO: fórmula, validação, documentos.
 *
 * extends Produto = herda numero, cliente, dataEmissao e gerarResumo().
 */
public class ProdutoA extends Produto {

    // Dados que só este tipo precisa (private: ninguém de fora mexe)
    private final double base;   // ex.: valor FIPE do carro
    private final int idade;     // ex.: idade do condutor

    public ProdutoA(String cliente, double base, int idade) {
        super("A-", cliente);   // chama o construtor de Produto: gera o número "A-000X"
        this.base = base;
        this.idade = idade;
    }

    // @Override = "estou implementando/substituindo o método da classe mãe".
    // Se errar o nome do método, o compilador avisa.
    @Override
    public double calcularValor() {
        double anual = base * 0.08;   // 8% ao ano
        if (idade < 25) {
            anual *= 1.30;            // +30%  (x *= 1.30 é o mesmo que x = x * 1.30)
        }
        // Este if é REGRA DE NEGÓCIO e pode ficar aqui dentro do produto.
        // O que não pode é if decidindo QUAL produto criar.
        return anual / 12;            // devolve o valor mensal
    }

    @Override
    public boolean validar() {
        return base >= 50000;   // se for menor que o mínimo, devolve false e o Criador rejeita
    }

    @Override
    public List<String> documentos() {
        // List.of cria uma lista fixa (não dá para adicionar depois)
        return List.of("CNH", "CRLV", "Comprovante de residência");
    }
}
