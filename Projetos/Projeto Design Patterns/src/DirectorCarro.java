public class DirectorCarro {
    public void construirSedan(CarroBuilder builder){
        builder.setTipo("Sedan");
        builder.setChassi("Ferro");
        builder.setCor("Azul");
        builder.setPneus("Normal");
        builder.setSuspensao("Baixa");
    }

    public void construirSuv(CarroBuilder builder){
        builder.setTipo("SUV");
        builder.setChassi("Aço");
        builder.setCor("Preto");
        builder.setPneus("Off-Road");
        builder.setSuspensao("Alta");
    }

    public void construirSport(CarroBuilder builder){
        builder.setTipo("Sport");
        builder.setChassi("Chassi");
        builder.setCor("Vermelho");
        builder.setPneus("Slick");
        builder.setSuspensao("Muito baixa");
    }
}
