class ZodiacPerson extends person
{
   public ZodiacPerson(String name, int birthYear, String birthMonth, int birthDate)
   {
        super(name, birthYear, birthMonth, birthDate);
   }

   public String getName() 
   {
     return name;
   }

   public int getBirthYear()
   {
     return birthYear;
   }

   public String getZodiacSigns()
   {
        String[] zodiacSigns = {"Monkey", "Rooster", "Pig", "Rabbit", "Dragon", "Tiger", "Ox", "Rat", "Snake", "Horse", "Goat"};
        return zodiacSigns[(birthYear - 1900) % 12];
   }

   public int luckyNumber()
   {
     return (birthYear % 10) * 10000 + 69420;
   }

   public String getLuckyColor()
   {
     String zodiacSign = getZodiacSigns();
     String luckyColor;

     if(zodiacSign.equals("Monkey") || zodiacSign.equals("Dragon") || zodiacSign.equals("Rat"))
     {
          luckyColor = "Sky - Black";
     } 

     else if(zodiacSign.equals("Tiger") || zodiacSign.equals("Snake") || zodiacSign.equals("Horse"))
     {
          luckyColor = "Black - Pink";
     }

     else
     {
          luckyColor = "Unknown lucky color!";     
     }

     return luckyColor;
   }
}