package functions;

import java.util.function.Function;

public class UpperCaser implements Function<String, String> {

    public String apply(String name) {
        try {
        	Thread.sleep(500);
        } catch (InterruptedException e) {
	}
        return name.toUpperCase();
    }
}
