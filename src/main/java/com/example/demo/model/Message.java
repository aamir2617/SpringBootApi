package com.example.demo.model;

import com.google.gson.annotations.SerializedName;

public class Message {
	
	@SerializedName("message")
	String message;
	
	public Message(String message)
	{
		this.message = message;
	}
	
	public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
	
	

}
