import static org.junit.Assert.*;
import org.junit.Test;

/*
javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" SkillDemoOneTest.java SkillDemoOne.java
java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore SkillDemOneTest

 javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar SkillDemoOneTest.java SkillDemoOne.java
 java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore SkillDemoOneTest 

*/

public class SkillDemoOneTest {
    @Test
    public void subtractTest() {
        assertEquals(2,SkillDemoOne.subtract(2,4)) ;
    }
}

