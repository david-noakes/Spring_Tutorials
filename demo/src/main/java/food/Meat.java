package food;

//v0.0.02 - introduce a property and set it via appContext.xml
public class Meat {
	
	private String sName="not set";
	private String sDesc="%s";
	
	public String talkAboutYourself() {
		if (sName != null && sName.trim().length() > 0) {
			return String.format(sDesc, sName);
		}
		return "Hi, I'm an unspecified meat product.";
	}

	public String getSName() {
		return sName;
	}

	public void setSName(String name) {
		this.sName = name;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getSDesc() {
		return sDesc;
	}

	public void setSDesc(String sDesc) {
		this.sDesc = sDesc;
	}
}
