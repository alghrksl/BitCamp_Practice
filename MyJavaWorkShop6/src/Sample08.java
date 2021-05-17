class Company {
	private String name;
	private String location;
	public Company() {}
	public Company(String name, String location) {
		this.name = name; this.location = location;
	}
	public void setName(String name) { // Setter
		this.name = name;
	}
	public String getName() { // Getter
		return this.name;
	}
	public void setCompanyAll(String name, String location) {
		this.name = name; this.location = location;
	}
	public void setLocation(String location) { // 
		this.location = location;
	}
	public String getLocation() {
		return this.location;
	}
}
public class Sample08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c = new Company();
		c.setName("È«±æµ¿");
		String name = c.getName();
		System.out.println(name);
		c.setLocation("¼­¿ï");
		String location = c.getLocation();
		System.out.println(location);
		
	}

}
