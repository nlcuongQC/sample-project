package common.utilities;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataHelper {
    private final Faker  faker  = new Faker();
    private final Locale locale = new Locale("en");

    public static DataHelper getData() {
        return new DataHelper();
    }

    public String getFullname() {
        return faker.name().fullName();
    }

    public String getEmail() {
        return faker.numerify("mail######test######@mailinator.com");
    }

    public String getName() {
        return faker.numerify("at######");
    }

    public String getRandomNameWithPrefix(String prefix) {
        return faker.numerify(prefix + "######");
    }
}
