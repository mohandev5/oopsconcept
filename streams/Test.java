package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[]args){
       // Product p = new Product();
      ArrayList<Product> pr = new ArrayList<Product>();
      pr.add(new Product(1,"mobile",15000));
      pr.add(new Product(2,"bag",800));
      pr.add(new Product(3,"laptop",40000));
//      for(Product p:pr){
//          System.out.println(p.getId());
//          System.out.println(p.getName());
//          System.out.println(p.getPrice());
//
//      }

     //   List<Integer>pr2 =pr.stream().filter(p->p.price>5000).map(p-> p.price).collect(Collectors.toList());
//        List<String>pr2 = pr.stream().filter(p->p.price>5000).map(p->p.name).collect(Collectors.toList());
//        System.out.println(pr2);
        pr.stream().filter(p->p.price>5000).forEach(p-> System.out.println(p.name));
        int price1 = pr.stream().collect(Collectors.summingInt(p-> p.price));
        System.out.println(price1);
    }

}