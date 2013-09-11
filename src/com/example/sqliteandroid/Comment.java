package com.example.sqliteandroid;

public class Comment {
	  private long id;
	  private String comment;

	  //your code

	  // Will be used by the ArrayAdapter in the ListView
	  @Override
	  public String toString() {
	    return comment;
	  }
	} 
