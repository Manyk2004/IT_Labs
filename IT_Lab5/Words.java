import java.util.regex.*;

public class Words {
    public static void main(String[] args) {
        char letter = 'w';
        String text = "This function defines words that start with a given letter. I really hope it works well";
        try {
            String regex = "\\b" + letter + "\\w{4,}\\b";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(text);

            System.out.println("Words starts with " + letter + ":");
            while (matcher.find()){
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid pattern configure: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
