import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogLivros;

    public CatalogoLivros() {
        this.catalogLivros = new ArrayList<>();
    }

    public void adicionarLivro(String autor, String titulo, int anoPublicacao){
        catalogLivros.add(new Livro(autor, titulo, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroAutor = new ArrayList<>();
        if(!catalogLivros.isEmpty()){
             for(Livro i : catalogLivros){
                if(i.getAutor() == autor){
                    livroAutor.add(i);
                }
             }
        }
        return livroAutor;
        
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroIntervalo = new ArrayList<>();
        if(!catalogLivros.isEmpty()){
            for(Livro i:catalogLivros){
                if(i.getAnoPublicacao() >= anoInicial && i.getAnoPublicacao() <= anoFinal){
                    livroIntervalo.add(i);
                }
            }
        }
        return livroIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroTitulo = null;
        if(!catalogLivros.isEmpty()){
            for(Livro i : catalogLivros){
                if(i.getTitulo().equalsIgnoreCase(titulo)){ //Comparar strings sem fazer distinção de maiusculo e minusculo
                    livroTitulo = i;
                    break;
                }
            }
        }
        return livroTitulo;
    }


}
