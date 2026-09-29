package modelosProva.abstractFactory;

/*
 * PAPEL NO PADRÃO: CONCRETE PRODUCT (documento fiscal do Brasil)
 *
 * Regras que variam DENTRO do país (interestadual ou não) ficam aqui,
 * no produto. O que não pode é if de PAÍS no Checkout.
 */
public class NotaFiscalBR implements DocumentoFiscal {

    private final boolean interestadual;

    public NotaFiscalBR(boolean interestadual) {
        this.interestadual = interestadual;
    }

    @Override
    public String emitir(double valor) {
        // Operador ternário:  condicao ? valorSeVerdadeiro : valorSeFalso
        // É um if/else em uma linha.
        String cfop = interestadual ? "6.102" : "5.102";
        double aliquota = interestadual ? 0.12 : 0.18;   // 12% ou 18%

        return String.format("NF-e | CFOP %s | ICMS R$ %.2f", cfop, valor * aliquota);
    }
}
