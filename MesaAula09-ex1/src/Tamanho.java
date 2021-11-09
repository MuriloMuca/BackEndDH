public enum Tamanho {
    XS ("Extra pequeno"),
    S ("pequeno"),
    M ("medio"),
    L ("grande"),
    XL ("Extra grande"),
    ;

    private String tam;
    Tamanho (String tam){
        this.tam = tam;
    }

    public String getTam() {
        return tam;
    }
}
