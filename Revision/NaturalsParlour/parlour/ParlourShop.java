
public class ParlourShop {

    public static void main(final String[] args) {
    
    int totalCost = 0;
    
    NaturalsParlour brideGroom = ParlourFactory.getPackage(PackageType.BRIDEGROOM.name());
    String packageService = new HairDecorator(new FacialDecorator(new PedicureDecorator(brideGroom))).service();
    int packageCost = new HairDecorator(new PedicureDecorator(new FacialDecorator(brideGroom))).cost();
    System.out.println("\n'" + packageService + "' --> cost " + packageCost);
    totalCost = totalCost + packageCost;
    
    NaturalsParlour mensPackage = ParlourFactory.getPackage(PackageType.MEN.name());
    packageService = new HairDecorator(new FacialDecorator(mensPackage)).service();
    packageCost = new HairDecorator(new FacialDecorator(mensPackage)).cost();
    System.out.println("\n'" + packageService + "' --> cost " + packageCost);
    totalCost = totalCost + packageCost;
    
    NaturalsParlour bride = ParlourFactory.getPackage(PackageType.BRIDE.name());
    packageService = new ManicureDecorator(new HairDecorator(new FacialDecorator(new PedicureDecorator(bride)))).service();
    packageCost = new ManicureDecorator(new HairDecorator(new FacialDecorator(new PedicureDecorator(bride)))).cost();
    System.out.println("\n'" + packageService + "' --> cost " + packageCost);
    totalCost = totalCost + packageCost;
    
    NaturalsParlour womensPackage = ParlourFactory.getPackage(PackageType.WOMEN.name());
    packageService = new ManicureDecorator(new HairDecorator(new FacialDecorator(womensPackage))).service();
    packageCost = new ManicureDecorator(new HairDecorator(new FacialDecorator(womensPackage))).cost();
    System.out.println("\n'" + packageService + "' --> cost " + packageCost);
    totalCost = totalCost + packageCost;
    
    System.out.println("\n" + "The Total Bill is " + totalCost);
    }
	
}
