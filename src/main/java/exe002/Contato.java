package exe002;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Contato {
    private String nome;
    private String telefone;
    private LocalDate aniversario;

    public Contato(String nome, String telefone, LocalDate aniversario) {
        this.nome = nome;
        this.telefone = telefone;
        this.aniversario = aniversario;
    }

    public Contato(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public LocalDate getAniversario() {
        return aniversario;
    }

    public String toString() {
        return String.format("Nome: %s \nTelefone: %s \nAniversário: %s \n",
                this.nome,
                this.telefone,
                this.aniversario.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return nome.equals(contato.nome) || telefone.equals(contato.telefone) || aniversario.equals(contato.aniversario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, telefone, aniversario);
    }
}
