package com.decorator.icecream.variety;

import com.decorator.icecream.Icecream;

/*
 * This class is the concrete implementation of Icecream type.
 * It implements all the methods of the interface.
 * The decorators will be added on the instance of this class at runtime
 */
public class ButterScotchIcecream implements Icecream {
    /*
     *
     * @see com.decorator.icecream.Icecream#makeIcecream()
     */
    @Override
    public String makeIcecream() {
        return "Butter Scotch Icecream ";
    }

    /*
     *
     * @see com.decorator.icecream.Icecream#cost()
     */
    @Override
    public double cost() {
        return 4.0;
    }

}
