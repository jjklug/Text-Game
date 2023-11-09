package Entities.Openables;

import Entities.Openable;
import Entities.Opener;
import Entities.Valuables.Jewel;

public class TreasureChest extends Openable {
    public TreasureChest(){
        super("treasure chest", true, new Jewel());
    }

    public void unlockWith(Opener pickup){
        super.setLocked(false);
    }
}