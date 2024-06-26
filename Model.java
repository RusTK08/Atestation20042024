import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Model implements Proverka{
public String [] s4;
public String f;
public Model(String f, String [] s4) {
    this.f = f;
    this.s4 = s4;
    testerNamePol(s4);
    testerDate(s4);
    testerPhone(s4);
    
    
    writer(f, s4);
    
}
//public String
public void writer(String f, String [] s4){
    if(s4.length == 6){
        try (FileWriter fw = new FileWriter(f, true)) {  ///СЛЫШАЛ ЧТО ЗДЕСЬ ТАКЖЕ МОЖНО И НЕ СОЗДАВАТЬ ФАЙЛ ЯКОБЫ ОН СОЗДАСТЬСЯ ПО УМОЛЧАНИЮ ЕСЛИ ЕГО НЕТ С ПОМОЩЬЮ:(FileWriter fw = new FileWriter(res, false)) 
            fw.write(Arrays.toString(s4) + "\n");   // МОЖЕШЬ ПРОСТО ЗАПИСЫЫВАТЬ СТРОКУ СНОВА ИЛИ ОСТАВИТЬ ТАК
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    else {throw new RuntimeException("Введено недостаточное количество данных");}
}
    @Override
    public void testerPhone(String [] s4){
        boolean isOnlyDigits = true;
            for(int j = 0; j < s4[4].length() && isOnlyDigits; j++) {
                if(!Character.isDigit(s4[4].charAt(j))) {
                    isOnlyDigits = false;
                    throw new RuntimeException("Номер введен некорректно");
                }
            }   
            
    }
    @Override
    public void testerDate(String [] s4){
        boolean isOnlyDigits = true;
        if(s4[3].length() == 10){
            for(int i = 0; i < s4[3].length() && isOnlyDigits; i++) {
                if(Character.isLetter(s4[3].charAt(i))) { //    является ли не цифрой, символом
                    isOnlyDigits = false;    
                    if (i != 2 || i != 5) {
                        throw new RuntimeException("Неверный формат даты или некорректный ввод");} 
                        }
                    }
        }
        else {throw new RuntimeException("Дата введена не полностью или в неправильном формате");}
        
    }
    @Override
    public void testerNamePol(String [] s4){
        boolean isOnlyDigits = true;
        for (int i = 0; i < s4.length - 3; i++) {
            for (int j = 0; j < s4[i].length(); j++) {
                if(Character.isLetter(s4[i].charAt(j))){
                    isOnlyDigits = true;
                    }
                else throw new RuntimeException("ФИО введено некорректно");
            }
        }
        if("f".equalsIgnoreCase(s4[5]) || "m".equalsIgnoreCase(s4[5])){
                    isOnlyDigits = true;
        }
        else throw new RuntimeException("Пол введён некорректно");
        
    }

}