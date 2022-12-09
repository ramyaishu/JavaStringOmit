import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaProgram5
{
    public int largestOfTwo(int[] a)
    {
        int largest=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i] % 10 == 0 && a[i]>largest)
            {
                largest=a[i];
            }

        }
        System.out.println(largest);
        return largest;
    }
    @Test
    public void testCase1()
    {
        int a[] = {12, 10, 4};
        int b[] =  {2, 20, 30};

        int result =  largestOfTwo(a) +  largestOfTwo(b);
        System.out.println(result);
        Assert.assertEquals(result,40);
    }

}
