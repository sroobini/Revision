package parlour.decorator;

import parlour.NaturalsParlour;

public class FacialDecorator extends ParlourDecorator {

		public FacialDecorator(final NaturalsParlour naturalsparlour){
			super(naturalsparlour);
		}
		public String service(){
			return this.naturalsparlour.service() + facial();
		}
		
		private String facial(){
			return " + Facial";
		}
		
		public int cost(){
			return this.naturalsparlour.cost() + facialCost();
		}
		private int facialCost(){
			//int amount=0;
			String check = this.naturalsparlour.service();

			if (check.contains("BrideGroom Package")||check.contains("Men's Package")){
				return 30;
	}
			else if (this.naturalsparlour.service().contains("Women's Package")||this.naturalsparlour.service().contains("Bride Package")){
				return 50;
			}
			return 0;
		}
}
