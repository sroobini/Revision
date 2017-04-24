
public class HairDecorator extends ParlourDecorator {

		public HairDecorator(final NaturalsParlour naturalsparlour){
			super(naturalsparlour);
		}
		public String service(){
			return this.naturalsparlour.service() + hair();
		}
		
		private String hair(){
			return " + Hair";
		}
		
		public int cost(){
			int amount=0;
			if (this.naturalsparlour.service().contains("Men's Package") || this.naturalsparlour.service().contains("BrideGroom Package")){
					amount =  this.naturalsparlour.cost() + 15;
		}
			else if (this.naturalsparlour.service().contains("Women's Package")||this.naturalsparlour.service().contains("Bride Package")){
				amount =  this.naturalsparlour.cost() + 60;
			}
			return amount;
		}
}
