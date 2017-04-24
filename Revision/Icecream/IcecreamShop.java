package com.decorator.icecream;

import com.decorator.icecream.decorator.BerriesDecorator;
import com.decorator.icecream.decorator.CaramelDecorator;
import com.decorator.icecream.decorator.FruitsDecorator;
import com.decorator.icecream.decorator.NutsDecorator;

/*
 * This class calls the respective gets the input and estimates the total cost of the icecreams ordered
 */
public class IcecreamShop {

    public static void main(final String[] args) {

        /*
         * Icecream vanilla =
         * IcecreamFactory.getIcecream(IcecreamType.VANILLA.name());
         * vanilla.makeIcecream(); System.out.println(vanilla.makeIcecream());
         *
         * String vanillaIcecreamWithNuts = new
         * NutsDecorator(vanilla).makeIcecream(); System.out.println("\n'" +
         * vanillaIcecreamWithNuts + "' is prepared using NutDecorator");
         *
         * String vanillaIcecreamWithCaramel = new
         * CaramelDecorator(vanilla).makeIcecream(); System.out.println("\n'" +
         * vanillaIcecreamWithCaramel + "' is prepared using CaramelDecorator");
         *
         * String vanillaIcecreamWithNutsandFruits = new NutsDecorator(new
         * FruitsDecorator(vanilla)).makeIcecream(); System.out.println("\n'" +
         * vanillaIcecreamWithNutsandFruits +
         * "' is prepared using NutsDecorator and FruitsDecorator");
         */

        double totalCost = 0;
        // 1. Strawberry ice cream with frutis and caramel
        Icecream strawberryIcecream = IcecreamFactory.getIcecream(IcecreamType.STRAWBERRY.name());
        // Decorating with Fruits and Caramel and find the cost
        String icecreamContent = new CaramelDecorator(new FruitsDecorator(strawberryIcecream)).makeIcecream();
        double cost = new CaramelDecorator(new FruitsDecorator(strawberryIcecream)).cost();
        System.out.println("\n'" + icecreamContent + "' --> cost " + cost);
        totalCost = totalCost + cost;

        // 2. Vanilla ice cream with Nuts
        Icecream vanillaIcecream = IcecreamFactory.getIcecream(IcecreamType.VANILLA.name());
        // Decorating with Nuts and find the cost
        icecreamContent = new NutsDecorator(vanillaIcecream).makeIcecream();
        cost = new NutsDecorator(vanillaIcecream).cost();
        System.out.println("\n'" + icecreamContent + "' --> cost " + cost);
        totalCost = totalCost + cost;

        // 3. Chocolate ice cream with Berries and Nuts
        Icecream chocolateIcecream = IcecreamFactory.getIcecream(IcecreamType.CHOCOLATE.name());
        // Decorating with Berries & Nuts and find the cost
        icecreamContent = new NutsDecorator(new BerriesDecorator(chocolateIcecream)).makeIcecream();
        cost = new NutsDecorator(new BerriesDecorator(chocolateIcecream)).cost();
        System.out.println("\n'" + icecreamContent + "' --> cost " + cost);
        totalCost = totalCost + cost;

        System.out.println("\n' YOUR TOTAL BILL ' -->  " + totalCost);
    }

}
