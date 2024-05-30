
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContaMap;

    public AgendaContatos(){
        this.agendaContaMap = new HashMap();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContaMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContaMap.isEmpty()){
            agendaContaMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContaMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numero = null;
        if(!agendaContaMap.isEmpty()){
            numero = agendaContaMap.get(nome);
        }
        return numero;
    }
}
