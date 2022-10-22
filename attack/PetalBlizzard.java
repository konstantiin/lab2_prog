package bin.my_attacks;
import ru.ifmo.se.pokemon.*;

public class PetalBlizzard extends PhysicalMove{
	public PetalBlizzard() {
		super(Type.GRASS, 90, 1);
	}
	@Override
	protected String describe(){
		return "применил Petal Blizzard";
	}
}
