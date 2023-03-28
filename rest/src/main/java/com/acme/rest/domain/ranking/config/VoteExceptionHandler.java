package com.acme.rest.domain.ranking.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.acme.core.ranking.exception.CharacterNotFoundException;
import com.acme.core.ranking.exception.NoVoteFoundException;
import com.acme.rest.domain.shared.dto.ErrorResponse;
import com.acme.rest.domain.shared.utils.ExceptionHandlerUtils;

@RestControllerAdvice
public class VoteExceptionHandler {

    @ExceptionHandler(CharacterNotFoundException.class)
    public ResponseEntity<ErrorResponse> handle(CharacterNotFoundException e) {
        return ExceptionHandlerUtils.createErrorResponseEntity(e, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoVoteFoundException.class)
    public ResponseEntity<ErrorResponse> handle(NoVoteFoundException e) {
        return ExceptionHandlerUtils.createErrorResponseEntity(e, HttpStatus.NOT_FOUND);
    }
}
