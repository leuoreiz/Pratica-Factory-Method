package modelosProva.abstractFactory;

/*
 * PAPEL NO PADRÃO: CONCRETE PRODUCT (etiqueta dos EUA)
 */
public class EtiquetaUSPS implements Etiqueta {

    @Override
    public String gerar(String endereco) {
        return "USPS | ZIP+4 " + endereco;   // formato 00000-0000
    }
}
