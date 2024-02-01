package compañiaBancaria;

public class Opera {
    private CompteCorrent compteCorrent;
    private Client client;
    private boolean privilegios;

    public Opera(CompteCorrent compteCorrent, Client client, boolean privilegios) {
        this.compteCorrent = compteCorrent;
        this.client = client;
        this.privilegios = privilegios;
    }

    public CompteCorrent getCompteCorrent() {
        return compteCorrent;
    }

    public void setCompteCorrent(CompteCorrent compteCorrent) {
        this.compteCorrent = compteCorrent;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isPrivilegios() {
        return privilegios;
    }

    public void setPrivilegios(boolean privilegios) {
        this.privilegios = privilegios;
    }
}
