public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        int length = name.length();
        long spaceCount = name.chars().filter(ch -> ch == ' ').count();
        boolean hasNoLeadingOrTrailingSpaces = name.equals(name.trim());

        return length >= 3 && length <= 19 && spaceCount == 1 && hasNoLeadingOrTrailingSpaces;
    }
}