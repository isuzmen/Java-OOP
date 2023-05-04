//Defines an interface called IAritmetic
public interface IAritmetic{
  //t and k parameters are field collection method on object type
  //@param parameter t
  //@param parameter k
  //@return returns a random string value. Since methods are defined as static, they must have a body.
  public static String add(ComplexN t, ComplexN k){return "0";}
  //t and k parameters are field extraction method in object type
  //@param parameter t
  //@param parameter k
  //@return returns a random string value. Since methods are defined as static, they must have a body.
  public static String substract(ComplexN t, ComplexN k){return "0";}
  //t and k parameters are field multiplication method on object type
  //@param parameter t
  //@param parameter k
  //@return returns a random string value. Since methods are defined as static, they must have a body.
  public static String multiply(ComplexN t, ComplexN k){return "0";}
  //The t and k parameters are field division method on object type
  //@param parameter t
  //@param parameter k
  //@return returns a random string value. Since methods are defined as static, they must have a body.
  public static String divide(ComplexN t, ComplexN k){return "0";}
}