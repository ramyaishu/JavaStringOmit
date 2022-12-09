import org.testng.Assert;
import org.testng.annotations.Test;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

public class JavaProgram6 {

    public List<String> moreY(List<String> strings) {
        strings.replaceAll(n -> "y" + n + "y");
        System.out.println(strings);
        return strings;
    }

    @Test
    public void testCase1()
    {
       List<String> list = new ArrayList<>();
       list.add("a");
       list.add("b");
       list.add("c");
       List<String> result = moreY(list);
        Assert.assertEquals(result,"[yay, yby, ycy]");
    }

    @Test
    public void testCase2()
    {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");

        List<String> result = moreY(list);
        Assert.assertEquals(result,"[yhelloy, yjavay]");
    }

}
