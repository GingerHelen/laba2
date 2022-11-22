package pokemons;
import moves.StatusMoves.*;
import moves.DamageMoves.SpecialMoves.*;
import moves.DamageMoves.PhysicalMoves.*;
import ru.ifmo.se.pokemon.Type;

public class Infernape extends Monferno {
    public Infernape(String name, int level) {
        super(name, level);
        setStats(76, 104, 71, 104, 71, 108);
        setType(Type.FIRE, Type.FIGHTING);
        setMove(new FireBlast(), new Scratch(), new SlackOff(76), new Rest());
    }
}
