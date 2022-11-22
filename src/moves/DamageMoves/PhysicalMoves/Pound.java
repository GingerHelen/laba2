package moves.DamageMoves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class Pound extends PhysicalMove {
    public Pound() {
        super(Type.NORMAL, 40, 100);
    }
    @Override
    protected java.lang.String describe() {
        return "использует атаку pound";
    }
}
