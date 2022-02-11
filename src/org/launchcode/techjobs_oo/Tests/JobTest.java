package org.launchcode.techjobs_oo.Tests;

import org.launchcode.techjobs_oo.*;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class JobTest {

    Job softwareDeveloper = new Job();
    Job javaDeveloper = new Job();
    Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    Job devOps = new Job("Dev Operations", new Employer("Apple"), new Location("Calgary"), new PositionType("Operations"), new CoreCompetency("Ethics"));
    Job devOps2 = new Job("Dev Operations", new Employer("Apple"), new Location("Calgary"), new PositionType("Operations"), new CoreCompetency("Ethics"));

    @Test
    public void testSettingJobId() {
        assertFalse(softwareDeveloper.getId(), javaDeveloper.getId(), false);
    }
    private void assertFalse(int id, int id1, boolean b) {
    }

    @Test
    public void checkingForUniqueIds() {
        assertEquals(softwareDeveloper.getId(), 1);
        assertEquals(javaDeveloper.getId(), 2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(newJob.getEmployer().toString(),"ACME");
        assertEquals(newJob.getLocation().toString(), "Desert");
        assertEquals(newJob.getPositionType().toString(), "Quality Control");
        assertEquals(newJob.getCoreCompetency().toString(), "Persistence");
        assertEquals(newJob.getName().toString(), "Product tester");
    }

    @Test
    public void testClassOfObject() {
        assertTrue(newJob instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(devOps.getId(), devOps2.getId(), false);
        assertEquals(devOps.getName(), devOps2.getName());
    }



}

