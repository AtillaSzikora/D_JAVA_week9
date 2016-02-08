package gadget;

public class GadgetTest
{
	public static void main(String[] args)
	{
		Gadget drone = new Drone();
		Gadget machine = new WMachine();
		System.out.println(drone);
		System.out.println(machine);
		drone.turnOff();
		machine.turnOff();
	}
}