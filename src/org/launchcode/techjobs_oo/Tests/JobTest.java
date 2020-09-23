package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

// tests work individually, but not when all run together
// I tired everything I can think of here!

public class JobTest {
    Job test_job;
    Job test_job2;


    @Before
    public void createEmptyJobs() {
       test_job = new Job();
       test_job2 = new Job();
 }

    @Test
    public void testSettingJobId() {
        assertTrue(test_job.getId() + 1 ==  test_job2.getId());
        assertTrue(test_job2.getId() - 1 ==  test_job.getId());
        assertFalse(test_job.getId() == test_job2.getId());
    }


    Job test_job3;
    Job test_job4;
    Job test_job5;
    Job test_job6;
    Job test_job7;
    Job test_job8;

    @Before
    public void createJobObjects() {
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job6 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        test_job7 = new Job("", new Employer(""), new Location(""), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        test_job8 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        assertTrue(test_job3 instanceof Job);
        assertTrue(test_job3.getEmployer() instanceof Employer);
        assertTrue(test_job3.getLocation() instanceof Location);
        assertTrue(test_job3.getPositionType() instanceof PositionType);
        assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer().getValue());
        assertEquals("Desert", test_job3.getLocation().getValue());
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        assertEquals("Persistence", test_job3.getCoreCompetency().getValue());

    }


    @Test
    public void testJobsForEquality() {
        assertFalse(test_job4.equals(test_job5));
    }


    @Test
    public void testJobToStringMethod() {
        assertEquals("\nID= 6\n" +
                "Name= Web Developer\n" +
                "Employer= LaunchCode\n" +
                "Location= St. Louis\n" +
                "Position Type= Front-end developer\n" +
                "Core Competency= JavaScript\n" , test_job6.toString());

        assertEquals("\nID= 7\n" +
                "Name= Data not available\n" +
                "Employer= Data not available\n" +
                "Location= Data not available\n" +
                "Position Type= Front-end developer\n" +
                "Core Competency= JavaScript\n" , test_job7.toString());

        assertEquals("OOPS! This job does not seem to exist.", test_job8.toString());
        }
}
