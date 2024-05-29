public class App {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("George", "1984", 1950);
        catalogoLivros.adicionarLivro("George", "1984", 1950);
        catalogoLivros.adicionarLivro("Autor2", "Livro2", 2020);
        catalogoLivros.adicionarLivro("Autor", "Livro", 1990);

        // System.out.println(catalogoLivros.pesquisarPorAutor("George"));
        //System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1990, 2020));
        System.out.println(catalogoLivros.pesquisarPorTitulo("1984"));
    }
}
