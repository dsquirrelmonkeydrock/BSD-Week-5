public class SpacedLogger implements Logger {

    @Override
    public void Log(String log) {
        System.out.println(spaceOutWord(log));
    }

    @Override
    public void Error(String error) {
        System.out.println("ERROR: " + spaceOutWord(error));
    }

    private String spaceOutWord(String word) {
        StringBuilder results = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            // do an if\else to make sure that there is not an extra space after the last
            // chacter of the given word
            if (i < word.length() - 1) {
                results.append(word.charAt(i));
                results.append(" ");
            } else {
                results.append(word.charAt(i));
            }
        }
        return results.toString();
    }

}
