package modelosProva.factoryMethod;

import java.time.LocalDate;   // classe do Java para datas (dia/mês/ano)
import java.util.List;        // tipo "lista" do Java

/*
 * PAPEL NO PADRÃO: PRODUCT (produto abstrato)
 *
 * É o "molde" de tudo que o método fábrica pode criar.
 * O Criador só conhece ESTA classe, nunca ProdutoA ou ProdutoB.
 *
 * Por que classe abstrata e não interface?
 *  - Tem ATRIBUTOS comuns (numero, cliente, dataEmissao).
 *  - Tem um método PRONTO que vale para todos (gerarResumo).
 *  - Interface não guarda atributos nem tem construtor.
 * Se o enunciado só pedir "contrato" (métodos sem código), use interface.
 *
 * "abstract" = não dá para fazer new Produto(); só new das subclasses.
 */
public abstract class Produto {

    // static = pertence à CLASSE, não a cada objeto.
    // Existe um único contador compartilhado por todos os produtos,
    // por isso cada produto novo pega o próximo número.
    private static int contador = 0;

    // protected = a própria classe e as subclasses (ProdutoA, ProdutoB) enxergam.
    // final = recebe valor uma vez (no construtor) e não muda mais.
    protected final String numero;
    protected final String cliente;
    protected final LocalDate dataEmissao;

    // Construtor protected: só as subclasses chamam, via super("A-", cliente).
    protected Produto(String prefixo, String cliente) {
        contador++;                                                // 1, 2, 3...
        this.numero = prefixo + String.format("%04d", contador);   // "%04d" = 4 dígitos com zeros: A-0001
        this.cliente = cliente;
        this.dataEmissao = LocalDate.now();                        // data de hoje
    }

    // ------------------------------------------------------------------
    // O que MUDA de um tipo para outro -> método ABSTRATO (sem corpo).
    // Cada subclasse é OBRIGADA a implementar com a sua regra.
    // ------------------------------------------------------------------
    public abstract double calcularValor();       // cada tipo tem sua fórmula
    public abstract boolean validar();            // true = aprovado, false = rejeitado
    public abstract List<String> documentos();    // cada tipo exige documentos diferentes

    // ------------------------------------------------------------------
    // O que NÃO muda -> método CONCRETO, escrito uma vez só aqui.
    // Repare que ele chama calcularValor() e documentos(): em tempo de
    // execução o Java chama a versão da subclasse (isso é polimorfismo).
    // ------------------------------------------------------------------
    public String gerarResumo() {
        // String.format monta o texto: %s = texto, %.2f = número com 2 casas
        return String.format("Nº %s | Cliente: %s | Emissão: %s | Valor: R$ %.2f | Docs: %s",
                numero, cliente, dataEmissao, calcularValor(), documentos());
    }
}
