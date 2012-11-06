import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;

import ABSmodJ.ScheduledAction;


public class Initialise extends ScheduledAction
{
	ModelName model;
	
	// Constructor
	public Initialise(ModelName model) { this.model = model; }

	double [] ts = { 0.0, -1.0 }; // -1.0 ends scheduling
	int tsix = 0;  // set index to first entry.
	public double timeset() 
	{
		return ts[tsix++];  // only invoked at t=0
	}

	public void actionEvent() 
	{
		// System Initialisation
                // Add initilisation instructions 
	}
	

}
