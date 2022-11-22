package moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

public class HealPulse extends StatusMove {
    int f;
    public HealPulse(int f) {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, f/2);
    }
    @Override
    protected java.lang.String describe() {
        return "использует атаку heal pulse";
    }
}
