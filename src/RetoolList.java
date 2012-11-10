import java.util.List;
import java.util.ArrayList;

public class RetoolList
{
	private static RetoolList ref;
	public int n;
	public List<AutomaticON> list = new ArrayList<AutomaticON>();
	
	public static RetoolList getRetoolList()
	{
		if (ref == null)
			ref = new RetoolList();
		return ref;
	}
}