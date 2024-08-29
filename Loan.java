import java.util.Scanner;

class Businessman{
  private float si;
  private float p;
  private float t;
  private float r;



  public void acceptInput(){
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the principal ");
  p = scan.nextFloat();
  System.out.println("Enter the tenure");
  t = scan.nextFloat(); 
   r = 15.2f;

  }

public void calcIntrest(){

si = (p*t*r)/100;
}

public void disp(){

System.out.println(si);
}

}



class Loan{
public static void main(String [] args){
         Businessman b1 = new Businessman();
           b1.acceptInput();
           b1.calcIntrest();
           b1.disp(); 

         Businessman b2 = new Businessman();
           b2.acceptInput();
           b2.calcIntrest();
           b2.disp(); 


}

}