package com.example.bridgelabz.model;

public class Response {
	public Response(int statusCode, String message, Object obj) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.obj = obj;
	}

	public Response(int statusCode, String message) {

		this.statusCode = statusCode;
		this.message = message;

	}

	public Response(String message) {

		this.message = message;

	}

	public Response() {

	}

	private int statusCode;
	private String message;
	private Object obj;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}
