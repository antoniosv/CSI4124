import cern.jet.random.Exponential;
import cern.jet.random.engine.MersenneTwister;
//import cern.jet.random.

public class RVP 
{
	TVAssemblyExp model; // for accessing the clock
        // Data Models - i.e. random veriate generators for distributions
	// are created using Colt classes, define 
	// reference variables here and create the objects in the
	// constructor with seeds

	/* Data Models for implementing timing maps */
	protected Exponential interArrDist;  // Exponential distribution for interarrival times

	// Constructor
	public RVP(TVAssemblyExp model, Seeds sd) 
	{ 
		this.model = model; 
		// Set up distribution functions
		interArrDist = new Exponential(1.0/Const.WMean1,  
				         new MersenneTwister(sd.arrSd));
	}
	
	protected double duInput()  // for getting next value of uW(t)
	{
	    double nxtInterArr;
		
		/*
		 * nxtInterArr = sandwichInterArrDist.nextDouble();
		 *
		 * commented out of template, specific to example in class
		 * 1.0 below to compile
		 */
		nxtInterArr = 1.0;

	    // Note that interarrival time is added to current
	    // clock value to get the next arrival time.
	    return(nxtInterArr+model.clock);
	}

}
