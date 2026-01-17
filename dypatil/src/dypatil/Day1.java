/**
 * 
 */
package dypatil;

/**
 * 
 */
public class Day1 {

	/**
	 * @param args
	 */
	  int modelYear;
	  String modelName;

	  public Day1(int year, String name) {
	    modelYear = year;
	    modelName = name;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Day1 myCar = new Day1(1969, "Mustang");
		    System.out.println(myCar.modelYear + " " + myCar.modelName);
	}

}
