/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
    DACArecipient test = new DACArecipient();

    System.out.println("Test: " + test);

    DACArecipient test2 = new DACArecipient("Blake", "Luna-Beltran",
     "123456789", "USA", 2440539,2440539,2440539, 'M');

     System.out.println("Test #2: "+ test2);
  }
}