import java.util.*;

   public class ZodiacInfo{
      public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         boolean loop = true;

      while(loop)
      {
         try
         {
            System.out.println("===========================================");
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.println("===========================================");
            System.out.print("Enter your birth year (Ex: 1990/2003): ");
            int birthYear = sc.nextInt();

            System.out.println("===========================================");
            System.out.print("Enter birth month (Ex: January, February...): ");
            sc.nextLine();
            String birthMonth = sc.nextLine();

            System.out.println("===========================================");
            System.out.print("Enter birth date (1-31): ");
            int birthDate = sc.nextInt();


            ZodiacPerson myZodiac = new ZodiacPerson(name, birthYear, birthMonth, birthDate);
            String zodiacSign = myZodiac.getZodiacSigns();
            int luckyNumber = myZodiac.luckyNumber();
            String luckyColor = myZodiac.getLuckyColor();

            System.out.println("===========================================");
            System.out.println("Zodiac Information: ");
            System.out.println("Name: " + myZodiac.getName());
            System.out.println("Birth Month: " + birthMonth);
            System.out.println("Birth Date: " + birthDate);
            System.out.println("Birth Year: " + myZodiac.getBirthYear());
            System.out.println("Zodiac Sign: Year of the " + myZodiac.getZodiacSigns());
            System.out.println("Lucky Number: " + myZodiac.luckyNumber());
            System.out.println("Lucky Color: " + myZodiac.getLuckyColor());
            System.out.println("You will meet your soulmate! Sana All! HAHAHAHAHAHA");

            System.out.println("===========================================");
            System.out.println("Do you want to enter another person's info? (yes/no): ");
            String choice = sc.next();

               if(choice.equalsIgnoreCase("no"))
               {
                  loop = false;
                  System.out.println("===========================================");
                  System.out.println("Okay, Goodbye!");
               } 
                  else
                  {
                     sc.nextLine();
                  }

            }  catch(Exception e)
               {
                  System.out.println("===========================================");
                  System.out.println("Invalid input. Please enter a valid number.");
                  sc.nextLine();
               }   
      }
      sc.close();      
   }
}

class person
{
   String name;
   int birthYear;
   String birthMonth;
   int birthDate;

   public person(String name, int birthYear, String birthMonth, int birthDate)
   {
      this.name = name;
      this.birthYear = birthYear;
      this.birthMonth = birthMonth;
      this.birthDate = birthDate;
   }
}


