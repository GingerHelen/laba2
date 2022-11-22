package moves.DamageMoves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
    public FireBlast() {
        super(Type.FIRE, 110, 85);
    }
    protected void applyOppDamage(Pokemon def) {

        if (Math.random() <= 0.1) Effect.burn(def);
    }
    @Override
    protected java.lang.String describe()
    {
        return "использует атаку fire blast";
    }
}
