package com.decorator.icecream.decorator;

import com.decorator.icecream.Icecream;

/*
 * NutsDecorator is a concrete class implementing the abstract decorator.
 *  When the decorator is created the base instance is passed using the constructor
 *  and is assigned to the super class.
 *
 */
public class NutsDecorator extends IcecreamDecorator {

    /*
     * The below constructor internally calls its parent (IcecreamDecorator)
     * constructor using super
     */
    public NutsDecorator(final Icecream icecream) {
        super(icecream);
    }

    /*
     * In the makeIcecream method we call the base method followed by its own
     * method addNuts(). (non-Javadoc) Here is where, we are changing the
     * existing behavior of the Icecream by adding nuts. This is done at
     * runtime.
     *
     * @see com.decorator.icecream.Icecream#makeIcecream()
     */
    @Override
    public String makeIcecream() {
        return this.icecream.makeIcecream() + addNuts();
    }

    /*
     * This addNuts() extends the behavior and adds its own decoration.
     */
    private String addNuts() {
        return "+ with Nuts";
    }

    @Override
    public double cost() {
        return this.icecream.cost() + 1.0;
    }
}
