package constructor;


public class RunUSB {

	public static void main(String[] args) {
		USB usb1 = new USB(128, "Red");
		USB usb2 = new USB(256, "Orange");
		
		System.out.println(usb1.tostring());
		usb1.save();
		usb1.read();
		System.out.println("=================================");
		System.out.printf("* 용량: %dGB\n",usb2.getCapacity());
		System.out.printf("* 색상: %s\n",usb2.getColor());
		usb2.read();
	}

}
