import java.time.LocalDateTime;

class RegistroPonto {
    private Funcionario funcionario;
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;

    public RegistroPonto(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void registrarEntrada() {
        dataHoraEntrada = LocalDateTime.now();
    }

    public void registrarSaida() {
        dataHoraSaida = LocalDateTime.now();
    }

    public void exibirRegistro() {
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Tipo: " + getType(funcionario));
        System.out.println("Data/Hora de entrada: " + dataHoraEntrada);
        System.out.println("Data/Hora de saída: " + dataHoraSaida);
    }

    private String getType(Funcionario funcionario) {
        if (funcionario instanceof Vendedor) {
            return "Vendedor";
        } else if (funcionario instanceof Consultor) {
            return "Consultor";
        } else if (funcionario instanceof Gerente) {
            return "Gerente";
        } else {
            return "Funcionário";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario vendedor = new Vendedor("João", 123456789, 50.0, 100);
        Funcionario consultor = new Consultor("Maria", 987654321, 30.0, 120);
        Funcionario gerente = new Gerente("Carlos", 456789123, 5000.0);

        RegistroPonto registroPonto = new RegistroPonto(vendedor);
        registroPonto.registrarEntrada();
        registroPonto.registrarSaida();
        registroPonto.exibirRegistro();

        registroPonto = new RegistroPonto(consultor);
        registroPonto.registrarEntrada();
        registroPonto.exibirRegistro();

        registroPonto = new RegistroPonto(gerente);
        registroPonto.registrarEntrada();
        registroPonto.registrarSaida();
        registroPonto.exibirRegistro();
    }
}
