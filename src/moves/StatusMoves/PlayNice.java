package moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

public class PlayNice extends StatusMove {
    public PlayNice() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        def.setMod(Stat.ATTACK, -1);
    }
    @Override
    protected java.lang.String describe() {
        return "использует атаку play nice";
    }
}
