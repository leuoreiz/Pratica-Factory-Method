package modelosProva.abstractFactory;

/*
 * PAPEL NO PADRÃO: CLIENT (quem usa a fábrica)
 *
 * Finaliza o pedido sem saber de qual país ele é.
 *  - Só conhece INTERFACES (FabricaPais, DocumentoFiscal, Pagamento, Etiqueta).
 *  - Não tem nenhum if de país.
 *  - Recebe a fábrica pronta no construtor (isso é "injeção de dependência",
 *    o D do SOLID: depender de abstração, não de classe concreta).
 */
public class Checkout {

    // "tem uma" fábrica: no UML é a seta de associação Checkout --> FabricaPais
    private final FabricaPais fabrica;

    public Checkout(FabricaPais fabrica) {
        this.fabrica = fabrica;
    }

    public void finalizar(double valor, String endereco) {
        // Os 3 produtos vêm da MESMA fábrica, então são sempre do mesmo país.
        DocumentoFiscal documento = fabrica.criarDocumento();
        Pagamento pagamento = fabrica.criarPagamento();
        Etiqueta etiqueta = fabrica.criarEtiqueta();

        // Relatório no mesmo formato para qualquer país (requisito comum de enunciado).
        System.out.println("===== RELATÓRIO DO PEDIDO =====");
        System.out.println("Documento: " + documento.emitir(valor));
        System.out.println("Pagamento: " + pagamento.processar(valor));
        System.out.println("Envio....: " + etiqueta.gerar(endereco));
        System.out.println();
    }
}
