import lombok.extern.slf4j.Slf4j;

import java.lang.instrument.Instrumentation;

@Slf4j
public class MainAgent {
    public static void premain(String agentArgs, Instrumentation inst) {
        log.info("[Agent] In premain method");
        inst.addTransformer(new LoggingTransformer(), false);
    }

    public static void agentmain(String agentArgs, Instrumentation inst) {
        log.info("[Agent] In agentmain method");
        inst.addTransformer(new LoggingTransformer(), false);
    }

    public static void main(String[] args) {
      System.out.println("Implementation is irrelevant");
    }
}
