package org.shadowlands.demo;

public class ScriptLoaderDemoClass {
	private ICommandLineScript script;
	
	
	
	public void loadScript() {
		System.out.println("Loading script of type: " + script.getClass());
		System.out.println(script.viewDirectoryContents("MYdIR"));
	}
	
	
	// constructors
	public ScriptLoaderDemoClass() {}
	
	
	
	// setters and getters

	public ICommandLineScript getScript() {
		return script;
	}

	public void setScript(ICommandLineScript script) {
		this.script = script;
	}
	
	
	
	
}
