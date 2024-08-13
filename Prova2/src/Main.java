import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder resultado = new StringBuilder();

        ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 15, 8, 2024, "Milena Andrade", "Dr. Tuller");

        resultado.append("------------------------------");
        resultado.append("\n");
        resultado.append("Propriedades de p1:\n");
        resultado.append("Data: ").append(p1.getData()).append("\n");
        resultado.append("Hora: ").append(p1.getHora()).append("\n");
        resultado.append("Nome do Paciente: ").append(p1.getNomePaciente()).append("\n");
        resultado.append("Nome do Médico: ").append(p1.getNomeMedico()).append("\n");
        resultado.append("Total de consultas agendadas: ").append(ConsultaAgendada.getAmostra());
        resultado.append("\n");
        resultado.append("------------------------------");
        resultado.append("\n");

        ConsultaAgendada p2 = new ConsultaAgendada();

        resultado.append("Propriedades de p2:\n");
        resultado.append("Data: ").append(p2.getData()).append("\n");
        resultado.append("Hora: ").append(p2.getHora()).append("\n");
        resultado.append("Nome do Paciente: ").append(p2.getNomePaciente()).append("\n");
        resultado.append("Nome do Médico: ").append(p2.getNomeMedico()).append("\n");
        resultado.append("Total de consultas agendadas: ").append(ConsultaAgendada.getAmostra());
        resultado.append("\n");
        resultado.append("------------------------------");
        resultado.append("\n");

        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();

        resultado.append("Propriedades de p1 após alteração:\n");
        resultado.append("Data: ").append(p1.getData()).append("\n");
        resultado.append("Hora: ").append(p1.getHora()).append("\n");
        resultado.append("Nome do Paciente: ").append(p1.getNomePaciente()).append("\n");
        resultado.append("Nome do Médico: ").append(p1.getNomeMedico()).append("\n");
        resultado.append("Total de consultas agendadas: ").append(ConsultaAgendada.getAmostra());
        resultado.append("\n");
        resultado.append("------------------------------");
        resultado.append("\n");

        resultado.append("Quantidade final de consultas: ").append(ConsultaAgendada.getAmostra()).append("\n");

        System.out.println(resultado.toString());

        try (PrintWriter writer = new PrintWriter(new FileWriter("resultado.txt"))) {
            writer.write(resultado.toString());
            System.out.println("Resultados escritos no arquivo 'resultado.txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
        }
    }
}
