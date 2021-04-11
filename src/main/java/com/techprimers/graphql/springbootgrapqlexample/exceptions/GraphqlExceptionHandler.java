package com.techprimers.graphql.springbootgrapqlexample.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Collections;

@RestControllerAdvice
public class GraphqlExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> exception(Exception e){
		return ResponseEntity.badRequest().body(e);
	}
}
