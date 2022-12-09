import org.testng.annotations.Test;

public class JavaProgram4
{
    public int matchTwo(String[] a , String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            String temp1 = a[i];
            String temp2 = b[i];
            if(!temp1.equals("") && !temp2.equals(""))
            {
                if(temp1.charAt(0)==temp2.charAt(0))
                    count++;
            }
        }
        System.out.println(count);
        return count;
    }

    @Test
    public void testCase1()
    {
        String[] a = {"aa", "bb", "cc"};
        String[] b =  {"aaa", "b", "bb"};
        matchTwo(a,b);
    }

}
