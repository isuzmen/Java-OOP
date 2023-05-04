//A rational number class that implements the IAritmetic interface and inherits from the RealN class
public class RationalN extends RealN implements IAritmetic{
  private int par4;
  private int par5;
  //defines a constructor method for rational numbers
  //@param par4 is the field of the class
  //@param par5 is the field of the class
  public RationalN(int par4,int par5){
    super((double)par4 / (double)par5);
    this.par4 = par4;
    this.par5 = par5;
  }
  //It is the method that allows us to get the numerator part of the field value.
  //@return returns par4 value
  public int getNumerator(){
    return par4;
  }
  //It is the method that allows us to take the denominator part of the field value.
  //@return returns par5 value
  public int getDenominator(){
    return par5;
  }
  @Override
  // It is a method that allows us to get the real part of a complex number.Rational numbers consist of real part numerator and denominator
  //@return returns the numerator / denominator
  public double getRealPart(){
    return (double)getNumerator() / (double)getDenominator();
    }
  //It is the method that performs the collection with object parameters.
  //@param object parameter t
  //@param object parameter k
  //@return to get the real and imaginary parts of the complex number, its equivalent in the toString method is returned
  public static String add(ComplexN t, ComplexN k){
    double temp1 = t.getRealPart();
    double temp2 = k.getRealPart();
    double temp3 = temp1+temp2;
    RealN temp = new RealN(temp3);
    return temp.toString();
  }
  //It is the method that performs the subtraction with object parameters.
  //@param object parameter t
  //@param object parameter k
  //@return to get the real and imaginary parts of the complex number, its equivalent in the toString method is returned
  public static String substract(ComplexN t, ComplexN k){
    double temp1 = t.getRealPart();
    double temp2 = k.getRealPart();
    double temp3 = temp1-temp2;
    RealN temp = new RealN(temp3);
    return temp.toString();
  }
  //It is a method that performs multiplication with object parameters.
  //@param object parameter t
  //@param object parameter k
  //@return to get the real and imaginary parts of the complex number, its equivalent in the toString method is returned
  public static String multiply(ComplexN t, ComplexN k){
    double temp1 = t.getRealPart();
    double temp2 = k.getRealPart();
    double temp3 = temp1*temp2;
    RealN temp = new RealN(temp3);
    return temp.toString();
  }
  //It is a method that performs division with object parameters.
  //@param object parameter t
  //@param object parameter k
  //@return to get the real and imaginary parts of the complex number, its equivalent in the toString method is returned
  public static String divide(ComplexN t, ComplexN k){
    double temp1 = t.getRealPart();
    double temp2 = k.getRealPart();
    double temp3 = temp1/temp2;
    RealN temp = new RealN(temp3);
    return temp.toString();
  }
  @Override
  //It is a method that finds the ebo and returns the related expression as a string according to the state of the numerator and denominator.
  //@return The corresponding expression is returned according to the states of the numerator and denominator.
    public String toString(){
    int x =1;
    for(int i = 1;i<=Math.abs(getNumerator())&&i<=Math.abs(getDenominator());i++){
           if(getNumerator()%i==0 && getDenominator()%i==0){
               x=i;
           } 
    }
    if(getNumerator()<0 && getDenominator()<0){
      return getNumerator()/x+ "/" + -1*(getDenominator()/x);
    }
    else if(getNumerator()<0){
      return getNumerator()/x+ "/" + getDenominator()/x;
  }
    else if(getDenominator()<0){
      return -1*(getNumerator()/x)+ "/"+ -1*(getDenominator()/x);
    }
    else{
          return getNumerator()/x + "/"+ getDenominator()/x;
    }
  }

  @Override
  //compares two objects and puts a value
  //@param parameter takes object named o
  //@return Returns the corresponding boolean value based on whether the objects are equal
  public boolean equals(Object o){
     if(o instanceof RationalN){
       RationalN r = (RationalN)o;
       return(this.toString().equals(r.toString()));
  }
   return false;
  }
 }
