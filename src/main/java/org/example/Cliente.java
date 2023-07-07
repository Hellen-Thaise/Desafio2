package org.example;

    public class Cliente {
        private String nome;
        private String cpf;
        private String email;

        public Cliente(String nome, String cpf, String email) {
            this.nome = nome;
            this.cpf = cpf;
            this.email = email;
        }

        public Cliente() {

        }

        public String getNome() {
            return nome;
        }


        public String getCpf() {
            return cpf;
        }


        public String getEmail() {
            return email;
        }


        @Override
        public String toString() {
            return "Nome do Cliente: " + nome + "\nNúmero do CPF: " + cpf + "\nE-mail do cliente: " + email;
        }
    }


