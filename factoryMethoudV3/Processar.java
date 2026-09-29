package factoryMethoudV3;

public abstract class Processar {
    protected abstract MetodoPagamento CriarMetodo(); 

    public void ProcessarPagamento(double valor) {
         if(valor <= 0) {
            System.out.println("O valor não pode ser menor que 0");
            return;
         }
        MetodoPagamento metodoPagamento = CriarMetodo();
        metodoPagamento.processar();
        double valorFinal = metodoPagamento.aplicarTaxa(valor);
        System.out.println("Recibo: valor pago R$ " + valorFinal);

        


        
        }

    }

