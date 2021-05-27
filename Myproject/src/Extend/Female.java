package Extend;

public class Female extends PersonController {

	private String hooby;

	public String getHooby() {
		return hooby;
	}

	public void setHooby(String hooby) {
		this.hooby = hooby;
	}

	public Female(String name, String year, String hooby) {
		super(name, year);
		this.hooby = hooby;

	}

	void hello() {
		super.hello();
		System.out.println("내가 좋아하는 취미는 " + this.hooby);
	}

}
