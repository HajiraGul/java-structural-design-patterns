/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightpatterndemo;

/**
 *
 * @author PMYLS
 */
public class FlyWeightPatternDemo {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("A");
        flyweight1.operation("First Call");

        Flyweight flyweight2 = factory.getFlyweight("B");
        flyweight2.operation("Second Call");

        Flyweight flyweight3 = factory.getFlyweight("A");
        flyweight3.operation("Third Call");
    }

}
