package org.acme.controllers;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;
import org.acme.services.TitleService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Quarkus.run(MyApp.class, args);
    }

    public static class MyApp implements QuarkusApplication {
        @Inject
        TitleService titleService;

        @Override
        public int run(String... args) throws Exception {
            List<String> carmeggedon = titleService.animation(100, "carmeggedon");
            for (String s : carmeggedon) {
                System.out.println(s);
            }
            Quarkus.waitForExit();
            return 0;
        }
    }
}
