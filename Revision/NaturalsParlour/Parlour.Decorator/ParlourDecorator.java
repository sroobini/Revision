
public abstract class ParlourDecorator implements NaturalsParlour{
			protected NaturalsParlour naturalsparlour;
	
	public ParlourDecorator(final NaturalsParlour naturalsparlour){
		this.naturalsparlour = naturalsparlour;
	}
}
