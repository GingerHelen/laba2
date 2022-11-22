package moves.DamageMoves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class IceFang extends PhysicalMove {
    public IceFang() {
        super(Type.ICE, 65, 95);
    }
    protected void applyOppDamage(Pokemon def) {
        if (Math.random() <= 0.1) Effect.freeze(def);
        if (Math.random() <= 0.1) Effect.flinch(def);
    }
    @Override
    protected java.lang.String describe() {
        return "использует атаку ice fang";
    }
}
