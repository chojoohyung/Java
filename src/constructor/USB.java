package constructor;

public class USB {
	private int capacity;
	private String color;
	
	public USB(int capacity, String color) {
		this.capacity = capacity;
		this.color = color;
	}
	
	public String tostring() {
		return "USB [capacity = "+ capacity + ", color = "+ color+"]"; 
	}
	
	public void save() {
		System.out.println(color+"색상인 USB에서 데이터를 저장한다");
	}
	
	public void read() {
		System.out.println(color+"색상인 USB에서 데이터를 읽어온다");
	}

	public int getCapacity() {
		return capacity;
	}

	public String getColor() {
		return color;
	}
	
	
}
