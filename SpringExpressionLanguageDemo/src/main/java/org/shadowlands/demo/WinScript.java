package org.shadowlands.demo;


public class WinScript implements ICommandLineScript {
	
	public String viewDirectoryContents(String dir) {
		return "dir " + dir;
	}

}
