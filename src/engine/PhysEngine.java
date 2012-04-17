package engine;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import phys.PhysShape;

/**
 *
 * @author Benjamin Kahlau, Berthold Wiblishauser
 */
public class PhysEngine {

    public void setGlobalParameter(String key, Double value) {
    }

    public boolean addShape(PhysShape shape) {
        return false;
    }

    //TODO Liste mit Shapes mit nummern? Key, Value?
    public PhysShape getShape(String name) {
        return null;
    }
    //Warte auf Parser
    public List<PhysShape> loadWerteDatei(File file) {
        return new LinkedList<PhysShape>();
    }

    public void step(Double deltatime) {
    }
}
