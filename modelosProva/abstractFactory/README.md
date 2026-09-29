# Abstract Factory: modelo

| Papel | Classe |
|---|---|
| AbstractFactory | `FabricaPais` (interface: `criarDocumento()`, `criarPagamento()`, `criarEtiqueta()`) |
| ConcreteFactory | `FabricaBrasil`, `FabricaEUA` |
| AbstractProduct | `DocumentoFiscal`, `Pagamento`, `Etiqueta` |
| ConcreteProduct | `NotaFiscalBR`, `PixBR`, `EtiquetaCorreios` / `SalesInvoiceUS`, `CartaoUS`, `EtiquetaUSPS` |
| Client | `Checkout` (recebe a fábrica pelo construtor) e `Main` |

## UML (mermaid)

```mermaid
classDiagram
    class FabricaPais {
        <<interface>>
        +criarDocumento() DocumentoFiscal
        +criarPagamento() Pagamento
        +criarEtiqueta() Etiqueta
    }
    class FabricaBrasil {
        -boolean interestadual
    }
    class FabricaEUA {
        -String estado
    }
    class DocumentoFiscal {
        <<interface>>
        +emitir(double valor) String
    }
    class Pagamento {
        <<interface>>
        +processar(double valor) String
    }
    class Etiqueta {
        <<interface>>
        +gerar(String endereco) String
    }
    class Checkout {
        -FabricaPais fabrica
        +Checkout(FabricaPais fabrica)
        +finalizar(double valor, String endereco) void
    }

    FabricaPais <|.. FabricaBrasil
    FabricaPais <|.. FabricaEUA

    DocumentoFiscal <|.. NotaFiscalBR
    DocumentoFiscal <|.. SalesInvoiceUS
    Pagamento <|.. PixBR
    Pagamento <|.. CartaoUS
    Etiqueta <|.. EtiquetaCorreios
    Etiqueta <|.. EtiquetaUSPS

    FabricaBrasil ..> NotaFiscalBR : cria
    FabricaBrasil ..> PixBR : cria
    FabricaBrasil ..> EtiquetaCorreios : cria
    FabricaEUA ..> SalesInvoiceUS : cria
    FabricaEUA ..> CartaoUS : cria
    FabricaEUA ..> EtiquetaUSPS : cria

    Checkout --> FabricaPais
    Checkout ..> DocumentoFiscal : usa
    Checkout ..> Pagamento : usa
    Checkout ..> Etiqueta : usa
```

## UML (texto)

```
   ┌──────────────────────────┐         ┌─────────────────────────────────┐
   │         Checkout         │────────>│          <<interface>>          │
   ├──────────────────────────┤  tem    │           FabricaPais           │
   │ - fabrica: FabricaPais   │         ├─────────────────────────────────┤
   ├──────────────────────────┤         │ + criarDocumento(): DocumentoF. │
   │ + finalizar(valor, end.) │         │ + criarPagamento(): Pagamento   │
   └──────────────────────────┘         │ + criarEtiqueta(): Etiqueta     │
                                        └───────────────▲─────────────────┘
                                                        ¦ (implements)
                                     ┌ - - - - - - - - -┴- - - - - - - - -┐
                             ┌───────┴───────┐                    ┌───────┴───────┐
                             │ FabricaBrasil │                    │  FabricaEUA   │
                             └───────┬───────┘                    └───────┬───────┘
                                     ¦ cria                               ¦ cria
             ┌ - - - - - - - - - - - ┼ - - - - - - - ┐    ┌ - - - - - - - ┼ - - - - - - - ┐
             ▼                       ▼               ▼    ▼               ▼               ▼
      NotaFiscalBR               PixBR     EtiquetaCorreios  SalesInvoiceUS  CartaoUS  EtiquetaUSPS
             ¦                       ¦               ¦    ¦               ¦               ¦
             ▽                       ▽               ▽    ▽               ▽               ▽
   <<interface>> DocumentoFiscal   <<interface>> Pagamento   <<interface>> Etiqueta
   (NotaFiscalBR, SalesInvoiceUS)  (PixBR, CartaoUS)         (EtiquetaCorreios, EtiquetaUSPS)
```

Leitura: cada **coluna** é um tipo de produto (documento, pagamento, etiqueta) e cada **fábrica** é uma linha/família (Brasil, EUA). O `Checkout` só enxerga as interfaces.

## Observações

- **Por que não dá para misturar países:** o `Checkout` recebe **uma** fábrica, e a `FabricaBrasil` só sabe criar produtos brasileiros.
- **Novo país (Alemanha):** `FabricaAlemanha` + `VatInvoiceDE`, `SepaDE`, `EtiquetaDeutschePost`. Nenhuma classe existente muda.
