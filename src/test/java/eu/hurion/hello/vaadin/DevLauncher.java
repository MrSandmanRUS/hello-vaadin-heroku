package eu.hurion.hello.vaadin;

import eu.hurion.hello.vaadin.application.HelloHerokuApplication;

import static eu.hurion.vaadin.heroku.VaadinForHeroku.localServer;

public class DevLauncher {
    public static void main(final String[] args) {
        localServer(HelloHerokuApplication.class).start();
    }
}
