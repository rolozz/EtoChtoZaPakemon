public class Text {

    private String scanner;

    public Text(String scanner) {
        this.scanner = scanner;
    }

    public String getScanner() {
        return scanner;
    }

    public void setScanner(String scanner) {
        this.scanner = scanner;
    }

    @Override
    public String toString() {
        return "Text{" +
                "scanner='" + scanner + '\'' +
                '}';
    }
}
