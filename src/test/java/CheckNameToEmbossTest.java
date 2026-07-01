import org.junit.Assert;
import org.junit.Test;

public class CheckNameToEmbossTest {

    @Test
    public void checkNameToEmbossName3CharsTrue() {
        String name = "Ю Фу";
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertTrue(actualResult);
    }

    @Test
    public void checkNameToEmbossName19CharsTrue() {
        String name = "Дмитрий Александров";
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertTrue(actualResult);
    }

    @Test
    public void checkNameToEmbossNameLessThan3CharsTrue() {
        String name = "Ю ";
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertFalse(actualResult);
    }

    @Test
    public void checkNameToEmbossSpacesMoreThan1False() {
        String name = "Иван  Иванов";
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertFalse(actualResult);
    }

    @Test
    public void checkNameToEmbossNameMoreThan19CharsFalse() {
        String name = "Александра Кузнецова";
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertFalse(actualResult);
    }

    @Test
    public void checkNameToEmbossWithoutSpaceFalse() {
        String name = "ИванИванов";
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertFalse(actualResult);
    }

    @Test
    public void checkNameToEmbossLeadingSpaceFalse() {
        String name = " ИванИванов";
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertFalse(actualResult);
    }

    @Test
    public void checkNameToEmbossTrailingSpaceFalse() {
        String name = "ИванИванов ";
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertFalse(actualResult);
    }

    @Test
    public void checkNameToEmbossLeadingAndTrailingSpaceFalse() {
        String name = " Иван Иванов ";
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertFalse(actualResult);
    }

    @Test
    public void checkNameToEmbossEmptyNameFalse() {
        String name = "";
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertFalse(actualResult);
    }

    @Test
    public void checkNameToEmbossNameIs3SpacesFalse() {
        String name = "   ";
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertFalse(actualResult);
    }

    @Test
    public void checkNameToEmbossNameIsNullFalse() {
        boolean actualResult = true;
        Assert.assertFalse(actualResult);
    }
}
