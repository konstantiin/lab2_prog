package bin;
import ru.ifmo.se.pokemon.*;
import bin.my_pokemons.*;
public class test {
	public static void main(String args[]){
		Minun a= new Minun("Ваня", 10);
		Ledyba b= new Ledyba("Петя", 10);
		Ledian c=new Ledian("Вася", 10);
		Oddish d=new Oddish("Витя", 10);
		Gloom e=new Gloom("Серёжа", 10);
		Bellosom f=new Bellosom("Саша", 10);



		Battle bat = new Battle();
		bat.addAlly(a);
		bat.addAlly(b);
		bat.addAlly(c);
		bat.addFoe(d);
		bat.addFoe(f);
		bat.addFoe(e);

		bat.go();
	}
}
