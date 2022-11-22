package moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon att) {
       Effect.sleep(att);
       att.restore();
    }
    @Override
    protected java.lang.String describe() {
        return "использует атаку rest";
    }
}
