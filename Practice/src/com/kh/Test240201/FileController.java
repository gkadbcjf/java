package com.kh.Test240201;

public class FileController {
	private FileDAO fd;

	public FileController() {
		this.fd = new FileDAO();
	}
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	
	public void fileSave(String file,StringBuilder sb) {
		String str = sb.toString();
		fd.fileSave(file, str);
	}
	
	public StringBuilder fileOpen(String file) {
		
		return fd.fileOpen(file);
	
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		String str =sb.toString();
		fd.fileEdit(file, str);
	}
	
}
