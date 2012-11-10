
public class Maintenance
{
	private static Maintenance ref;
	public static enum StatusTypes { IDLE, BUSY };
	public StatusTypes status;
	
	public static Maintenance getMaintenance()
	{
		if (ref == null)
			ref = new Maintenance();
		return ref;
	}
}
