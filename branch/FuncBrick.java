package by.jonline.pr01.branch;

/* Done: Brick sizes x, y, z; Hole sizes A, B;
 * To solve: Can the brick pass through the hole?
*/

public class FuncBrick {

	public static void main(String[] args) {

		double x = 3.0;
		double y = 2.0;
		double z = 1.0;

		double a = 2.5;
		double b = 0.9;

		boolean res = false;
		
		res = ((x <= a) & ((y <= b) | (z <= b))) ||
			  ((x <= b) & ((y <= a) | (z <= a))) ||
			  ((y <= a) & (z <= b)) ||
			  ((y <= b) & (z <= a))
				? true : false;
		if (res) {
			System.out.println("The brick can pass through the hole");
		}else {
			System.out.println("The brick can't pass through the hole");
		}
	}

}
