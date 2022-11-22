package pokemons;
import moves.StatusMoves.*;
import moves.DamageMoves.PhysicalMoves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gligar extends Pokemon {
    public Gligar(String name, int level) {
        super(name, level);
        setStats(65, 75, 105, 35, 65, 85);
        setType(Type.GROUND, Type.FLYING);
        setMove(new DoubleTeam(), new Confide(), new StoneEdge());
    }
}
