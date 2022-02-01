package entities;

public class Conta {
	private int numeroConta;
	private String nome;
	private double saldo;
	private final double taxa = 5.00; 
	
	public Conta(int numeroConta, String nome, double depositoInicial) {
		super();
		this.numeroConta = numeroConta;
		this.nome = nome;
		depositar(depositoInicial);
	}

	public Conta(int numeroConta, String nome) {
		super();
		this.numeroConta = numeroConta;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
			this.saldo -= (valor+taxa);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public String toString() {
		return "Account " 
				+ this.getNumeroConta() 
				+ ", Holder: " + this.getNome() 
				+ ", Balance: $ " 
				+ String.format("%.2f", getSaldo());
	}
}
