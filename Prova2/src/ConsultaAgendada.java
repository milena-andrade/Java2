import java.util.Scanner;

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private String nomeMedico;
    private static int quantidade = 0;

    public ConsultaAgendada() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = sc.nextInt();
        System.out.print("Digite o mês: ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();
        this.data = new Data(dia, mes, ano);

        System.out.print("Digite a hora: ");
        int hora = sc.nextInt();
        System.out.print("Digite o minuto: ");
        int minuto = sc.nextInt();
        System.out.print("Digite o segundo: ");
        int segundo = sc.nextInt();
        this.hora = new Hora(hora, minuto, segundo);

        sc.nextLine();

        System.out.print("Digite o nome do paciente: ");
        this.nomePaciente = lerNomeValido();
        System.out.print("Digite o nome do médico: ");
        this.nomeMedico = lerNomeValido();

        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med) {
        this.hora = new Hora(h, mi, s);
        this.data = new Data(d, m, a);
        this.nomePaciente = p;
        this.nomeMedico = med;
        quantidade++;
    }

    public ConsultaAgendada(Data d, Hora h, String p, String m) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = m;
        quantidade++;
    }

    public void setData(int d, int m, int a) {
        this.data = new Data(d, m, a);
    }

    public void setData() {
        this.data.setDia();
        this.data.setMes();
        this.data.setAno();
    }

    public void setHora(int h, int mi, int s) {
        this.hora.setHora(h);
        this.hora.setMinuto(mi);
        this.hora.setSegundo(s);
    }

    public void setHora() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a hora: ");
        int hora = sc.nextInt();
        System.out.print("Digite o minuto: ");
        int minuto = sc.nextInt();
        System.out.print("Digite o segundo: ");
        int segundo = sc.nextInt();

        this.hora = new Hora(hora, minuto, segundo);
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomePaciente() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do paciente: ");
        this.nomePaciente = lerNomeValido();
    }

    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }

    public void setNomeMedico() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do médico: ");
        this.nomeMedico = lerNomeValido();
    }


    public static int getAmostra() {
        return quantidade;
    }

    public String getData() {
        return this.data.mostra1();
    }

    public String getHora() {
        return this.hora.mostra();
    }

    public String getNomePaciente() {
        return this.nomePaciente;
    }

    public String getNomeMedico() {
        return this.nomeMedico;
    }

    private String lerNomeValido() {
        Scanner sc = new Scanner(System.in);
        String nome;
        while (true) {
            nome = sc.nextLine();
            if (!nome.matches(".*\\d.*")) {
                break;
            }
            System.out.print("Nome inválido. O nome não pode conter números. Digite novamente: ");
        }
        return nome;
    }
}
