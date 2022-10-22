package bin.my_attacks;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
	static Effect e = new Effect().condition(Status.SLEEP);
	public Rest() {
		super(Type.PSYCHIC, 0, 1);
	}
	@Override
	protected void applySelfEffects(Pokemon p){
		p.addEffect(e);
		p.setMod(Stat.HP, -(int)(p.getStat(Stat.HP)));
	}
	@Override
	protected String describe(){
		return "решил отдохнуть";
	}
}
