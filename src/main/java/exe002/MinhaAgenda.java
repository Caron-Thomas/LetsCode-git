package exe002;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MinhaAgenda implements Agenda{

    private List<Contato> contatos;

    public MinhaAgenda() {
        this.contatos = new ArrayList<>();
    }

    public List<Contato> getContatos() {
        return this.contatos;
    }

    @Override
    public void inserirContato(Contato contato) {
        contatos.add(contato);
    }

    @Override
    public void imprimirTodos() {
        for (Contato c: this.contatos) {
            System.out.println(c);
        }
    }

    public void pesquisar(PesquisarPor pesquisa){
        for (Contato c: this.contatos) {
            if(pesquisa.pesquisar(c)){
                System.out.println(c);
            }
        }
    }

    @Override
    public void listar(Predicate<Contato> listarTodos) {
        for (Contato contato : this.contatos){
            if(listarTodos.test(contato)){
                System.out.println(contato);
            }
        }
    }
}
