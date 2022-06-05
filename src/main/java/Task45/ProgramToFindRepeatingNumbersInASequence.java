package Task45;

import java.util.Arrays;

public class ProgramToFindRepeatingNumbersInASequence {
    public static void main(String[] args)
    {
        int[] list={9,3,5,46,24,24,24,46,9,5,5,11,7};
        int[] dupl = new int[list.length];
        int indexInit=0;

        System.out.println(Arrays.toString(list));
        System.out.println();

        for(int i=0;i<list.length;i++)
        {
            for(int j=0;j<list.length;j++)
            {
                if((i!=j) && (list[i]==list[j]))
                {
                    if(!Detect(dupl,list[i]))
                        dupl[indexInit++]=list[i];
                    break;
                }
            }
        }

        for(int val: dupl)
        {
            if((val!=0) && (val%2==0))
                System.out.println(val);
        }

    }

    public static boolean Detect(int[] dizi, int deg)
    {
        for(int a:dizi)
        {
            if(a==deg)
                return true;
        }
        return false;
    }
}
