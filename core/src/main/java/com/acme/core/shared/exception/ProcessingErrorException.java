package com.acme.core.shared.exception;

import com.acme.core.shared.utils.I18nUtils;

public class ProcessingErrorException extends MarvelRankingException {
    private static final long serialVersionUID = 3874826835819970949L;

	public ProcessingErrorException() {
        super(I18nUtils.getMessage(ProcessingErrorException.class.getSimpleName() + ".message"));
    }
}
