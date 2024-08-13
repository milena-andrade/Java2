import java.util.InputMismatchException;
import java.util.Scanner;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int h, int mi, int s) {
        setHora(h);
        setMinuto(mi);
        setSegundo(s);
    }

    public Hora() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public void setHora(int h) {
        if (h >= 0 && h <= 23) {
            this.hora = h;
        } else {
            throw new IllegalArgumentException("Hora inválida. Deve estar entre 0 e 23.");
        }
    }

    public void setMinuto(int mi) {
        if (mi >= 0 && mi <= 59) {
            this.minuto = mi;
        } else {
            throw new IllegalArgumentException("Minuto inválido. Deve estar entre 0 e 59.");
        }
    }

    public void setSegundo(int s) {
        if (s >= 0 && s <= 59) {
            this.segundo = s;
        } else {
            throw new IllegalArgumentException("Segundo inválido. Deve estar entre 0 e 59.");
        }
    }

    public void setHora() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Digite a hora: ");
                int h = sc.nextInt();
                setHora(h);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                sc.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void setMinuto() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Digite o minuto: ");
                int mi = sc.nextInt();
                setMinuto(mi);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                sc.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void setSegundo() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Digite o segundo: ");
                int s = sc.nextInt();
                setSegundo(s);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                sc.next(); 
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String mostra() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
}
