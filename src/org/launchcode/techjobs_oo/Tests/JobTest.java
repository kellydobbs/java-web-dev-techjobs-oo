package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.util.Locale;

import static org.junit.Assert.*;

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
        assertEquals(1, test_job.getId(),0);
        assertEquals(2, test_job2.getId(),0);
        assertTrue(test_job.getId() + 1 ==  test_job2.getId());
        assertFalse(test_job.getId() == test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(3, test_job.getId(),0);

        assertTrue(test_job instanceof Job);
        assertTrue(test_job.getEmployer() instanceof Employer);
        assertTrue(test_job.getLocation() instanceof Location);
        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", test_job.getName());
        assertEquals("ACME", test_job.getEmployer().getValue());
        assertEquals("Desert", test_job.getLocation().getValue());
        assertEquals("Quality control", test_job.getPositionType().getValue());
        assertEquals("Persistence", test_job.getCoreCompetency().getValue());
    }


    @Test
    public void testJobsForEquality() {
        test_job= new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        test_job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));

        assertFalse(test_job.equals(test_job2));
    }

    Job test_job3;

    @Test
    public void testJobToStringMethod() {
        test_job = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        test_job2 = new Job("", new Employer(""), new Location(""), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        test_job3 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        assertEquals("\nID= 3\n" +
                "Name= Web Developer\n" +
                "Employer= LaunchCode\n" +
                "Location= St. Louis\n" +
                "Position Type= Front-end developer\n" +
                "Core Competency= JavaScript\n" , test_job.toString());

        assertEquals("\nID= 4\n" +
                "Name= Data not available\n" +
                "Employer= Data not available\n" +
                "Location= Data not available\n" +
                "Position Type= Front-end developer\n" +
                "Core Competency= JavaScript\n" , test_job2.toString());

        //  no job data
        assertEquals("OOPS! This job does not seem to exist.", test_job3.toString());


        }
}
