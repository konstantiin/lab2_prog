package bin.my_attacks;

import ru.ifmo.se.pokemon.*;

public class Nuzzle extends PhysicalMove{
	Effect e = new Effect().condition(Status.PARALYZE);
	public Nuzzle() {
		super(Type.ELECTRIC, 20, 1);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		p.setCondition(e);
	}
	@Override
	protected String describe(){
		return "применил Nuzzle";
	}
}

