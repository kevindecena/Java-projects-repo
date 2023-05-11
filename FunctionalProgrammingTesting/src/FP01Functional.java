import java.util.List;


//practice exercises for functional programming/lambdas
public class FP01Functional {

    public static void main(String[] args) {

        //List<Integer> numbers= List.of(12,9,13,4,6,2,4,12,15);
        List<String> courses = List.of("Spring", "Spring Boot", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        //printCubesOfOddNumbers(numbers);
        printLengthOfCourses(courses);
    }


//    private static boolean isEven(int number){
//        return number%2==0;
//    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .forEach(System.out::println);//syntax for method reference
    }

    //number -> number%2 == 0
    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                //.filter(FP01Functional::isEven) //allow only even
                .filter(number -> number%2 == 0) //lambda expression
                .forEach(System.out::println); //syntax for method reference
    }



    private static void printEvenNumbersInListStructured(List<Integer> numbers){
        for (int number : numbers){
            if(number%2==0){
                System.out.println(number);
            }
        }
    }

    private static void printOddNumbersFunctional(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number%2!=0)
                .forEach(System.out::println);
    }

    private static void printCoursesIndividuallyFunctional(List<String> courses){
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printCoursesWithSpringFunctional(List<String> courses){
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printCoursesWithMoreThan4Length(List<String> courses){
        courses.stream()
                .filter(course -> course.length()>=4)
                .forEach(System.out::println);
    }

    private static void printSquaresOfEvenNumbers(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number%2==0)
                .map(number -> number*number)
                .forEach(System.out::println);
    }

    private static void printCubesOfOddNumbers(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number%2!=0)
                .map(number -> number*number*number)
                .forEach(System.out::println);
    }

    private static void printLengthOfCourses(List<String> courses){
        courses.stream()
                .map(course ->course.length())
                .forEach(System.out::println);
    }





}