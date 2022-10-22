package bin.my_attacks;
import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{
	static Effect e = new Effect().turns(0).attack(1.0).stat(Stat.SPECIAL_ATTACK, -1);
	public Confide() {
		super(Type.NORMAL, 0, 1);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		p.addEffect(e);
	}
	@Override
	protected String describe(){
		return "применил Confide";
	}
}
