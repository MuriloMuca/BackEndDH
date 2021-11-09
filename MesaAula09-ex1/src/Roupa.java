public class Roupa {
    private TipoRoupa tipoRoupa;
    private Tamanho tamanho;
    private boolean eNovo;
    private boolean importada;

    public Roupa(TipoRoupa tipoRoupa, Tamanho tamanho, boolean eNovo, boolean importado) {
        this.tipoRoupa = tipoRoupa;
        this.tamanho = tamanho;
        this.eNovo = eNovo;
        this.importada = importado;

    }

    public TipoRoupa getTipoRoupa() {
        return tipoRoupa;
    }

    public void setTipoRoupa(TipoRoupa tipoRoupa) {
        this.tipoRoupa = tipoRoupa;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public boolean iseNovo() {
        return eNovo;
    }

    public void seteNovo(boolean eNovo) {
        this.eNovo = eNovo;
    }

    public boolean isImportada() {
        return importada;
    }

    public void setImportada(boolean importada) {
        this.importada = importada;
    }

    public boolean geteNovo() {
        return eNovo;
    }

    public boolean getImportado() {
        return importada;
    }
}
