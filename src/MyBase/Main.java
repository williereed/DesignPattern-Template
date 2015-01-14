package MyBase;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

public class Main {

    public static void main(String[] args) {

        PackageA packageA = new PackageA();
        PackageB packageB = new PackageB();

        packageA.performTrip();
        packageB.performTrip();
    }
}
