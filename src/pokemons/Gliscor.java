package pokemons;
import moves.StatusMoves.*;
import moves.DamageMoves.PhysicalMoves.*;
import ru.ifmo.se.pokemon.Type;

public class Gliscor extends Gligar {
    public Gliscor(String name, int level) {
        super(name, level);
        setStats(75, 95, 125, 45, 75, 95);
        setType(Type.GROUND, Type.FLYING);
        setMove(new DoubleTeam(), new Confide(), new StoneEdge(), new IceFang());
    }
}
