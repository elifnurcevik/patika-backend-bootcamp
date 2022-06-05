package Task47;

public class FrequencyOfElementsInArray {
    public static void main(String[] args) {

        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

        int [] again  = new int[array.length];
        int index = -1;

        for(int i = 0; i < array.length; i++)
        {
            int count =1;
            for(int j = i+1; j < array.length; j++)
            {
                if(array[i] == array[j])
                {
                    count++;
                    again [j] = index;
                }
            }
            if(again [i] != index)
                again [i] = count;
        }

        for(int i = 0; i < again.length; i++)
        {
            if(again [i] != index)
                System.out.println("Number "+ array[i] +" repeated "+ again [i] + " times");
        }

    }
}
