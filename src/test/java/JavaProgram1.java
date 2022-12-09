import org.testng.annotations.Test;

public class JavaProgram1
{
    public int maxCount(String str)
    {
        int length = str.length();
        int tempCount =0;
        int count=1;
        for (int i=0;i<str.length();i++)
        {
            if(length==0)
                return 0;
            if(i<length-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
            }
            else count=1;
            if(count>tempCount)
            {
                tempCount=count;
            }
        }

        System.out.println(tempCount);
        return tempCount;
    }

    @Test
    public void testCase1()
    {
        String str = "hoopla";
        maxCount(str);
    }
}
