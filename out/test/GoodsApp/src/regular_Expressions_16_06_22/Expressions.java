package regular_Expressions_16_06_22;

//Регулярные выражения
// это последовательность символов, формирующая шаблон поиска. Когда вы ищете данные в ТЕКСТЕ, вы можете использовать этот шаблон поиска, чтобы описать то, что вы ищете.
//Регулярные выражения можно использовать для выполнения всех типов <текстового поиска> и операций <замены текста> .
//Нужно импортировать java.util.regex пакет для работы с регулярными выражениями.
//     В пакет входят следующие классы:
// Pattern Class — определяет шаблон (для использования в поиске)
// Matcher Class - Используется для поиска шаблона
// PatternSyntaxException Class — указывает на синтаксическую ошибку в шаблоне регулярного выражения.

       //Пример
   //Узнайте, есть ли в предложении слово «w3schools»:
 import java.util.regex.Matcher;
 import java.util.regex.Pattern;
public class Expressions {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match found");
        }else {
            System.out.println("Match not  found");
        }
    }
}
