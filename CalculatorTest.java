class Calculator{
public int add(int a, int b){
    return a+b;
}
public int sub(int a, int b){
    return a-b;
}
}
public class CalculatorTest{
    public static void main(String[] args){
    Calculator calc = new Calculator();
   System.out.println("Result:"+ calc.add(2, 3));
   System.out.println("Result:"+calc.sub(3, 4));
}
}