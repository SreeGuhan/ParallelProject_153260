package com.capg.exception;

public class TransferAmountException extends Throwable {
	
	private String string;

	public TransferAmountException(String string) {
		// TODO Auto-generated constructor stub
		this.string=string;
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
