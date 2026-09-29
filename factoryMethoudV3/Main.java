package factoryMethoudV3;

public class Main {
    public static  void main(String[] args) {
        Processar processar = new ProcessarBoleto();
        processar.ProcessarPagamento(50);

        Processar processar2 = new ProcessarCartao();
        processar2.ProcessarPagamento(50);

        Processar processar3 = new ProcessarPix();
        processar3.ProcessarPagamento(50);
    }
}