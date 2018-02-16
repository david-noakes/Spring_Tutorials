package food;

/*
 * v001 - basic bean
 * v002 - introduce non default constructor 
 */
public class Meal {

	private Fruit fruit;
	private Dairy dairy;
	private Grain grain;
	private Meat meat;
	private Vegetable vegie;
	
	
	// constructors
	public Meal() {
		super();
	}
	
	public Meal(Fruit fruit, Dairy dairy, Grain grain, Meat meat, Vegetable vegie) {
		super();
		this.fruit = fruit;
		this.dairy = dairy;
		this.grain = grain;
		this.meat = meat;
		this.vegie = vegie;
	}



	// methods
	public String whatsInThisMeal() {
		String mealContains = "This meal contains: ";
		
		if (fruit != null) {mealContains += "some fruit: " + fruit.getFruitName() + "; ";}
		if (dairy != null) {mealContains += "some dairy: " + dairy.getSName() + "; ";}
		if (grain != null) {mealContains += "some grain: " + grain.getSName() + "; ";}
		if (meat != null) {mealContains += "some meat: " + meat.getSName() + "; ";}
		if (vegie != null) {mealContains += "some vegies: " + vegie.getName() + "; ";}
		
		return mealContains;
	}
	
	
	// getters and setters
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public Dairy getDairy() {
		return dairy;
	}
	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}
	public Grain getGrain() {
		return grain;
	}
	public void setGrain(Grain grain) {
		this.grain = grain;
	}
	public Meat getMeat() {
		return meat;
	}
	public void setMeat(Meat meat) {
		this.meat = meat;
	}
	public Vegetable getVegie() {
		return vegie;
	}
	public void setVegie(Vegetable vegie) {
		this.vegie = vegie;
	}
	
	
}
