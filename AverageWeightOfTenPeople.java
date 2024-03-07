package javaassignmentcompined;
import java.util.*;;

public class AverageWeightOfTenPeople{
    public static void main(String[] args) {
        ArrayList<Float> weightOfTenPeople = new ArrayList<>();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<10;i++){
            System.out.println("Enter the " + (i+1) +" th persons weight ");
            weightOfTenPeople.add(sc.nextFloat());  
        }
        System.out.println(findAverage(weightOfTenPeople));
    }
    static float findAverage(ArrayList<Float>weightOfTenPeople){
        float totalWeight = 0;
        for(float weight : weightOfTenPeople){
            totalWeight += weight;
        }
        float average = totalWeight/weightOfTenPeople.size();
        return average;
    }
}