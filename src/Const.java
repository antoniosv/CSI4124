
public class Const 
{
	/* Constants */

	// Default conveyor capacities
	final static int OP10_CID_CAPACITY = 40;
	final static int OP20_CID_CAPACITY = 5;
	final static int OP30_CID_CAPACITY = 5;
	final static int OP40A_CID_CAPACITY = 5;
	final static int OP40B_CID_CAPACITY = 1;
	final static int OP40C_CID_CAPACITY = 1;
	final static int OP40D_CID_CAPACITY = 1;
	final static int OP40E_CID_CAPACITY = 1;
	final static int TEST_CID_CAPACITY = 5;
	final static int REWORK_CID_CAPACITY = 10;
	final static int NONE_CID_CAPACITY = 5;
	final static int OP50_CID_CAPACITY = 5;
	final static int OP60_CID_CAPACITY = 5;

	// Operation times and distributions
	// MEANS are in minutes
	final static double MOVE_TIME_CONSTANT = 0.5;
	final static double OP10_MEAN = 1.9;
	final static double OP10_SD =  0.19;
	final static double OP20_TIME = 2.1;
	final static double OP20_SETUP_MEAN = 5.0;
	final static double OP20_SETUP_SD = 0.5;
	final static double OP40_CONSTANT = 1.5;
	final static double TEST_CONSTANT = 1.5;
	final static double TEST_SETUP_MEAN = 3.0;
	final static double TEST_SETUP_SD = 0.3;
	final static double REWORK_MEAN = 35.0;
	final static double OP50_CONSTANT = 2.1;
	final static double OP50_SETUP_MEAN = 5.0;
	final static double OP50_SETUP_SD = 0.5;
	final static double OP60_MEAN = 1.9;
	final static double OP60_SD = 0.19;
	
	// Remove it once we updated RVP's
	static double WMean1 = 1.0;
}
