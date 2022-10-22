package bin.my_attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;


public class FocusBlast extends SpecialMove{
	static Effect e = new Effect().chance(0.1).turns(0).attack(1.0).stat(Stat.SPECIAL_DEFENSE, -1);
	public FocusBlast() {
		super(Type.FIGHTING, 120, 0.7);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		p.addEffect(e);
	}
	@Override
	protected String describe(){
		return "применил FocusBlast";
	}
}
