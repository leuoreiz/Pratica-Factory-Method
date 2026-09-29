package modelosProva.abstractFactory;

/*
 * PAPEL NO PADRÃO: CONCRETE PRODUCT (etiqueta do Brasil)
 */
public class EtiquetaCorreios implements Etiqueta {

    @Override
    public String gerar(String endereco) {
        return "Correios | CEP " + endereco;   // formato 00000-000
    }
}
