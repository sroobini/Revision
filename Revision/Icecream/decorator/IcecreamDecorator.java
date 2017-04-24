package com.decorator.icecream.decorator;

import com.decorator.icecream.Icecream;

/*
 * The IcecreamDecorator is the core component of the decorator design pattern.
 * This excellent flexibility and changing the behavior of an instance of our choice at runtime is
 * the main advantage of the decorator design pattern.
 *
 * This is an abstract class which means this class cannot be instantiated.
 * - new IcecreamDecorator() will give a compilation error.
 * - This class contains the aggregation relationship.
 *
 * [Aggregation is a special case of association. A directional association between objects.
 * When an object ‘has-a’ another object, then you have got an aggregation between them.
 * Direction between them specified which object contains the other object.
 * Aggregation is also called a “Has-a” relationship.]
 *
 * For more info on the difference between Aggregation and Composition
 * refer the below link : http://javapapers.com/oops/association-aggregation-composition-abstraction-generalization-realization-dependency/
 *
 */
public abstract class IcecreamDecorator implements Icecream {

    /*
     * The Icecream interface type declaration below forms the aggregation
     * relationship between IcecreamDecorator and the interface it (Icecream)
     * implements
     */
    protected Icecream icecream;

    /*
     * The constructor of this class assigns the interface type instance to
     * icecream attribute (declare above in line 29). This class is the Base
     * decorator class. 
     */
    public IcecreamDecorator(final Icecream icecream) {
        this.icecream = icecream;
    }

}
