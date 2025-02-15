/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightpatterndemo;

/**
 *
 * @author PMYLS
 */
public class ConcreteFlyweight implements Flyweight {
             private final String intrinsicState;

             public ConcreteFlyweight(String intrinsicState) {
                          this.intrinsicState = intrinsicState;
             }
             @Override
             public void operation(String extrinsicState) {
                          System.out.println("Intrinsic State: " + intrinsicState + 
                                                             ", Extrinsic State: " +extrinsicState);
              }
}
