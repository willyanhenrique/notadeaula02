public class calculomaças {
private int nummaca;
private double preco;

private double custototal;

    public int getNummaca() {
        return nummaca;
    }

    public void setNummaca(int nummaca) {
        this.nummaca = nummaca;
    }

    public double getPreco() {

            if (nummaca <12) {
                preco = 1.30;
            }else {
                preco = 1.00;
            }

            custototal = nummaca * preco;

            return custototal;
    }

}

