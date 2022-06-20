public class CompteBancaire<T> {
    private int num;
    private double solde;
    private T devise;
    private Client client;

    public CompteBancaire(int num, double solde, T devise, Client client) {
        this.num = num;
        this.solde = solde;
        this.devise = devise;
        this.client = client;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public T getDevise() {
        return devise;
    }

    public void setDevise(T devise) {
        this.devise = devise;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Ce compte appartient à "
                + this.client.getNom() +
                " solde : " + this.solde + this.devise;
    }
}
