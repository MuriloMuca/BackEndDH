package service;

public class SerieProxy implements ISerie{

    private Integer contador = 0;
    private SerieService serieService = new SerieService();

    public SerieProxy(SerieService serieService){

    }

    @Override
    public String getSerie(String nome) {
        contador += 1;
        String retornoSerie;
        if(contador <= 5){
            retornoSerie = serieService.getSerie(nome);
        } else {
            retornoSerie = "Você atingiu o limite!";
        }
        return retornoSerie;
    }
}
