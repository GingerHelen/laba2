import ru.ifmo.se.pokemon.Battle;
import pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Gligar p1 = new Gligar("1", 1);
        Chimchar p2 = new Chimchar("2", 1);
        Alomomola p3 = new Alomomola("3", 1);
        Gliscor p4 = new Gliscor("4", 2);
        Infernape p5 = new Infernape("5", 3);
        Monferno p6 = new Monferno("6", 2);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p6);
        b.addFoe(p4);
        b.go();
    }
}