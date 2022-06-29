package exe002;

import java.util.function.Predicate;

public interface Agenda {
    void inserirContato(Contato contato);
    void imprimirTodos();
    void listar(Predicate<Contato> listarTodos);
    void pesquisar(PesquisarPor pesquisa);

}
