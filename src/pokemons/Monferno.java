package pokemons;
import moves.StatusMoves.*;
import moves.DamageMoves.SpecialMoves.*;
import moves.DamageMoves.PhysicalMoves.*;
import ru.ifmo.se.pokemon.Type;

public class Monferno extends Chimchar {
    public Monferno(String name, int level) {
        super(name, level);
        setStats(64, 78, 52, 78, 52, 81);
        setType(Type.FIRE, Type.FIGHTING);
        setMove(new FireBlast(), new Scratch(), new SlackOff(64));
    }
}
