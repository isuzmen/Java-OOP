//A natural number class that implements the IAritmetic interface and inherits from the IntegerN class
public class NaturalN extends IntegerN implements IAritmetic{
  private int par1;
  //defines a constructor method for natural numbers
  //@param par1 is the field of the class
  public NaturalN(int par1){
    super(par1);
    this.par1 = par1;
  }
  // is the method that allows you to get the par1 field.
  //@return returns par4 value
  public int getPar1(){
    return par1;
  }
  //It is the method that performs the collection with object parameters.
  //@param object parameter t
  //@param object parameter k
  //@return to get the real and imaginary parts of the complex number, its equivalent in the toString method is returned
  public static String add(ComplexN t, ComplexN k){
    int temp1 = (int)t.getRealPart() + (int)k.getRealPart();
    NaturalN temp = new NaturalN(temp1);
    return temp.toString();
  }
  //It is the method that performs the subtraction with object parameters.
  //@param object parameter t
  //@param object parameter k
  //@return to get the real and imaginary parts of the complex number, its equivalent in the toString method is returned
  public static String substract(ComplexN t, ComplexN k){
    int temp1 = (int)t.getRealPart() - (int)k.getRealPart();
    NaturalN temp = new NaturalN(temp1);
    return temp.toString();
  }
  //It is a method that performs multiplication with object parameters.
  //@param object parameter t
  //@param object parameter k
  //@return to get the real and imaginary parts of the complex number, its equivalent in the toString method is returned
  public static String multiply(ComplexN t, ComplexN k){
    int temp1 = (int)t.getRealPart() * (int)k.getRealPart();
    NaturalN temp = new NaturalN(temp1);
    return temp.toString();
  }
  //It is a method that performs division with object parameters.
  //@param object parameter t
  //@param object parameter k
  //@return to get the real and imaginary parts of the complex number, its equivalent in the toString method is returned
  public static String divide(ComplexN t, ComplexN k){
    double temp1 = t.getRealPart() / k.getRealPart();
    RealN temp = new RealN(temp1);
    return temp.toString();
  }
  @Override
  //It is the method that allows us to print the field value we receive as a string.
  //@return It is the method that allows us to return the par1 value in string form.
  public String toString(){
    return getPar1()+"";
  }
  @Override
  //compares two objects and puts a value
  //@param parameter takes object named o
  //@return Returns the corresponding boolean value based on whether the objects are equal
  public boolean equals(Object o){
     if(o instanceof NaturalN){
       NaturalN r = (NaturalN)o;
       return(this.toString().equals(r.toString()));
  }
   return false;
  }
}