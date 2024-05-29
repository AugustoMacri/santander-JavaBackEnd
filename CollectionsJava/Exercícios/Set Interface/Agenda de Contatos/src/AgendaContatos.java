import java.util.HashSet;
import java.util.Set;

public class AgendaContatos{
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarContatos(String nome){
        Set<Contato> setContatos = new HashSet<>();

        for(Contato i : contatoSet){
            if(i.getNome().startsWith(nome)){ //Todo nome que começar com o 'nome' será adicionado
                setContatos.add(i);
            }
        }
        return setContatos;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato i : contatoSet){
            if(i.getNome().equalsIgnoreCase(nome)){
                i.setNumero(novoNumero);
                contatoAtualizado = i;
                break;
            }
        }
        return contatoAtualizado;
    }

}