
public interface Fly {
	void takeOff();
	
	int ascend(int meters);
	
	int descend(int meters);
	
	void land();
	
	public default void glide() {
		System.out.println("It glides into the air.");
	}
}
