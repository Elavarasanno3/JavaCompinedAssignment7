package javaassignmentcompined;

public class IfElseStatementsWithVariables {
    int instanceVariable = 2;
    static int staticVariable = 3;
    public static void main(String[] args) {
        int localVariableInsideMethod = 5;
        if(true){
            int localVariableInsideMethodAndInsideIfBlock = 6;

            /// POSSIBLE CASES : 
            System.out.println("localVariableInsideMethodAndInsideIfBlock :" + localVariableInsideMethodAndInsideIfBlock);
            System.out.println("localVariableInsideMethod :"+localVariableInsideMethod);

            // instance variable only available if we created object
            IfElseStatementsWithVariables obj = new IfElseStatementsWithVariables();
            System.out.println("instangeVariable :"+ obj.instanceVariable); 

            System.out.println("staticVariable :" + staticVariable);
        }
        //System.out.println(localVariableInsideMethodAndInsideIfBlock); error because that variable only accessable inside that block.
 
    }
}
