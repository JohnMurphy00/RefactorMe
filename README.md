

### Refactor Me

I was given 4 java based tasks to complete in a skeleton code. These tasks were;

- To gain knoledge of someones age through a user input.
```java
    public static void getName(){
        Scanner in = new Scanner(System.in);
        System.out.println("Your age is: ");
        String Name = in.nextLine();
        System.out.println("Your age is: " + Name);
    }
```


- To find someones salary with already preset numbers.
 ```java
 public static void calculateSalary(int income, int tax) {
        // Salary = income - tax
        System.out.println("Your salary is: " + (income - tax));
    }
 ```
 
- To tell someone the number of sides their shape has based on a preset input.
```java
public static void calculateSides(String shape) {
        // this method should detect for
        // 1 square
        // 2 circle
        // 3 hexagon
        // 4 dodecagon
       
        if (shape.contains("square")) {
            System.out.println("Your shape has 4 sides");
        }
        
        if (shape.contains("circle")){
            System.out.println("Your shape has 1 side");
        }
        
        if (shape.contains("hexagon")){
            System.out.println("Your shape has 6 sides");
        }
        
        if(shape.contains("dodecagon")){
            System.out.println("Your shape has 12 sides");
        }
    }
```

- To tell someone the number of letters in any given word.
```java
public static void countLetters() {


        //String word = 
        Scanner inn = new Scanner (System.in);
        System.out.println("What is your word? ");
        String word = inn.nextLine();
        System.out.println("You entered: " + word );

        System.out.println("You word is: " + word.length() + " letters long.");
```

This is a link to my code;  
https://github.com/JohnMurphy00/RefactorMe/blob/master/RefactorMe.java