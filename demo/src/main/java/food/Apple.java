package food;

public class Apple extends Fruit {
    private String name;
    private String sDesc="%s";
    
    public Apple() {}
    
    public String talkAboutYourself() {
    	String result = String.format(super.getSDesc(), name) ;
    	return result;		
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getsDesc() {
		return sDesc;
	}

	public void setsDesc(String sDesc) {
		this.sDesc = sDesc;
	}
}
