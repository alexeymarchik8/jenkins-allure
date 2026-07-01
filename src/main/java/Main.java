public class Main {
    public static void main(String args[]) {
        Account account = new Account("Тимоти Шаламе");
        boolean isValid = account.checkNameToEmboss();
        System.out.println(isValid);
    }
}
