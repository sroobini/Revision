
public class ManicureDecorator extends ParlourDecorator {

		public ManicureDecorator(final NaturalsParlour naturalsparlour){
			super(naturalsparlour);
		}
		public String service(){
			return this.naturalsparlour.service() + manicure();
		}
		
		private String manicure(){
			return " + Manicure";
		}
		
		public int cost(){
			 return this.naturalsparlour.cost() + 25;
			
		}
}
