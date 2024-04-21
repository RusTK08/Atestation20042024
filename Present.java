import java.util.Arrays;
import java.util.Scanner;

public class Present {
    Scanner scanner;
    public Present() {
        scanner = new Scanner(System.in);
        //FamilyNameYearPol();
        
        ///sss(FamilyNameYearPol());
        
        //print();
        
        
    }
    public String [] FamilyNameYearPol(){
        System.out.println("Введите ФИО через пробел, дату(11.03.1990), номер, пол");
        
        String [] scan = scanner.nextLine().split(" ");
        return scan;
    }
    public String sss(String [] s2){
        String s = Arrays.toString(s2);
        return s;
    }
//    public int menu(){
//     System.out.println("Нажмите 1 чтобы создать");
//     System.out.println("Нажмите 2 чтобы заполнить");
//     System.out.println("Нажмите 0 чтобы выйти из меню");
//     int sssss = scanner.nextInt();
//     return sssss;
//    }
        
   public String NameSpravochnik(){
    String nameSpravochnik = scanner.nextLine();
    return nameSpravochnik;
   } 

   @Override
   public String toString(){
    String s2 = sss(FamilyNameYearPol());
    return String.format("s2:%d", s2);
   }

    public void print(){
        System.out.println(sss(FamilyNameYearPol()));
    }


}
