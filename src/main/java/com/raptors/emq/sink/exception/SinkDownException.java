package com.raptors.emq.sink.exception;

/**
 * @author Sriram Kakani on 2019-07-20
 */

public class SinkDownException extends Exception {

	public SinkDownException(String message) {
		super(message);
	}

	public SinkDownException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
