package day05.junittesting.basicjunit.performancetimeout;
import com.tit.week04.day05.junit.basicjunit.performancetimeout.PerformanceTimeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

public class PerformanceTimeoutTesting {
    private final PerformanceTimeout timeout = new PerformanceTimeout();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimesOut() throws InterruptedException {
        timeout.longRunningTask(); // Expected to exceed the timeout
    }
}
