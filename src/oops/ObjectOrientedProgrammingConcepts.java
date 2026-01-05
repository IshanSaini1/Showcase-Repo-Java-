package oops;

import java.math.BigInteger;

// Encapsulation of logic using classes
public class ObjectOrientedProgrammingConcepts {
    public static void main(String[] args) {
        // Object - Object creation that defines the state of entities
        // Dynamic or Runtime Polymorphism
        Cat lion = new Lion();
        Cat tiger = new Tiger();
        System.out.println(String.format("The Lion say's %s while the Tiger said %s.", lion.getSound(), tiger.getSound()));
    }
}

/**
 * Abstraction of logic via interfaces and abstract classes.
 */
interface Animals{
    public String getSpeciesName();
    public String getSound();
    public BigInteger getPopulationInLakhs();
    public Boolean isEndangered();
}

/**
 * Encapsulation of logic and methods via classes
 */
class Cat implements Animals{

    @Override
    public String getSpeciesName() {
        return "Cat";
    }

    @Override
    public String getSound() {
        return "Meow";
    }

    @Override
    public BigInteger getPopulationInLakhs() {
        return BigInteger.valueOf(50000);
    }

    @Override
    public Boolean isEndangered() {
        return false;
    }
}

/**
 * Inheritance
 */
class Tiger extends Cat {
    @Override
    public String getSound(){
        return "Roar";
    }

    // Compile time polymorphism
    public String getSound(boolean isLoud){
        return (isLoud) ? "Roar !!!!!!!" : "Roar....";
    }
}

class Lion extends Cat{
    @Override
    public String getSound(){
        return "Growl";
    }
}