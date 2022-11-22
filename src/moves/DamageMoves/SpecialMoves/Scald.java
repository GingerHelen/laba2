package moves.DamageMoves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    public Scald() {
        super(Type.WATER, 80, 100);
    }
    protected void applyOppDamage(Pokemon def) {
        if (Math.random() <= 0.3) Effect.burn(def);
    }
    @Override
    protected java.lang.String describe() {
        return "использует атаку scald";
    }
}
