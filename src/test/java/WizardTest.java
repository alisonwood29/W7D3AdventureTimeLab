import Players.MagicalPlayers.MythicalCreature;
import Players.MagicalPlayers.Spell;
import Players.MagicalPlayers.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Gandalf", Spell.FIREBALL, MythicalCreature.OGRE, 4);
    }

    @Test
    public void hasWisdom(){
        assertEquals(4, wizard.getWisdom());
    }
}
