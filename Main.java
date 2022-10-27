import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static double getAverage(int values[])
    {
        int sum = 0;
        double ave = 0;

        int[] vals = new int[100];
        Random gen = new Random();
        for(int i = 0; i < vals.length; i++)
        {
            vals[i] = gen.nextInt(100) + 1;
            sum += vals[i];
            ave = sum / vals.length;
        }
        return ave;
    }



    public static void main(String[] args)

    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        int sum = 0;
        double ave = 0;
        int[] dataPoints = new int[100];

        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        for(int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " ");
        }

        for(int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }
        System.out.println("\nThe sum of all of the values in the array are " + sum);

        ave = (double)sum / dataPoints.length;
        System.out.println("The average of the array is " + ave);

        int num1 = SafeInput.getRangedInt(in, "Enter a number", 1, 100);

        boolean found = false;
        int counter = 0;
        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == num1)
            {
                counter++;
                found = true;
            }
        }
        if(!found)
        {
            System.out.println("Value is not in the array!");
        }
        else
        {
            System.out.println("Your number came up " + counter + " times in the array.");
        }

        int num2 = SafeInput.getRangedInt(in, "Enter a number", 1, 100);
        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == num1)
            {
                System.out.println("First found at " + i);
                found = true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Value is not in the array!");
        }

        int min = 0;
        int max = 0;

        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] < min) // NEW MIN!
                min = dataPoints[i];  // SO SAVE IT
            if(dataPoints[i] > max) // NEW MIN!
                max = dataPoints[i];  // SO SAVE IT
        }
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
}