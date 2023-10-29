package Entities.Openables;

import Entities.Openable;
import Entities.Opener;
import Entities.Pickup;
import Entities.Wieldables.Sword;

public class WarChest extends Openable {
    public WarChest(){

        super("war chest", true, new Sword());
    }

    public void unlockWith(Opener pickup){
        super.setLocked(false);
    }
}
