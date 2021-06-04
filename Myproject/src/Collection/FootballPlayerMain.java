package Collection;

import java.io.Serializable;

public class FootballPlayerMain implements Comparable<FootballPlayerMain> {

	String name;
	int backNumber;
	String team;
	int age;

	// 3.TreeSet<E>을 이용해서 팀 이름순으로 정렬하고,
	// 같은 팀의 선수들은 이름 순으로 정렬하고,
	// 같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다.
	@Override
	public String toString() {
		return "이름 > " + name + "| 등번호 > " + backNumber + "| 팀 > " + team + ", 나이 > " + age + "]";
	}

	public int compareTo(FootballPlayerMain o) {
		int result = this.team.compareTo(o.getTeam());
		if (result == 0) {
			result = this.name.compareTo(o.getName());
			if (result == 0) {
				result = this.backNumber - o.getBackNumber();
			}
		}
		return result;
	}

	public FootballPlayerMain(String name, int backNumber, String team, int age) {
		super();
		this.name = name;
		this.backNumber = backNumber;
		this.team = team;
		this.age = age;
	}

	void showInfo() {
		System.out.println("이름 > " + getName());
		System.out.println("등번호 > " + getBackNumber());
		System.out.println("팀 > " + getTeam());
		System.out.println("나이 > " + getAge());
		System.out.println("");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBackNumber() {
		return backNumber;
	}

	public void setBackNumber(int backNumber) {
		this.backNumber = backNumber;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + backNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FootballPlayerMain other = (FootballPlayerMain) obj;
		if (age != other.age)
			return false;
		if (backNumber != other.backNumber)
			return false;
		return true;
	}

}
