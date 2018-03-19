package com.bmoutinho;

import java.io.File;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File.createTempFile("", null);
		} catch (Exception erreur) {
			erreur.printStackTrace();
		}
		
	}

}
