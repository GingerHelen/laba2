package moves.DamageMoves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class Scratch extends PhysicalMove {
    public Scratch() {
        super(Type.NORMAL, 40, 100);
    }
    @Override
    protected java.lang.String describe() {
        return "использует атаку scratch";
    }
}
