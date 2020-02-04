

package mage.game.permanent.token;

import mage.constants.CardType;
import mage.constants.SubType;
import mage.MageInt;

/**
 *
 * @author TheElk801
 */
public final class IzoniInsectToken extends TokenImpl {

    public IzoniInsectToken() {
        super("Insect", "1/1 black and green Insect creature token");
        cardType.add(CardType.CREATURE);
        color.setBlack(true);
        color.setGreen(true);
        subtype.add(SubType.INSECT);
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    public IzoniInsectToken(final IzoniInsectToken token) {
        super(token);
    }

    public IzoniInsectToken copy() {
        return new IzoniInsectToken(this);
    }
}