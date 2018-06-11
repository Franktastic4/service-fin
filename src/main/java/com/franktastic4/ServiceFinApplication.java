package com.franktastic4;

import com.hubspot.dropwizard.guice.GuiceBundle;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ServiceFinApplication extends Application<ServiceFinConfiguration> {

    public static void main(final String[] args) throws Exception { // Entry point
        new ServiceFinApplication().run(args);
    }

    @Override
    public String getName() {
        return "ServiceFin";
    }

    @Override
    public void initialize(final Bootstrap<ServiceFinConfiguration> bootstrap) { // Invoked by run
        GuiceBundle<ServiceFinConfiguration> guiceBundle = GuiceBundle.<ServiceFinConfiguration>newBuilder()
            .enableAutoConfig(getClass().getPackage().getName()) // Part of DW, will also register your resource with Jersey.
            .setConfigClass(ServiceFinConfiguration.class)
            .build();

        bootstrap.addBundle(guiceBundle); // TODO Tests must call JerseyGuiceUtils.reset();
    }

    @Override
    public void run(final ServiceFinConfiguration configuration, final Environment environment) {
    }

}
