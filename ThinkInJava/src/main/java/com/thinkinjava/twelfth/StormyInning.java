package com.thinkinjava.twelfth;

public class StormyInning extends Inning implements Storm {

    public StormyInning() throws BaseballException, RainedOut {
    }

    public StormyInning(String s) throws BaseballException, Foul {
    }

    public void event() {
    }

    @Override
    public void atBat() throws PopFoul {

    }

    @Override
    public void rainHard() throws RainedOut {

    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut rainedOut) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic basebal exception");
        }


        try {
            Inning i = null;
            i = new StormyInning();
            i.atBat();
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (RainedOut rainedOut) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic basebal exception");
        }

    }
}

class BaseballException extends Exception {

}

class Foul extends BaseballException {

}

class Strike extends BaseballException {

}

abstract class Inning {
    public Inning() throws BaseballException {

    }

    public void event() throws BaseballException {

    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {

    }
}

class StormException extends Exception {

}

class RainedOut extends StormException {

}

class PopFoul extends Foul {

}

interface Storm {
    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;
}
