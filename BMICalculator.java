package javaassignmentcompined;
import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> BMIListOfPersons  = new ArrayList<>();
        boolean loopRunner = true;
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        int count = 1;
        while(loopRunner){
            System.out.println("");
            System.out.println("Enter the "+count +" person's name : ");
            String name = sc.nextLine();
            System.out.println("Enter the "+ count + " Person's height in cm :" );

            float height = sc.nextFloat();
            System.out.println("Enter the "+ count++ + " Person's weight in kg:" );
            float weight = sc.nextFloat();

            float BMI = weight / ((height/100)*(height/100));

            String remark = "";
            if(BMI < 16)
                remark = "Severe Thinness";
            else if(BMI >= 16 && BMI <= 17)
                remark = "Moderate Thinness";
            else if(BMI >= 17 && BMI <= 18.5)
                remark = "Mild Thinness";
            else if(BMI >= 18.5 && BMI <= 25)
                remark = "Normal";
            else if(BMI >= 25 )
                remark = "OverWeight";
            

            System.out.println("If You want to add more details the press any number  else press any character :");
            char c = sc.next().charAt(0);
            sc.nextLine();

            ArrayList<String> list = new ArrayList<>();
            list.add(name);
            list.add(""+ BMI);
            list.add(remark);
            BMIListOfPersons.add(list);
            if(!(Character.isDigit(c))){
                loopRunner = false;
            }            
        }
        Collections.sort(BMIListOfPersons,new Comparator<ArrayList<String>>(){
            public int compare(ArrayList<String> one,ArrayList<String>two){
                return one.get(1).compareTo(two.get(1));
            }
        });

        for(ArrayList<String> a : BMIListOfPersons){
            System.out.println(a);
        }

    }
}
