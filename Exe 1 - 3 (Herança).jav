//Exercício 1

public class Animal { 
    private String nome;
    private String genero;
    private String especie;
    
    public Animal(String nome, String genero, String especie) {
        this.nome = nome;
        this.genero = genero;
        this.especie = especie;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public void emitirSom() {
        System.out.println("Não sei que animal sou!");   
    }
    
    public void mover() {
        System.out.println("Estou me movendo!");
    }
}

public class Gato extends Animal {
    public Gato(String nome, String genero, String especie) {
        super(nome, genero, especie);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Miau!");   
    }
    
    public void brincar() {
        System.out.println("Estou brincando com um novelo de lã!");
    }
}

public class Cachorro extends Animal {
    public Cachorro(String nome, String genero, String especie) {
        super(nome, genero, especie);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Au au!");   
    }
    
    public void buscarBola() {
        System.out.println("Estou buscando a bola!");
    }
}

public class Passaro extends Animal {
    public Passaro(String nome, String genero, String especie) {
        super(nome, genero, especie);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Piu piu!");   
    }
    
    public void voar() {
        System.out.println("Estou voando!");
    }
}

public class Main {
	public static void main(String[] args) {

Gato meuGato = new Gato("Frajola", "Macho", "Felis catus");
meuGato.emitirSom(); // Saída: "Miau!"
meuGato.brincar(); // Saída: "Estou brincando com um novelo de lã!"
meuGato.mover(); // Saída: "Estou me movendo!"

Cachorro meuCachorro = new Cachorro("Rex", "Macho", "Canis lupus familiaris");
meuCachorro.emitirSom(); // Saída: "Au au!"
meuCachorro.buscarBola(); // Saída: "Estou buscando a bola!"
meuCachorro.mover(); // Saída: "Estou me movendo!"

Passaro meuPassaro = new Passaro("Piu", "Fêmea", "Passer domesticus");
	}
}

//Exercicio2

abstract class Funcionario {
    protected String nome;
    protected long cpf;
    protected double salarioMinimo = 1100.0;

    public Funcionario(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double calcularSalario();
}

class Vendedor extends Funcionario {
    private double comissao;
    private long numeroVendas;

    public Vendedor(String nome, long cpf, double comissao, long numeroVendas) {
        super(nome, cpf);
        this.comissao = comissao;
        this.numeroVendas = numeroVendas;
    }

    @Override
    public double calcularSalario() {
        return salarioMinimo + (comissao * numeroVendas);
    }
}

class Consultor extends Funcionario {
    private double valorHora;
    private long horasTrabalhadas;

    public Consultor(String nome, long cpf, double valorHora, long horasTrabalhadas) {
        super(nome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}

class Gerente extends Funcionario {
    private double bonificacao;

    public Gerente(String nome, long cpf, double bonificacao) {
        super(nome, cpf);
        this.bonificacao = bonificacao;
    }

    @Override
    public double calcularSalario() {
        return (salarioMinimo * 6) + bonificacao;
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario vendedor = new Vendedor("João", 123456789, 50.0, 100);
        Funcionario consultor = new Consultor("Maria", 987654321, 30.0, 120);
        Funcionario gerente = new Gerente("Carlos", 456789123, 5000.0);
}
	}
