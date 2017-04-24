package com.decorator.icecream.decorator;

import com.decorator.icecream.Icecream;

/*
 * BerriesDecorator is a concrete class implementing the abstract decorator.
 *  When the decorator is created the base instance is passed using the constructor
 *  and is assigned to the super class.
 *
 */
public class BerriesDecorator extends IcecreamDecorator {

    /*
     * The below constructor internally calls its parent (IcecreamDecorator)
     * constructor using super
     */
    public BerriesDecorator(final Icecream icecream) {
        super(icecream);
    }

    /*
     * In the makeIcecream method we call the base method followed by its own
     * method addBerries(). (non-Javadoc) Here is where, we are changing the
     * existing behavior of the Icecream by adding Berries. This is done at
     * runtime.
     *
     * @see com.decorator.icecream.Icecream#makeIcecream()
     */
    @Override
    public String makeIcecream() {
        return this.icecream.makeIcecream() + addBerries();
    }

    /*
     * This addBerries() extends the behavior and add its own decoration.
     */
    private String addBerries() {
        return " + with Berries";
    }

    @Override
    public double cost() {
        return this.icecream.cost() + 1.5;
    }
}
