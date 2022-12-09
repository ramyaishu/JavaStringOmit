import org.testng.annotations.Test;

public class JavaProgram3
{
    public boolean twoTrue(int[] str)
    {
        boolean found = false;
        for (int i=0;i<str.length;i++)
        {
            if(str[i] == 2 && i>0 && str[i-1]==2)
                found=true;
            if(str[i]==2 && i<str.length-1 && str[i+1]==2)
                found=true;

        }
        System.out.println(found);
        return found;
    }
    @Test
    public void testCase1()
    {
        int[] str = {1,2,2,3};
        twoTrue(str);
    }
}
