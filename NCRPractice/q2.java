import java.util.Scanner;

public class q2 {
    public static void main (String[]args)
    {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt ();
        for (int i = 0; i < t; i++)
        {
            String s1 = s.next ();
            int j = 1, k = 0, l = s1.length (), max = 0, len = 0;
            int lps[] = new int[l];
            while (j < l)
            {
                if (s1.charAt (j) == s1.charAt (len))
                {
                    len++;
                    lps[j] = len;
                    j++;
                }
                else
                {
                    if (len != 0)
                    {
                        len = lps[len - 1];
                    }
                    else
                    {
                        lps[j] = 0;
                        j++;
                    }
                }
            }

            System.out.println (lps[l - 1]);
        }
    }
}
