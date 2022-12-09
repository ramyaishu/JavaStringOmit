import org.testng.annotations.Test;

public class JavaProgram2
{
    public String stringReplace(String str) {
       /* final int length = str.length();
        StringBuffer sb = new StringBuffer(str);
        for(int i=0;i<length;i++)
        {
            if((str.charAt(i)=='i' && str.charAt(i+1)=='s') && !Character.isLetter(str.charAt(i+2)))
            {
               sb.insert(i,"not") ;
            }
        }
        final String str1 =sb.toString();
        System.out.println(str1);
        return str1 ;*/
        final int times = str.length();

        final StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < times; i++) {
            if ((str.charAt(i) == 'i') && (str.charAt(i + 1) == 's')
                    && !Character.isLetter(str.charAt(i + 2))) {
                sb.insert(i, "not");

            }
        }
            final String str1 = sb.toString();
        System.out.println(str1);
            return str1;



    }
    @Test
    public void testCase1()
    {
        //This is One Approach
        String text = "This is a test. It is"; // note the 'is' at the end.
        String text2 = text.replaceAll("\\bis\\b", "is not");
        System.out.println(text +" => "+text2);
        //Another Approach
        //String str = "is this";
       // String result = stringReplace(str);
    }
}
