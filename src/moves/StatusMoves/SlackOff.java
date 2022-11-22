package moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

public class SlackOff extends StatusMove {
    int h;
    public SlackOff(int h) {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
       p.setMod(Stat.HP, h/2);
    }
    @Override
    protected java.lang.String describe() {
        return "использует атаку slack off";
    }
}
