🚀 TalentForge: Modelagem DDD em Java

Projeto: Domain Driven Design Using Java | Global Solution 2025/2

Este projeto implementa o domínio central da solução TalentForge—uma plataforma de Requalificação Preditiva—utilizando a Linguagem Java e os princípios da Orientação a Objetos (POO) e do Domain Driven Design (DDD).

💡 Objetivo e Problema Resolvido

O objetivo do projeto é demonstrar, através da modelagem de software, a eficácia de uma solução POO para combater a obsolescência de habilidades e o alto risco de automação no futuro do trabalho.

O projeto resolve o problema de rastreamento e diagnóstico, permitindo simular a classificação do risco de uma profissão e a gestão do progresso do colaborador em trilhas de reskilling.

🛠️ Tecnologias e Estrutura POO

Área	Tecnologia/Conceito	Descrição
Linguagem Core	Java 11+	Linguagem utilizada para desenvolver todo o modelo de domínio.
Modelagem Principal	POO e DDD	Foco em Encapsulamento, Atributos de Referência e lógica de negócio nas Entidades.
Herança	Classes Abstratas	Implementação da classe abstrata Habilidade (Superclasse) com herança por HabilidadeTecnica e HabilidadeHumana.
Estrutura de Dados	List e enum	Uso de List<Habilidade> para os módulos de trilha e enum Risco para classificação de profissões.

📂 Estrutura de Pacotes

src/
├── Application/
│   └── Main.java       <- Classe executável com menu de testes.
└── Entities/
    ├── Colaborador.java
    ├── DiagnosticoIA.java
    ├── Profissao.java
    ├── Trilha.java
    ├── Habilidade.java (Abstract)
    ├── HabilidadeHumana.java
    └── Risco.java (Enum)

⚙️ Funcionalidades e Testes (Métodos Chave)

O projeto contém métodos funcionais que simulam a lógica de negócio do sistema. Todos os métodos são testados na classe Main (ou Application.java).

    classificarRisco() (Classe Profissao): Determina o nível de risco (Alto, Médio, Baixo) com base no percentual de automação (double).

    registrarConclusaoModulo() (Classe Trilha): Recebe um objeto Habilidade (demonstrando Polimorfismo) e atualiza o progresso do colaborador.

    mudarProfissao() (Classe Colaborador): Permite alterar o objeto de referência profissaoAtual do colaborador, refletindo uma migração de carreira.

    exibirResumoDiagnostico() (Classe DiagnosticoIA): Consolida informações de diversas entidades para gerar o relatório final de status e urgência.

🔗 Execução e Contato

Como Executar o Projeto

    Clone o repositório.

    Abra o projeto em uma IDE Java (IntelliJ, Eclipse, VS Code).

    Execute a classe Main.java (no pacote Application/).

    Utilize o menu interativo para testar os métodos funcionais (Opções 1 a 4).

Autores

Nome	RM
Andre Sousa Matuda	566733
Guilherme Oliveira Feitosa	566842
Paulo Henrique Muniz Diedirch	567618

