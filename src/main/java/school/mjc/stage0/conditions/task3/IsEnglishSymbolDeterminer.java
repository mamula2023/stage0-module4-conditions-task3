package school.mjc.stage0.conditions.task3;

import javax.annotation.processing.SupportedSourceVersion;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if(symbol >= 'a' && symbol <='z' || (symbol >='A' && symbol <='Z'))
            System.out.println("English");
        else
            System.out.println("Non English");

    }
}
