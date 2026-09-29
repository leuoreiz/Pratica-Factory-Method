package factoryMethoudV3;

public class ProcessarPix extends Processar {
    @Override 
    protected MetodoPagamento CriarMetodo() {
        return new Pix();
    }
}
