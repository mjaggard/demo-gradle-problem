import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.lang.instrument.ClassFileTransformer;
import java.lang.reflect.Field;
import java.net.URL;
import java.security.ProtectionDomain;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;

@Slf4j
public class LoggingTransformer implements ClassFileTransformer {

    @SneakyThrows
    public LoggingTransformer() {
    }

    @SneakyThrows
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
                            ProtectionDomain protectionDomain, byte[] classfileBuffer) {
        log.info("Here");
        return null;
    }
}
