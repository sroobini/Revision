package com.decorator.icecream;

/*
 * The Icecream interface is the blueprint of what an Ice cream does.
 *
 * makeIcecream() - prints the make/name of the Ice cream.
 * cost() - returns the cost of the ice cream.
 * Any class that implements this interface must override the below two methods
 */
public interface Icecream {

    public String makeIcecream();

    public double cost();
}
