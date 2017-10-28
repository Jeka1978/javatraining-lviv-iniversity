package mySpring;

import java.util.HashMap;
import java.util.Map;

public class JavaConfig implements Config {

    private Map<Class, Class> map = new HashMap<>();

    public JavaConfig() {
        map.put(Speaker.class, ConsoleSpeaker.class);
        map.put(Cleaner.class, CleanerImpl.class);
    }

    @Override
    public <T> Class<T> getImpl(Class<T> ifc) {
        return map.get(ifc);
    }
}
