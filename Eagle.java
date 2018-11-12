public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }
    
    @Override
    public String sing() {
        return "Aaaaaah !";
    }

    public boolean isFlying() {
    	System.out.println(flying);
        return flying; 
    }
    
    public void takeOff() {
    	System.out.println(this.getName() + " is taking off ");
    }
    
    @Override
    public int ascend(int meters) {
    	this.altitude += meters;
    	System.out.println(this.getName() + " fly upward, altitude : " + getAltitude());
        return getAltitude();
    }
    
    @Override
    public int descend(int meters) {
    	this.altitude = meters;
    	System.out.println(this.getName() + " fly downward, altitude : " + getAltitude());
    	return getAltitude();
    }
    
    public void land() {
    	if (getAltitude() < 10) {
    		System.out.println(this.getName() + " lands on the ground.");
    	} else {
    		System.out.println(this.getName() + " is too high, it can't lands");
    	}
    }
    @Override
    public void glide() {
    	Fly.super.glide();
	}
    
}
