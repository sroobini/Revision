class HDTVComparable implements Comparable<HDTV> {
	private int size;
	private String brand;
 
	public HDTVComparable(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}
 
	public int getSize() {
		return size;
	}
 
	public void setSize(int size) {
		this.size = size;
	}
 
	public String getBrand() {
		return brand;
	}
 
	public void setBrand(String brand) {
		this.brand = brand;
	}
 
	@Override
	public int compareTo(HDTVComparable tv) {
  //IMPLEMENT THIS METHOD.
	}
}
