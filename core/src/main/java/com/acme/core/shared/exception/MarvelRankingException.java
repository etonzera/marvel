package com.acme.core.shared.exception;

public class MarvelRankingException extends Exception {

    private static final long serialVersionUID = 1L;

	public MarvelRankingException(String mensagem) {
        super(mensagem);
    }
}
