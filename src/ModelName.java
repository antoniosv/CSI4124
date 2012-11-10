//******************************************************
import java.util.*;
import java.util.concurrent.*;
import ABSmodJ.AOSimulationModel;
import ABSmodJ.Behaviour;
import ABSmodJ.ScheduledAction;

import cern.jet.random.engine.*;
import cern.jet.random.*;
//
// The Simulation model Class
class ModelName extends AOSimulationModel
{
	// Constants available from Const class
	/* Parameter */
        // Define the paramters

	/*-------------Entity Data Structures-------------------*/
	/* Group and Queue Entities */
	// Define the reference variables to the various 
	// entities with scope Set and Unary
	// Objects can be created here or in the Initialise Action

	/* Input Variables */
	// Define any Independent Input Varaibles here
	
	// References to RVP and DVP objects
	RVP rvp;  // Reference to rvp object - object created in constructor
	DVP dvp = new DVP(this);  // Reference to dvp object

	// Output object
	Output output = new Output();

	// Methods Model Behaviour

	// Constructor - Also Initialises the model
	public ModelName(double t0time, double tftime, /*define other args,*/ Seeds sd)
	{
		// Initialise parameters here
		
		// Create RVP object with given seed
		rvp = new RVP(this,sd);
		
		// rgCounter and qCustLine objects created in Initalise Action
		
		// Initialise the simulation model
		initAOSimulModel(t0time,tftime);   

		     // Schedule the first arrivals and employee scheduling
		Initialise init = new Initialise(this);
		scheduleAction(init);  // Should always be first one scheduled.
		// Schedule other scheduled actions and acitvities here
	}

	/************  Implementation of Data Modules***********/	
	/*
	 * Testing preconditions
	 */
	public void testPreconditions(Behaviour behObj)
	{
		// Bootstrapping scheduled actions and activities
		reschedule(behObj); 

		// Check preconditions of Conditional Activities

		// Check preconditions of Interruptions in Extended Activities
	}
	
	public void eventOccured()
	{
		//this.showSBL();
		// Can add other debug code to monitor the status of the system

		// Setup an updateTrjSequences() method in the Ouput class
		// and call here if you have Trajectory Sets
		// updateTrjSequences() 
	}
}


