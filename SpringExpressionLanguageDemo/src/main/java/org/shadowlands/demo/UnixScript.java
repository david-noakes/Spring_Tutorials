package org.shadowlands.demo;


public class UnixScript implements ICommandLineScript {
	
	public String viewDirectoryContents(String dir) {
		return "ls " + dir;
	}

}
