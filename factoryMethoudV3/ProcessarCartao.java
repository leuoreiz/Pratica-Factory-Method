package factoryMethoudV3;

public class ProcessarCartao extends Processar{ 

    @Override 
    protected MetodoPagamento CriarMetodo() {
        return new Cartao();
    }
}

