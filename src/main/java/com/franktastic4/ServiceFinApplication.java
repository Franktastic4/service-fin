package com.franktastic4;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class service-finApplication extends Application<service-finConfiguration> {

    public static void main(final String[] args) throws Exception {
        new service-finApplication().run(args);
    }

    @Override
    public String getName() {
        return "service-fin";
    }

    @Override
    public void initialize(final Bootstrap<service-finConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final service-finConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
