package com.example.Springbootcrud.util;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fasterxml.jackson.databind.JsonMappingException;

@ControllerAdvice
public class ExceptionHandlerUtil {
	
	@ExceptionHandler({EmptyResultDataAccessException.class})
	public ResponseEntity<String> catchEmpty(Throwable t) {

		return new ResponseEntity<String>("No Data For The Given Request", HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(JsonMappingException.class)
	public ResponseEntity<String> catchEmptyJson(Throwable t) {

		return new ResponseEntity<String>("EMpty JSON", HttpStatus.NO_CONTENT);
	}
}
