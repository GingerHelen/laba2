package pokemons;
import moves.StatusMoves.*;
import moves.DamageMoves.SpecialMoves.*;
import moves.DamageMoves.PhysicalMoves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Alomomola extends Pokemon {
    public Alomomola(String name, int level) {
        super(name, level);
        setStats(165, 75, 80, 40, 45, 65);
        setType(Type.WATER);
        setMove(new HealPulse(165), new Pound(), new PlayNice(), new Scald());
    }
}
