public class Person {
	String name;
	String superpower;
	boolean hasTerminalDisease;

	public Person(String name, String superpower, boolean hasTerminalDisease) {
		this.name = name;
		this.superpower = superpower;
		this.hasTerminalDisease = hasTerminalDisease;
	}

	void setname() {
		this.name = name;
	}

	String getname() {
		return name;
	}

	void setsuperpower() {
		this.superpower = superpower;
	}

	String getsuperpower() {
		return superpower;
	}

	void hasTerminalDisease() {
		this.hasTerminalDisease = hasTerminalDisease;
	}

	boolean gethasTerminalDisease() {
		return hasTerminalDisease;
	}

	@Override
	public String toString() {

		// TODO Auto-generated method stub
		return "This is " + name + " whos superpower is " + superpower + " and " + hasTerminalDisease + " has a termial disease";
	}
}