package com.SerializableExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		String path="G:\\JAVA WCCE2\\J2EEfolder\\emp.ser";
		File f=new File(path);
		 
		try {
			f.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		FileOutputStream fos=null;
		ObjectOutputStream os=null;
		Employee emp=new Employee("Radhika","radhika1799@gmail.com");
		
		try {
			fos=new FileOutputStream(f);
			 os=new ObjectOutputStream(fos);
			   os.writeObject(emp);
			   System.out.println("object is serialized");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				os.close();
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		  
	}

}
