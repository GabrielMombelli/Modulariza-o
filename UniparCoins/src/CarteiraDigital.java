public class CarteiraDigital {
    private double saldo;

    public CarteiraDigital() {
        this.saldo = 0.0;
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Saldo adicionado.");
        } else {
            System.out.println("O valor inserido é inválido.");
        }
    }

    public void realizarPagamento(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Pagamento realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para realizar o pagamento.");
            }
        } else {
            System.out.println("Valor inválido para pagamento.");
        }
    }

    public double verificarSaldo() {
        return saldo;
    }
}