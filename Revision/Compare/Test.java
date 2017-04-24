 /*
 This test class will test both comparable and comparator interface
*/

public class Test {
	public static void main(String[] args) {
  
		HDTV tv1 = new HDTV(55, "Samsung");
		HDTV tv2 = new HDTV(60, "Sony");
		HDTV tv3 = new HDTV(42, "Panasonic");
 
		ArrayList<HDTV> al = new ArrayList<HDTV>();
		al.add(tv1);
		al.add(tv2);
		al.add(tv3);
    
    // Test your Comparator logic
		Collections.sort(al, new SizeComparator());
		for (HDTV a : al) {
			System.out.println(a.getBrand());
		}
    
    //Test your Comparable logic
    HDTVComparable o1 = new HDTVComparable(55, "Samsung");
		HDTVComparable o2 = new HDTVComparable(60, "Sony");
 
		if (o1.compareTo(o2) > 0) {
			System.out.println(o1.getBrand() + " is better.");
		} else {
			System.out.println(o2.getBrand() + " is better.");
		}
	}
}
