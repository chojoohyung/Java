package constructor;

public class Constructor {
private int stdId;
private String name;

public Constructor(int stdId, String name) {
	this.stdId = stdId;
	this.name = name;
}

public int getStdId() {
	return stdId;
}
public String getName() {
	return name;
}
}
