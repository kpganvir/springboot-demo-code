package com.example.mongodemo.mongodb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoSamples {

	public static void main(String[] args) {
		List < String > fruits = new ArrayList < String > ();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        
       // fruits.stream().sorted().forEach(System.out::println);
     
        
     //   fruits.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
       // fruits.stream().sorted((x,y)->x.compareTo(y))
     //   .forEach(System.out::println);
        
        List < Employee > employees = new ArrayList < Employee > ();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "John", 29, 350000));
        employees.add(new Employee(30, "Tom", 30, 450000));
        employees.add(new Employee(40, "Pramod", 29, 500000));
        
      //  
      //  employees.stream().sorted((x,y)->(int)(x.getSalary()-y.getSalary())).forEach(System.out::println);
    
        
       // employees.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed())
      //  .limit(2).forEach(System.out::println);
        
        
        employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed())
        .limit(1).forEach(System.out::println);
        
        String str = "geeksforgeeks";
        char c = 'e';
        int count=0;
        
        char[] strArray = str.toCharArray();
       for( char ch : strArray)
       {
    	   System.out.println(" char "+ch +" is ="+ str.chars().filter(s->s==ch).count()+" times");
    	   
       }
   //     System.out.println(count(str, c));
       System.out.println("------------------------------------------");   
   	 List<Integer> numbersList = Arrays.asList(new Integer[]{1,2,1,3,4,4,4});    
 	
 	 numbersList.stream().filter(i -> Collections.frequency(numbersList, i) >1)
      .collect(Collectors.toSet())
      .forEach(System.out::println);
        
        
 	Integer val=Stream.of(1,2,3,4,5,6,7,8,9).reduce(Integer::sum);
	}
	
	 public static long count(String s, char ch)
	    {
	  
	       return s.chars().filter(c->c==ch).count();
	       
	    }
	  

}
 class Employee {
    private int id;
    private String name;
    private int age;
    private long salary;
    public Employee(int id, String name, int age, long salary) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}
