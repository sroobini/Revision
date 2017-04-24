package com.decorator.icecream;

import com.decorator.icecream.variety.ButterScotchIcecream;
import com.decorator.icecream.variety.ChocolateIcecream;
import com.decorator.icecream.variety.StrawberryIcecream;
import com.decorator.icecream.variety.VanillaIcecream;

/*
 * IcecreamFactory class creates and returns different types of Icecream based on the input String.
 *
 * This class is typical example of factory design pattern.
 *
 */
public class IcecreamFactory {

    /*
     *
     * This method If the input String doesnt match any of the ice cream name
     * then null is returned.
     *
     * @param - name of the Icecream
     *
     * @return - Instance of the icecream based upon the name.
     *
     * Note: All the instances returned by the below method are of type
     * Icecream. These instances are decided and returned at run time (based
     * upon the input when the program is executed)
     */
    public static Icecream getIcecream(final String name) {

        if (name == null) {
            return null;
        }
        if (IcecreamType.VANILLA.name().equalsIgnoreCase(name)) {
            return new VanillaIcecream();
        } else if (IcecreamType.STRAWBERRY.name().equalsIgnoreCase(name)) {
            return new StrawberryIcecream();
        } else if (IcecreamType.CHOCOLATE.name().equalsIgnoreCase(name)) {
            return new ChocolateIcecream();
        } else if (IcecreamType.BUTTERSCOTCH.name().equalsIgnoreCase(name)) {
            return new ButterScotchIcecream();
        }

        return null;
    }
}
