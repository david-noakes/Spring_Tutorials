package food;

//v0.0.02 - introduce a property and set it via appContext.xml
public class Meat {
	
	private String sName;
	
	public String talkAboutYourself() {
		if (sName != null && sName.trim().length() > 0) {
			return "Hi, I'm " + sName + " which is a meat product.";
		}
		return "Hi, I'm an unspecified meat product.";
	}

	public String getSName() {
		return sName;
	}

	public void setSName(String name) {
		this.sName = name;
	}
}
