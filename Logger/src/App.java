public class App {
    public static void main(String[] args) throws Exception {
        Logger loggerTest = new AsteriskLogger();
        loggerTest.Error("logger error");
        loggerTest.Log("logger log");

        Logger asteriskTest = new SpacedLogger();
        asteriskTest.Log("asterisk log");
        asteriskTest.Error("asterisk error");
    }
}
