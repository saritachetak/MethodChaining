package academy.learningPrograming;

 public class MethodStringChaining {
     public static void main(String[] args) {
         String start = "  Java  ";
         System.out.println(start);
         String trimmed = start.trim();
         System.out.println(trimmed);
         String lowerCase = trimmed.toLowerCase();
         System.out.println(lowerCase);
         String result = lowerCase.replace('j', 'J');
         System.out.println(result);

         String anotherResult = " Java ".trim().toLowerCase().replace('j', 'J');
         System.out.println(anotherResult);


     }
 }
