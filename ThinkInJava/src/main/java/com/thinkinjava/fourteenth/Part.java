package com.thinkinjava.fourteenth;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Part {


    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();

    static {
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
    }

    private static Random rand = new Random(47);

    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}

class Filter extends Part {}

class FuelFilter extends Filter {
    public static class Factory implements com.thinkinjava.fourteenth.Factory<FuelFilter>{

        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter {
    public static class Factory implements com.thinkinjava.fourteenth.Factory<AirFilter> {

        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter {
    public static class Factory implements com.thinkinjava.fourteenth.Factory<CabinAirFilter> {

        @Override
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter {
    public static class Factory implements com.thinkinjava.fourteenth.Factory<OilFilter> {

        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}

class Belt extends Part {}

class FanBelt extends Belt {
    public static class Factory implements com.thinkinjava.fourteenth.Factory<FanBelt> {

        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory implements com.thinkinjava.fourteenth.Factory<GeneratorBelt> {
        @Override
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}

class PowerSteeringBelt extends Belt {
    public static class Factory implements com.thinkinjava.fourteenth.Factory<PowerSteeringBelt> {
        @Override
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}