package com.tit.week04.day06.reflection.advancedlevel.dependencyinjection;

public class Client {
    @Inject
    private ServiceA serviceA;

    @Inject
    private ServiceB serviceB;

    public void doWork() {
        serviceA.serve();
        serviceB.serve();
    }

    public ServiceA getServiceA() {
        return serviceA;
    }

    public ServiceB getServiceB() {
        return serviceB;
    }
}
