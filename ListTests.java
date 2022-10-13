import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

class CheckString implements StringChecker{
    public boolean checkString(String s) {
        return s.length() > 5;
  
    }
  } 

public class ListTests {
    @Test
    public void testFilter(){
        List<String> input1 = new ArrayList<>();
        CheckString c = new CheckString();
        input1.add("apple");
        input1.add("banana");
        input1.add("pineapple");
        List<String> correctOutput1 = new ArrayList<>();
        correctOutput1.add("banana");
        correctOutput1.add("pineapple");
        ListExamples.filter(input1, c);
        System.out.print(input1);
        assertEquals(correctOutput1, input1); 

    }

    @Test
    public void testMerge(){
        List<String> input1 = new ArrayList<>();
        List<String> input2 = new ArrayList<>();
        input1.add("a"); input1.add("c"); input1.add("e");
        input2.add("b"); input2.add("d"); input2.add("f");
        List<String>correctOutput = new ArrayList<>();
        correctOutput.add("a"); correctOutput.add("b"); correctOutput.add("c");
        correctOutput.add("d"); correctOutput.add("e"); correctOutput.add("f");
        List<String> result = ListExamples.merge(input1, input2);
        System.out.print(result);
        assertEquals(correctOutput, result);
    }
}
