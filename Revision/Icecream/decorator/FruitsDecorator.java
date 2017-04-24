package com.decorator.icecream.decorator;

import com.decorator.icecream.Icecream;

/*
 * FruitsDecorator is a concrete class implementing the abstract decorator.
 *  When the decorator is created the base instance is passed using the constructor
 *  and is assigned to the super class.
 *
 */
public class FruitsDecorator extends IcecreamDecorator {

    /*
     * The below constructor internally calls its parent (IcecreamDecorator)
     * constructor using super
     */
    public FruitsDecorator(final Icecream icecream) {
        super(icecream);
    }

    /*
     * In the makeIcecream method we call the base method followed by its own
     * method addFruits(). (non-Javadoc) Here is where, we are changing the
     * existing behavior of the Icecream by adding fruits. This is done at
     * runtime.
     *
     * @see com.decorator.icecream.Icecream#makeIcecream()
     */
    @Override
    public String makeIcecream() {
        return this.icecream.makeIcecream() + addFruits();
    }

    /*
     * This addFruits() extends the behavior and adds its own decoration.
     */
    private String addFruits() {
        return "+ with Fruits";
    }

    @Override
    public double cost() {
        return this.icecream.cost() + 2.0;
    }

}
