public class TextModifierService {

    TextService textService;

    public TextModifierService(TextService textService){

        this.textService=textService;

    }

    public void textModifier(Text text) {

        System.out.println(textService.resultSum
                (textService.resultPlus
                        (textService.resultMinus
                                (textService.resultDelimiter(text.getScanner())))));

    }

}
