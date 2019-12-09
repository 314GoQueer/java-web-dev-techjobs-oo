package org.launchcode.techjobs_oo.Tests;

import jdk.jfr.StackTrace;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job;
    //Job test_job = new Job();
    Job test_job2;
    Job new_job;
    Job new_job2;

    @Before
    public void createJobObject() {
        test_job = new Job();
        test_job2 = new Job();
        new_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        new_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }
    @Test
    public void testSettingJobId(){

        assertTrue(test_job.getId()+1 == test_job2.getId());
        assertEquals(test_job.getId(), test_job2.getId()-test_job.getId(), 1);
        assertFalse(test_job2.getId()<= test_job.getId());

}
    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals(new_job.getName(),"Product tester");
        assertEquals(new_job.getEmployer().getValue(),"ACME");
        assertEquals(new_job.getLocation().getValue(),"Desert");
        assertEquals(new_job.getPositionType().getValue(),"Quality control");
        assertEquals(new_job.getCoreCompetency().getValue(),"Persistence");
        assertEquals(new_job instanceof Job, true);
        assertTrue(new_job instanceof  Job);
        //System.out.println(new_job instanceof Job);
    }
    @Test
    public void testJobsForEquality(){
         assertEquals(new_job.equals(new_job2), false);
        //System.out.println(new_job.equals(new_job2)) ;       //System.out.println(new_job.getId());
    //System.out.println(new_job2.getId());
        ;
    }
    @Test
    public void testBlankLineWithToStringMethod(){
        assertEquals(new_job.toString().startsWith("\n"), true);
        assertEquals(new_job.toString().endsWith("\n"), true);
    }
    @Test
    public void testLabelsAndDataOnUniqueLines(){
       assertEquals(new_job.toString(),   "\n" +
               "id: 3\n" +
               "name: Product tester\n" +
               "employer: ACME\n" +
               "location: Desert\n" +
               "positionType: Quality control\n" +
               "coreCompetency: Persistence\n" + "\n" );


        System.out.println(new_job.toString());
    }
}
