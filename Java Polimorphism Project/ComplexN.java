//A complex number class that implements the IAritmetic interface
public class ComplexN implements IAritmetic{
  private double par6;
  private double par7;
  //defines a constructor method for complex numbers
  //@param par6 is the field of the class
  //@param par7 is the field of the class
  public ComplexN(double par6,double par7){
    this.par6 = par6;
    this.par7 = par7;
  }
  //is a method that takes the real part of complex numbers
  //@return par6 returns value
  public double getRealPart(){
    return par6;
  }
  //is a method that takes the imaginary part of complex numbers
  //@return par7 returns value
  public double getImaginaryPart(){
    return par7;
  }
  //It is the method that performs the collection with object parameters.
  //@param object parameter t
  //@param object parameter k
  //@return to get the real and imaginary parts of the complex number, its equivalent in the toString method is returned
  public static String add(ComplexN t,ComplexN k){
    double temp1 = t.getRealPart() + k.getRealPart();
    double temp2 = t.getImaginaryPart() + k.getImaginaryPart();
    ComplexN temp = new ComplexN(temp1,temp2);
    return temp.toString();
  }
  //It is the method that performs the subtraction with object parameters.
  //@param object parameter t
  //@param object parameter k
  //@return to get the real and imaginary parts of the complex number, its equivalent in the toString method is returned
  public static String substract(ComplexN t,ComplexN k){
    double temp1 = t.getRealPart() - k.getRealPart();
    double temp2 = t.getImaginaryPart() - k.getImaginaryPart();
    ComplexN temp = new ComplexN(temp1,temp2);
    return temp.toString();
  }
  //It is a method that performs multiplication with object parameters.
  //@param object parameter t
  //@param object parameter k
  //@return to get the real and imaginary parts of the complex number, its equivalent in the toString method is returned
  public static String multiply(ComplexN t,ComplexN k){
    double temp1 = t.getRealPart() * k.getRealPart();
    double temp2 = t.getRealPart() * k.getImaginaryPart();
    double temp3 = t.getImaginaryPart()* k.getRealPart();
    double temp4 = -1.0*(t.getImaginaryPart()* k.getImaginaryPart());
    double tempx = temp1+temp4;
    double tempy = temp2+temp3;
    ComplexN temp = new ComplexN(tempx,tempy);
    return temp.toString();
  }
  //It is a method that performs division with object parameters.
  //@param object parameter t
  //@param object parameter k
  //@return to get the real and imaginary parts of the complex number, its equivalent in the toString method is returned
  public static String divide(ComplexN t,ComplexN k){
    double temp1 = (k.getRealPart()*t.getRealPart()) + -1.0*(t.getImaginaryPart()*(-1.0*(k.getImaginaryPart())));
    double temp2 = (t.getImaginaryPart()*k.getRealPart()) + ((-1.0*(t.getRealPart()))*k.getImaginaryPart());
    double temp3 = (k.getRealPart()*k.getRealPart())+-1.0*((-1.0*(k.getImaginaryPart()))*k.getImaginaryPart());
    double temp4 = temp1 / temp3;
    double temp5 = temp2 / temp3;
    ComplexN temp = new ComplexN(temp4,temp5);
    return temp.toString();
    
  }
  @Override
  //It is a method for printing complex numbers as a+bi.
  //@return The corresponding expression is returned according to the status of the getRealPart() and getImaginaryPart() functions
  public String toString(){
    
    if(getRealPart() < 0 && getImaginaryPart()>0){
      return "-"+(-1.0*getRealPart()) + "+" + getImaginaryPart() + "i";
    }
    else if(getImaginaryPart()<0 && getRealPart()>0){
      return getRealPart() + "-" + -1.0*getImaginaryPart()+ "i";
    }
    else if(getRealPart()<0 && getImaginaryPart()<0){
      return "-"+ (-1.0*getRealPart()) + "-" + (-1.0*getImaginaryPart())+ "i";
    }
    else if(getRealPart()<0 && getImaginaryPart()==0){
      return "-"+(-1.0*getRealPart())+"";
    }
    else if(getImaginaryPart()<0 && getRealPart()==0){
      return "-"+(-1.0*getImaginaryPart())+"i";
    }
    else if(getRealPart()>0 && getImaginaryPart()==0){
      return getRealPart()+"";
    }
    else if(getImaginaryPart()>0 && getRealPart()==0){
      return getImaginaryPart()+"i";
    }
    else 
       return getRealPart()+ "+" +getImaginaryPart() + "i";
  }
  @Override
  //compares two objects and puts a value
  //@param parameter takes object named o
  //@return Returns the corresponding boolean value based on whether the objects are equal
  public boolean equals(Object o){
     if(o instanceof ComplexN){
       ComplexN r = (ComplexN)o;
       return(this.toString().equals(r.toString()));
  }
   return false;
  }
}