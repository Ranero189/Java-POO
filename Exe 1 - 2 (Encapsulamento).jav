//Exercício 1

public class Cliente {
    private String nome;
    private String cpf;
    private Agencia agencia;
    private Conta conta;
    private List<CartaoCredito> cartoesCredito;

    public Cliente(String nome, String cpf, Agencia agencia, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = agencia;
        this.conta = conta;
        this.cartoesCredito = new ArrayList<>();
    }

    public void addCartaoCredito(CartaoCredito cartao) {
        cartoesCredito.add(cartao);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public Conta getConta() {
        return conta;
    }

    public List<CartaoCredito> getCartoesCredito() {
        return cartoesCredito;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", cpf=" + cpf + ", agencia=" + agencia + ", conta=" + conta + ", cartoesCredito="
                + cartoesCredito + "]";
    }
}

public class Agencia {
    private String nome;
    private int numero;

    public Agencia(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
}

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

public class CartaoCredito {
    private int numero;
    private double limite;

    public CartaoCredito(int numero, double limite) {
        this.numero = numero;
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}

//Exercício 2

public abstract class PrestadorDeServicos {
    private String email;
    private String telefone;
    private String cep;
    private String logradouro;
    private String complemento;

    public PrestadorDeServicos(String email, String telefone, String cep, String logradouro, String complemento) {
        this.email = email;
        this.telefone = telefone;
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }
}

public class PessoaFisica extends PrestadorDeServicos {
    private String nome;
    private String cpf;
    private LocalDate dataDeNascimento;

    public PessoaFisica(String nome, String cpf, LocalDate dataDeNascimento, String email, String telefone, String cep, String logradouro, String complemento) {
        super(email, telefone, cep, logradouro, complemento);
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
}

public class PessoaJuridica extends PrestadorDeServicos {
    private String razaoSocial;
    private String cnpj;

    public PessoaJuridica(String razaoSocial, String cnpj, String email, String telefone, String cep, String logradouro, String complemento) {
        super(email, telefone, cep, logradouro, complemento);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }
}
