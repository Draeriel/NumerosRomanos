public enum Numeros {
    I (1),
    V (5),
    X (10),
    L (50),
    C (100),
    D (500),
    M (1000);

    private final int numero;

    Numeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
