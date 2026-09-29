# Modelos para a prova

Versão em código da [COLA.md](../COLA.md): cada padrão em arquivos separados, compilando e rodando. Cada pasta tem um `README.md` com o **diagrama UML** do modelo.

| Pasta | Padrão | Diagrama |
|---|---|---|
| [factoryMethod/](factoryMethod/) | Factory Method (produto abstrato, criador com método `final`, rejeição, `Map` no cliente) | [UML](factoryMethod/README.md) |
| [abstractFactory/](abstractFactory/) | Abstract Factory (família por país, `Checkout` sem `if`) | [UML](abstractFactory/README.md) |
| [observer/](observer/) | Observer | [UML](observer/README.md) |
| [decorator/](decorator/) | Decorator | [UML](decorator/README.md) |
| [polimorfismo/](polimorfismo/) | Herança, `super`, classe abstrata, polimorfismo | [UML](polimorfismo/README.md) |

## Como rodar

No VS Code: abra o `Main.java` da pasta e clique em ▶ **Run**.

Pelo terminal, na raiz do repositório (precisa de JDK):

```bash
javac -d bin modelosProva/factoryMethod/*.java
java -cp bin modelosProva.factoryMethod.Main
```

Troque `factoryMethod` pelo nome da pasta.

## Como ler os diagramas

Cada README traz o diagrama em duas versões:

- **Mermaid:** o GitHub desenha sozinho. No VS Code, só com a extensão *Markdown Preview Mermaid Support*.
- **Texto (ASCII):** dá para ler em qualquer lugar, sem extensão e sem internet.

### Notação UML

| Desenho | Texto | Mermaid | Significado | Em Java |
|---|---|---|---|---|
| linha cheia, triângulo vazio | `──▷` | `Mae <\|-- Filha` | herança | `extends` |
| linha tracejada, triângulo vazio | `- -▷` | `Interface <\|.. Classe` | realização | `implements` |
| linha tracejada, seta aberta | `- ->` | `A ..> B` | dependência (usa/cria) | variável local, `new`, parâmetro |
| linha cheia, seta aberta | `──>` | `A --> B` | associação (tem) | atributo |
| losango vazio | `◇──` | `A o-- B` | agregação | lista de objetos que existem sozinhos |
| losango cheio | `◆──` | `A *-- B` | composição | parte que não existe sem o todo |

| Marca | Significado |
|---|---|
| `+` | public |
| `-` | private |
| `#` | protected |
| `<<interface>>` | interface |
| `<<abstract>>` ou nome em *itálico* | classe abstrata |
| `*` no fim do método (mermaid) ou *itálico* | método abstrato |
| sublinhado ou `$` (mermaid) | `static` |

Formato de um membro: `+ nome(parametro: Tipo): Retorno` e `- atributo: Tipo`.
