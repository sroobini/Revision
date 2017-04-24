

public class ParlourFactory {
	
	
    public static NaturalsParlour getPackage(final String name){
    	if (name == null) {
            return null;
        }
        if (PackageType.MEN.name().equalsIgnoreCase(name)) {
            return new Men();
        } else if (PackageType.WOMEN.name().equalsIgnoreCase(name)) {
            return new Women();
        } else if (PackageType.BRIDE.name().equalsIgnoreCase(name)) {
            return new Bride();
        } else if (PackageType.BRIDEGROOM.name().equalsIgnoreCase(name)) {
            return new BrideGroom();
        }

        return null;
    }

	
}
