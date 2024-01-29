import java.util.Random;
import java.util.Scanner;

public class RandomSentencesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Peter", "Nick","Sonya", "Jane" };
        String[] places = {"Sofia", "Varna", "Burgas", "Dobrich"};
        String[] verbs = {"eats", "sees", "seat on", "brings"};
        String[] nouns = {"bread", "sun", "stone", "tree"};
        String[] adverbs = {"slowly", "happily", "sadly", "warmly"};
        String[] details = {"at home", "near the river", "in garden", "at school"};

        System.out.println("This is your first random generator\nEnjoy it!");
        String enter = scanner.nextLine();
        while (enter.isEmpty()){
            String name = getWord(names);
            String place = getWord(places);
            String verb = getWord(verbs);
            String noun = getWord(nouns);
            String adverb = getWord(adverbs);
            String detail = getWord(details);

            System.out.printf("%s from %s %s %s %s %s.\n", name, place, verb, noun, adverb, detail);
            System.out.println("Click [Enter] to generate the next one.");

            enter = scanner.nextLine();

        }
    }

    public static String getWord(String[] words){
        Random random = new Random();
        int index = random.nextInt(words.length);
        String word = words[index];
        return word;
    }
}
