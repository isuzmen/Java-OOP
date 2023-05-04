//A real number class that implements the IAritmetic interface and inherits from the ComplexN class
public class RealN extends ComplexN implements IAritmetic{
  private double par3;
  //defines a constructor method for real numbers
  //@param par3 is the field of the class
  public RealN(double par3){
    super(par3,0);
    this.par3 = par3;
  }
  // is the method that allows you to get the par3 field.
  //@return returns par3 value
  public double getPar3(){
    return par3;
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
  //@return It is the method that allows us to return the par3 value in string form.
  public String toString(){
    return Double.toString(getPar3());
  }
  @Override
  //compares two objects and puts a value
  //@param parameter takes object named o
  //@return Returns the corresponding boolean value based on whether the objects are equal
  public boolean equals(Object o){
     if(o instanceof RealN){
       RealN r = (RealN)o;
       return(this.toString().equals(r.toString()));
  }
   return false;
  }
}