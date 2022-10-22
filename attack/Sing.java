package bin.my_attacks;
import ru.ifmo.se.pokemon.*;

public class Sing extends StatusMove{
	Effect e = new Effect().condition(Status.SLEEP);
	public Sing() {
		super(Type.NORMAL, 0, 55);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		p.setCondition(e);
	}
	@Override
	protected String describe(){
		return "спел колыбельную";
	}
}

