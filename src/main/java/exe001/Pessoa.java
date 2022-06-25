package exe001;

import java.time.LocalDate;

public class Pessoa {

        private String nome;
        private LocalDate dataNascimento;

        public Pessoa(String nome, LocalDate dataNascimento) {
            this.nome = nome;
            this.dataNascimento = dataNascimento;
        }

        public void calcularIdade(Pessoa pessoa) {
            System.out.println("Por favor entre com seu nome:");
            pessoa.setNome(pessoa.nome);
            pessoa.setDataNascimento(pessoa.dataNascimento);
        }
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public LocalDate getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

    }
