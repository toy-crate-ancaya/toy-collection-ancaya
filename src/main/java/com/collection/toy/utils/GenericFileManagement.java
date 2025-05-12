package com.collection.toy.utils;


public interface GenericFileManagement {
	
	void setToyArchiveName(String toyArchiveName);
	void setToyOriginalName(String toyOriginalName);
	void setToyArchivePath(String toyArchivePath);
	void setToyArchiveType(String toyArchiveType);
	
	String getToyArchiveName();
    String getToyOriginalName();
    String getToyArchivePath();
    String getToyArchiveType();
	
}
