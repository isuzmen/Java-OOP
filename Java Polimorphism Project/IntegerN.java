//An integer class that implements the IAritmetic interface and inherits from the RationalN class
public class IntegerN extends RationalN implements IAritmetic{
  private int par2;
  //defines a constructor method for integers
  //@param par2 is the field of the class
  public IntegerN(int par2){
    super(par2,1);
    this.par2 = par2;
  }
  // is the method that allows you to get the par2 field.
  //@return returns par2 value
  public int getPar2(){
    return par2;
  }
  //It is the method that performs the collection with object parameters.
  //@param object parameter t
  //@param object parameter k
  //@return to get the real and imaginary parts of the complex number, its equivalent in the toString method is returned
  public static String add(ComplexN t, ComplexN k){
    double temp1 = t.getRealPart() + k.getRealPart();
    RealN temp = new RealN(temp1);
    return temp.toString();
  }
  //It is the method that performs the subtraction with object parameters.
  //@param object parameter t
  //@param object parameter k
  //@return to get the real and imaginary parts of the complex number, its equivalent in the toString method is returned
  public static String substract(ComplexN t, ComplexN k){
    double temp1 = t.getRealPart() - k.getRealPart();
    RealN temp = new RealN(temp1);
    return temp.toString();
  }
  //It is a method that performs multiplication with object parameters.
  //@param object parameter t
  //@param object parameter k
  //@return to get the real and imaginary parts of the complex number, its equivalent in the toString method is returned
  public static String multiply(ComplexN t, ComplexN k){
    double temp1 = t.getRealPart() * k.getRealPart();
    RealN temp = new RealN(temp1);
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
  //@return It is the method that allows us to return the par2 value in string form.
  public String toString(){
    return getPar2()+"";
  }
  @Override
  //compares two objects and puts a value
  //@param parameter takes object named o
  //@return Returns the corresponding boolean value based on whether the objects are equal
  public boolean equals(Object o){
     if(o instanceof IntegerN){
       IntegerN r = (IntegerN)o;
       return(this.toString().equals(r.toString()));
  }
   return false;
  }
}