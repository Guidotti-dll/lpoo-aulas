package models;

public class Excecao {
        public static class EstoqueInsuficienteException extends RuntimeException {
            public EstoqueInsuficienteException() {
                super("Estoque insuficiente!");
            }
        }
}
