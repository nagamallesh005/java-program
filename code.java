class car{
   
private String name;


public car(String name){
this.name = name;
}

public String getname(){
return name;
}

}

class Amazon{

  public static void main(String [] args){
            car c = new car("Bhavani");
    System.out.println(c.getname());


}

}
