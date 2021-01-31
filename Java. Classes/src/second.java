public class second
{
    public static void main(String[] args)
    {
        Student mass [] = new Student[10];

        Student st1 = new Student(1, "A", "A", "A", "01.01.2004",
                 "Minsk", 1337228, "IT", 1, 11 );
        Student st2 = new Student(2, "B", "B", "B", "02.02.2004",
                "Minsk", 1337228, "IT", 1, 11 );
        Student st3 = new Student(3, "C", "C", "C", "03.03.2004",
                "Minsk", 1337228, "NIT", 1, 12 );
        Student st4 = new Student(4, "D", "D", "D", "04.04.2004",
                "Minsk", 1337228, "IT", 1, 12 );
        Student st5 = new Student(5, "E", "E", "E", "05.05.2003",
                "Minsk", 1337228, "IT", 2, 21 );
        Student st6 = new Student(6, "F", "F", "F", "06.06.2003",
                "Minsk", 1337228, "NIT", 2, 21 );
        Student st7 = new Student(7, "G", "G", "G", "07.07.2003",
                "Minsk", 1337228, "IT", 2, 22 );
        Student st8 = new Student(8, "H", "H", "H", "08.08.2002",
                "Minsk", 1337228, "IT", 3, 31 );
        Student st9 = new Student(9, "I", "I", "I", "09.09.2002",
                "Minsk", 1337228, "NIT", 3, 31 );
        Student st10 = new Student(10, "J", "J", "J", "10.10.2001",
                "Minsk", 1337228, "IT", 4, 41 );

         mass[0] = st1;
         mass[1] = st2;
         mass[2] = st3;
         mass[3] = st4;
         mass[4] = st5;
         mass[5] = st6;
         mass[6] = st7;
         mass[7] = st8;
         mass[8] = st9;
         mass[9] = st10;

        System.out.println("All students: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i].toString());
        }

        String bufF = "IT"; //ука3ать факультет
        System.out.println("Task a) Students of " + bufF + " faculty: ");
        A( mass, bufF);
        int bufC = 1; //ука3ать курс
        System.out.println("Task b) Students of " + bufF + " faculty and " + bufC + " course: ");
        B( mass, bufF, bufC);
        int bufB = 2001;
        System.out.println("Task c): Students born after " + bufB +" year: ");
        C (mass, bufB);
        int bufG = 11;//ука3ать группу
        System.out.println("Task d) Students of " + bufG + " group: ");
        D( mass, bufG);

    }

    public static void A(Student[] mass, String faculty)
    {
        for (int i = 0; i < mass.length; i++) {
          if (mass[i].getFaculty() == faculty)
              System.out.println(mass[i].toString());
        }
    }

    public static void B(Student[] mass, String faculty, int course )
    {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].getFaculty() == faculty)
                if (mass[i].getCourse() == course)
                System.out.println(mass[i].toString());
        }
    }

    public static void C(Student[] mass, int bufB)
    {
        for (int i = 0; i < mass.length; i++) {
            StringBuffer strBuffer = new StringBuffer(mass[i].getBthDate() );
            String str  = strBuffer.substring(6);
            int year = 0;
            year = Integer.parseInt(str );
            if (year>bufB){
                System.out.println(mass[i].toString());
            }

        }

    }

    public static void D( Student[] mass, int group )
    {
        for (int i = 0; i < mass.length; i++) {
                    if (mass[i].getGroup() == group)
                    System.out.println(mass[i].toString());
        }
    }

}

