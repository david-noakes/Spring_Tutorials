package food;

//v0.0.02 - introduce a property and set it via appContext.xml
//v0.0.03 - configuration using external files ...
public class Vegetable {
	
	private String name = "not set";
	private String sDesc = "%s";
	
	public String talkAboutYourself() {
		if (name != null && name.trim().length() > 0) {
			return String.format(sDesc, name);
		}
		return "Hi, I'm a vegetable. I am a plant that is eaten as food.";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSDesc() {
		return sDesc;
	}

	public void setSDesc(String sDesc) {
		this.sDesc = sDesc;
	}
	public String getsDesc() {
		return sDesc;
	}

	public void setsDesc(String sDesc) {
		this.sDesc = sDesc;
	}
}
