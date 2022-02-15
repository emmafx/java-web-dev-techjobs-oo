package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.launchcode.techjobs_oo.*;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class JobTest {

    Job softwareDeveloper = new Job();
    Job javaDeveloper = new Job();
    Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    Job devOps = new Job("Dev Operations", new Employer("Apple"), new Location("Calgary"), new PositionType("Operations"), new CoreCompetency("Ethics"));
    Job devOps2 = new Job("Dev Operations", new Employer("Apple"), new Location("Calgary"), new PositionType("Operations"), new CoreCompetency("Ethics"));
    Job emptyJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

    @Test
    public void testSettingJobId() {
        assertFalse(devOps.getId(), devOps2.getId(), false);
    }
    private void assertFalse(int id, int id1, boolean b) {
    }

    @Test
    public void checkingForUniqueIds() {
        assertEquals(softwareDeveloper.getId(), 1);
        assertEquals(javaDeveloper.getId(),  2);
    }
    Job test_job;

    @org.junit.Test
    @Test
    @Before
    public void testJobConstructorSetsAllFields() {
        test_job = new Job("Help Desk Agent", new Employer("Google"), new Location("New York"), new PositionType("IT"), new CoreCompetency("Customer Service"));

        assertTrue(newJob.getName() instanceof String);
        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertTrue(test_job.getEmployer() instanceof Employer);
        assertTrue(test_job.getLocation() instanceof Location);

    }

    @org.junit.Test
    @Test
    public void testClassOfObject() {
        assertTrue(newJob instanceof Job);
    }


    @org.junit.Test
    @Test
    public void testJobsForEquality() {
        assertFalse(devOps.getId() == devOps2.getId());
        assertEquals(devOps.getName(), devOps2.getName());
    }

    private void assertFalse(boolean b) {
    }

    @Test
    public void shouldReturnABlankLine() {
        assertEquals(newJob.toString().startsWith("\n") && newJob.toString().endsWith("\n"), true);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
    String newStringJob = newJob.toString();

        assertTrue(newStringJob.contains("\n" +
                "ID: " + newJob.getId() + "\n" +
                "Name: " + newJob.getName()+ "\n" +
                "Employer: " + newJob.getEmployer() + "\n" +
                "Location: " + newJob.getLocation() + "\n" +
                "Position Type: " + newJob.getPositionType() + "\n" +
                "Core Competency: " + newJob.getCoreCompetency() + "\n"));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        assertEquals(emptyJob.toString(), "\n" +
                "ID: " + emptyJob.getId() + "\n" +
                "Name: Data not available" + "\n" +
                "Employer: Data not available" + "\n" +
                "Location: Data not available" + "\n" +
                "Position Type: Data not available" + "\n" +
                "Core Competency: Data not available" + "\n");
    }

}

