package com.decorator.icecream.decorator;

import com.decorator.icecream.Icecream;

/*
 * CaramelDecorator is a concrete class implementing the abstract decorator.
 *  When the decorator is created the base instance is passed using the constructor
 *  and is assigned to the super class.
 *
 */
public class CaramelDecorator extends IcecreamDecorator {

    /*
     * The below constructor internally calls its parent (IcecreamDecorator)
     * constructor using super
     */
    public CaramelDecorator(final Icecream icecream) {
        super(icecream);
    }

    /*
     * In the makeIcecream method we call the base method followed by its own
     * method addCaramel(). (non-Javadoc) Here is where, we are changing the
     * existing behavior of the Icecream by adding Caramel. This is done at
     * runtime.
     *
     * @see com.decorator.icecream.Icecream#makeIcecream()
     */
    @Override
    public String makeIcecream() {
        return this.icecream.makeIcecream() + addCaramel();
    }

    /*
     * This addCaramel() extends the behavior and add its own decoration.
     */
    private String addCaramel() {
        return " + with Caramel";
    }

    @Override
    public double cost() {
        return this.icecream.cost() + 2.0;
    }
}
