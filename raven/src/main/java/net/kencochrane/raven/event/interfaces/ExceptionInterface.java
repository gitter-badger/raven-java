package net.kencochrane.raven.event.interfaces;

public class ExceptionInterface implements SentryInterface {
    public static final String EXCEPTION_INTERFACE = "sentry.interfaces.Exception";
    private final Throwable throwable;

    public ExceptionInterface(Throwable throwable) {
        this.throwable = new ImmutableThrowable(throwable);
    }

    @Override
    public String getInterfaceName() {
        return EXCEPTION_INTERFACE;
    }

    public Throwable getThrowable() {
        return throwable;
    }
}
