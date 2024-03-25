package com.satya.servlet;
import java.io.*;
import java.util.*;



public class DataStreamDemo {
	public static void main(String[] args) {		int rollno=1;
		String name=("kapil");
		float marks=456.00f;
		try
		{
			FileOutputStream fos=new FileOutputStream("E:/demo.txt");
			DataOutputStream dos=new DataOutputStream (fos);
			dos.writeInt(rollno);
			dos.writeUTF(name);
			dos.writeFloat(marks);
			dos.close();
			FileInputStream fis=new FileInputStream("E:/demo.txt");
			DataInputStream dis=new DataInputStream(fis);
			int rno=dis.readInt();
			String nm=dis.readUTF();
			float mks=dis.readFloat();
			System.out.println(rno+" "+nm+" "+mks);
			dis.close();
		}
		}
		catch (FileNotFoundException fne)
		{
			System.out.println(fne.getMessage());
			
		}
		}
}

