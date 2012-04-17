package engine;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import phys.PhysShape;

/**
 *
 * @author Benjamin Kahlau, Berthold Wiblishauser
 */
public class PhysEngine {

	private Map<String, Double> globalPar = new HashMap<String, Double>();
	private Map<String, PhysShape> physShapes = new HashMap<String, PhysShape>();
	
    public void setGlobalParameter(String key, Double value) {
    	
    }

    public boolean addShape(PhysShape shape) {
    	Boolean ret = !physShapes.containsKey(shape.getName());
        if(physShapes.containsKey(shape.getName())) {physShapes.put(shape.getName(), shape);}
    	return ret;
    }

    //TODO Liste mit Shapes mit nummern? Key, Value?
    public PhysShape getShape(String name) {
        return physShapes.get(name);
    }
    //Warte auf Parser
    public List<PhysShape> loadWerteDatei(File file) {
        return new LinkedList<PhysShape>();
    }

    public void step(Double deltatime) {
    }
}
