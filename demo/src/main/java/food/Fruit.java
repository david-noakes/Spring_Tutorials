package food;

import java.util.List;
import java.util.Map;



// v0.0.02 - introduce a non default constructor. We also need to create the default constructor, since we lose it otherwise
// v0.0.03 - introduce collections
public class Fruit   {
	
	private String sName;
	private List<String> fruitNameList;
	private Map<String, String> fruitNameMap;
	
	public Fruit() {setFruitName("");} // no argument constructor now explicitly defined
	
	public Fruit(String name) {
//		super();
		setFruitName(name);
	}

	public String talkABoutYourself() {
		String speech;
		
		if (sName != null && sName.trim().length() > 0) {
			speech = "Hi, I am a fruit called " + sName + ". I come from plants or trees with seeds";
		} else {
			speech =  "Hi, I am a fruit. I come from plants or trees with seeds";
		}
		
		if (fruitNameList != null && fruitNameList.size() > 0) {
			String comma = "";
			speech += "\nList: ";
//			fruitNameList.forEach(item->{  // java 8 does not allow this code to compile
//				speech += comma + " " + item;
//				comma = ",";
//			});
			for (int i = 0; i < fruitNameList.size(); i++) {
				speech += comma + " " + fruitNameList.get(i);
				comma = ",";
			}
		}
		
		if (fruitNameMap != null && fruitNameMap.size()>0) {
			String comma = "";
			speech += "\nMap: ";
			for (Map.Entry<String, String> item : fruitNameMap.entrySet()) {
				speech += comma + item.getKey() + " ==> " + item.getValue();
				comma =  " :: ";
			}
		}
		
		return speech;
	}

	public String getFruitName() {
		return sName;
	}

	public void setFruitName(String name) {
		this.sName = name;
	}

	public List<String> getFruitNameList() {
		return fruitNameList;
	}

	public void setFruitNameList(List<String> fruitNameList) {
		this.fruitNameList = fruitNameList;
	}

	public Map<String, String> getFruitNameMap() {
		return fruitNameMap;
	}

	public void setFruitNameMap(Map<String, String> fruitNameMap) {
		this.fruitNameMap = fruitNameMap;
	}

}
