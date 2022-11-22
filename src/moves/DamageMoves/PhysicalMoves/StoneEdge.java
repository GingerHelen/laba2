package moves.DamageMoves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100, 80);
    }
    @Override
    protected java.lang.String describe() {
        return "использует атаку stone edge";
    }
}
