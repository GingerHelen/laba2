package moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0 ,0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, +1);
    }
    @Override
    protected java.lang.String describe() {
        return "использует атаку double team";
    }
}
