package food;

//v0.0.02 - introduce a property and set it via appContext.xml
public class Dairy {
	
	private String sName;
	
	public String talkAboutYourself() {
		if (sName != null && sName.trim().length() > 0) {
			return "Hi, I'm " + sName + " which is a dairy product.";
		}
		return "Hi, I'm an unspecified dairy product.";
	}

	public String getSName() {
		return sName;
	}

	public void setSName(String name) {
		this.sName = name;
	}
}
