package src;

import java.util.Optional;

@FunctionalInterface
interface IAnimal {
    static String about = "Animals Interface";
    void action(String action);

    default String getName(String name) {
        return "animal " + name;
    }
    static String getInfo(){
        return IAnimal.about;
    }
}
class Product {
    String name;
    int id;
    String desc;

    public Product(String name, int id, String desc) {
        this.name = name;
        this.id = id;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
public class Java8features {
//    public static void main(String[] args) {
////        IAnimal animal = (action) -> System.out.println("Animal Action " + action);
////        animal.action("bark");
////        System.out.println(animal.getName("Dragon Rex" ));
////        System.out.println(IAnimal.getInfo());
//
//        String[] str = new String[5];
//
//        // Setting value for 2nd index
//        str[2] = "Geeks Classes are coming soon";
//
//        // It returns an empty instance of Optional class
//        Optional<String> empty = Optional.empty();
//        System.out.println(empty);
//
//        // It returns a non-empty Optional
//        Optional<String> value = Optional.of(str[2]);
//        System.out.println(value);
//        str[2] = "Geeks Classes are coming soon";
//
//        // It returns a non-empty Optional
//         value = Optional.of(str[2]);
//
//        // It returns value of an Optional.
//        // If value is not present, it throws
//        // an NoSuchElementException
//        System.out.println(value.get());
//
//        // It returns hashCode of the value
//        System.out.println(value.hashCode());
//
//        // It returns true if value is present,
//        // otherwise false
//        System.out.println(value.isPresent());
//        Product prod = null;
//        Product temp = new Product("apple",1,"apple inc product ");
//        Optional<Product> optionalProduct = Optional.of(temp);
//        System.out.println(optionalProduct.isPresent());
//
//        //Optional.ofNullable - allows passed parameter to be null.
//        Optional<Product> productOptional= Optional.ofNullable(prod);
//
//        System.out.println(productOptional.orElseGet(()->  optionalProduct.get()));
//
//        Product p1 = productOptional.orElse(new Product("", 0, ""));
//
//        System.out.println(p1);
//
//
//    }

    public static void main(String[] args) {
      int ans = fun (2,10);
        System.out.println(ans);
    }
   private static int fun(int x, int n ){
       System.out.println(n +"=== "+ x);
          if(n == 0 ) return 1;
          else if(n%2 == 0)
               return fun(x*x, n/2);
          else
              return x* fun(x*x, (n-1)/2);
   }
}