
public class PedicureDecorator extends ParlourDecorator {

		public PedicureDecorator(final NaturalsParlour naturalsparlour){
			super(naturalsparlour);
		}
		public String service(){
			return this.naturalsparlour.service() + pedicure();
		}
		
		private String pedicure(){
			return " + Pedicure";
		}
		
		public int cost(){
			return this.naturalsparlour.cost() + pedicureCost();
		}
		private int pedicureCost(){
			//int amount=0;
			
			String check = this.naturalsparlour.service();
			if (check.contains("BrideGroom Package")||check.contains("Men's Package")){
				return 10;
	}
			else if (this.naturalsparlour.service().contains("Women's Package")||this.naturalsparlour.service().contains("Bride Package")){
				return 20;
			}
			return 0;
		}
}
