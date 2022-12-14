package pokemons;
import moves.DamageMoves.SpecialMoves.*;
import moves.DamageMoves.PhysicalMoves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Chimchar extends Pokemon {
    public Chimchar(String name, int level) {
        super(name, level);
        setStats(44, 58, 44, 58, 44, 61);
        setType(Type.FIRE);
        setMove(new FireBlast(), new Scratch());
    }
}
