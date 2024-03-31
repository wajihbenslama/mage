package mage.filter.predicate.permanent;

import mage.filter.predicate.ObjectSourcePlayer;
import mage.filter.predicate.ObjectSourcePlayerPredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.watchers.common.SaddledMountWatcher;

/**
 * @author TheElk801
 */
public enum SaddledSourceThisTurnPredicate implements ObjectSourcePlayerPredicate<Permanent> {
    instance;

    @Override
    public boolean apply(ObjectSourcePlayer<Permanent> input, Game game) {
        return SaddledMountWatcher.checkIfSaddledThisTurn(
                input.getObject(), input.getSource().getSourcePermanentOrLKI(game), game
        );
    }

    @Override
    public String toString() {
        return "saddled {this} this turn";
    }
}
