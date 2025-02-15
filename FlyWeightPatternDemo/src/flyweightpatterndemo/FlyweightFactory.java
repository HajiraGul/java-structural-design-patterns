/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightpatterndemo;

/**
 *
 * @author PMYLS
 */
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private final Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteFlyweight(key));
        }
        return flyweights.get(key);
    }
}

