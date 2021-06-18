package JDBC;

public class Dept {
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", LOC=" + LOC + "]";
	}

	public Dept(int deptno, String dname, String lOC) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		LOC = lOC;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLOC() {
		return LOC;
	}

	public void setLOC(String lOC) {
		LOC = lOC;
	}

	private int deptno;
	private String dname;
	private String LOC;

}
