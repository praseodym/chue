package ch.wisv.chue;

import ch.wisv.chue.hue.HueFacade;
import ch.wisv.chue.hue.HueLamp;

import java.util.Set;

/**
 * Hue command interface
 */
public interface HueCommand {

    /**
     * Executes the command on the provided lamps via the provided facade.
     *
     * @param hueFacade the Hue facade
     * @param lamps     the set of lamps
     */
    void execute(HueFacade hueFacade, Set<HueLamp> lamps);
}
