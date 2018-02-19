package br.com.valdir.project.exception;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;

public class CustomExcepitionHandlerFactory  extends ExceptionHandlerFactory{

	private ExceptionHandlerFactory parent;
	
	public CustomExcepitionHandlerFactory(ExceptionHandlerFactory parent) {
		this.parent = parent;
	}
	
	@Override
	public ExceptionHandler getExceptionHandler() {
		ExceptionHandler handler = new CustomExceptionHandler(parent.getExceptionHandler());
		return handler;
	}

	
}
