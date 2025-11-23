import Entities.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HabilidadeTecnica skillTecnica = new HabilidadeTecnica("Fundamentos de IA Generativa", 5, "MOD-AI-01", "Inteligência Artificial", "WatsonX");
        HabilidadeHumana skillHumana = new HabilidadeHumana("Pensamento Crítico", 2, "MOD-SOFT-02", "Tomada de Decisão", 1);
        HabilidadeTecnica skillCyber = new HabilidadeTecnica("Segurança Cibernética", 4, "MOD-SEC-03", "Defesa Digital", "API Gateway");

        System.out.println("--- Teste Habilidade Humana (Método requerPrioridade) ---");
        System.out.println("Habilidade '" + skillHumana.getNome() + "' requer prioridade? " + skillHumana.requerPrioridade());
        System.out.println("---------------------------------");

        List<Habilidade> modulosTrilha = new ArrayList<>(Arrays.asList(skillTecnica, skillHumana, skillCyber));

        Profissao profissaoAtual = new Profissao("Atendente de Suporte N1", 0.65);
        Trilha trilhaReskilling = new Trilha("Transição para Analista de Dados", 120, modulosTrilha);

        Colaborador colaborador = new Colaborador("Alexandre Souza", 98765, profissaoAtual, trilhaReskilling);
        DiagnosticoIA diagnostico = new DiagnosticoIA(LocalDate.now(), profissaoAtual, trilhaReskilling);

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("                   TALENTFORGE                    ");
        System.out.println("==================================================");

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Exibir Diagnóstico Completo (Teste DiagnosticoIA)");
            System.out.println("2. Registrar Conclusão de Módulo (Teste Trilha)");
            System.out.println("3. Exibir Progresso do Colaborador (Teste Colaborador)");
            System.out.println("4. Mudar Profissão (Teste Colaborador/Profissao)");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("\n[OPÇÃO 1] Detalhes do Diagnóstico:");
                        diagnostico.exibirResumoDiagnostico();
                        System.out.println("Urgência de Requalificação: " + (diagnostico.verificarUrgenciaRequalificacao() ? "ALTA" : "BAIXA"));
                        break;

                    case 2:
                        System.out.println("\n[OPÇÃO 2] Registrar Conclusão de Módulo:");
                        int modulosDisponiveis = trilhaReskilling.getModulos().size();
                        int concluidos = trilhaReskilling.getModulosConcluidos();

                        if (concluidos < modulosDisponiveis) {
                            Habilidade modulo = trilhaReskilling.getModulos().get(concluidos);
                            trilhaReskilling.registrarConclusaoModulo(modulo);
                        } else {
                            System.out.println("Todos os módulos da trilha foram concluídos!");
                        }
                        break;

                    case 3:
                        System.out.println("\n[OPÇÃO 3] Progresso do Colaborador:");
                        colaborador.exibirStatusProgresso();
                        break;

                    case 4:
                        System.out.println("\n[OPÇÃO 4] Escolha a Nova Profissão:");

                        System.out.println("--- Risco Alto (Reskilling) ---");
                        System.out.println("1. Arquiteto de Jornadas de Reskilling (Risco Baixo: 10%)");
                        System.out.println("2. Analista de Dados Júnior (Risco Médio: 35%)");
                        System.out.println("3. Designer de UX/UI (Risco Baixo: 15%)");
                        System.out.println("4. Arquiteto de Nuvem (Risco Baixo: 10%)");
                        System.out.println("5. Especialista em Sustentabilidade (Risco Baixo: 5%)");

                        System.out.println("--- Outras Opções ---");
                        System.out.println("6. Voltar ao Menu Principal");
                        System.out.print("Escolha: ");

                        int escolhaProfissao = scanner.nextInt();
                        scanner.nextLine();

                        Profissao novaProfissao = null;

                        switch (escolhaProfissao) {
                            case 1:
                                novaProfissao = new Profissao("Arquiteto de Jornadas de Reskilling", 0.10);
                                break;
                            case 2:
                                novaProfissao = new Profissao("Analista de Dados Júnior", 0.35);
                                break;
                            case 3:
                                novaProfissao = new Profissao("Designer de UX/UI", 0.15);
                                break;
                            case 4:
                                novaProfissao = new Profissao("Arquiteto de Nuvem", 0.10);
                                break;
                            case 5:
                                novaProfissao = new Profissao("Especialista em Sustentabilidade", 0.05);
                                break;
                            case 6:
                                System.out.println("Operação cancelada.");
                                break;
                            default:
                                System.out.println("Escolha inválida.");
                                break;
                        }

                        if (novaProfissao != null) {
                            colaborador.mudarProfissao(novaProfissao);
                            diagnostico.setProfissao(novaProfissao);
                        }
                        break;

                    case 5:
                        System.out.println("\nFechando sistema TalentForge. Adeus!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro: Por favor, digite apenas números.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
            }
        }
    }
}