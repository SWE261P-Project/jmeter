package org.apache.jmeter.threads;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThreadGroupTests {
    @Test
    public void testThreadGroupCreation() {
        org.apache.jmeter.threads.ThreadGroup tg = new org.apache.jmeter.threads.ThreadGroup();
        assertNotNull(tg, "ThreadGroup should be created successfully");
    }

    @Test
    public void testSchedulerDefaults() {
        org.apache.jmeter.threads.ThreadGroup tg = new org.apache.jmeter.threads.ThreadGroup();
        assertFalse(tg.getScheduler(), "Scheduler should be false by default");
    }
}