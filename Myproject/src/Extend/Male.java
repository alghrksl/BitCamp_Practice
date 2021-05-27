package Extend;

public class Male extends PersonController {

	public Male(String name, String year, String hooby) {
		super(name, year);
		this.hooby = hooby;
	}

	private String hooby;

	public String getHooby() {
		return hooby;
	}

	public void setHooby(String hooby) {
		this.hooby = hooby;
	}

	void hello() {
		super.hello();
		System.out.println("내가 좋아하는 스포츠는 " + this.hooby);
	}

}
