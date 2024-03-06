package com.kh.Test240201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		File f = new File(file);
		return f.exists();

	}

	public void fileSave(String file, String s) {
//		try (FileWriter fw = new FileWriter(file);) {
//			fw.write(s);
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try(BufferedWriter br =new BufferedWriter(new FileWriter(file));) {
			br.write(s);
			br.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public StringBuilder fileOpen(String file) {
		StringBuilder st = new StringBuilder();
	
		try (BufferedReader br = new BufferedReader(new FileReader(file));) {
			String value;

			while ((value = br.readLine()) != null) {
				st.append(value).append("\n");    //str += value + "\n" ;
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return st;

	}

	public void fileEdit(String file, String s) {
		try(BufferedWriter bw =new BufferedWriter(new FileWriter(file));) {
			bw.write(s);
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
	}

}
