import java.util.*;
public class HangMan {
    public static void main(String args[])
    {
        System.out.println("--------------------------------------welcome to Hangman------------------------------------!!");
        System.out.println("Objectives: ");
        System.out.println("1--> The goal of Hangman is for a player to guess a hidden word by suggesting letters within a certain");
        System.out.println("2--> number of attempts. The game is traditionally played with pencil and paper, but can also be");
        System.out.println("3--> implemented as a computer game.");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------guess the word----------------------------------------");

        Scanner s=new Scanner(System.in);
        int lives=10;
        Words w=new Words();
        String hiddenWord=w.choosenWord();
        char[] charArray=new char[hiddenWord.length()];
        for(int i=0;i<hiddenWord.length();i++)
        {
            charArray[i]='_';
        }

        while(lives>0)
        {
            for(int i=0;i<charArray.length;i++)
            {
                System.out.print(charArray[i]);
            }
            System.out.println();
            System.out.print("enter the alphabet: ");
            char alphabet=s.next().charAt(0);
            if(!containsAlphabet(hiddenWord, alphabet)) lives--;
            if(containsChar(charArray, alphabet))
            {
                System.out.println("The alphabet is already guessed :) ");
                continue;
            }
            boardUpdater(charArray, alphabet,hiddenWord);
            System.out.println("---------------------------------number of lives Left= "+lives+" --------------------------");
            if(wordGuessed(charArray, hiddenWord))
            {
                System.out.println("cogratulations you have guessed the word <3<3");
                break;
            }
        }
        if(lives==0)
        {
            System.out.println("-------------------------------------------------------game over!---------------------------------------------------");
            System.out.println("---------------------------------------------------the word was: " + hiddenWord + " -----------------------------");
        }
        s.nextLine();
        s.nextLine();
        s.close();
    }

    public static void boardUpdater(char[] charArray,char alphabet, String hiddenWord)
    {
        for(int i=0;i<hiddenWord.length();i++)
        {
            if(hiddenWord.charAt(i)==alphabet) 
            {
                charArray[i]=alphabet;
            }
        }
    }

    public static boolean wordGuessed(char[] charArray,String hiddenWord)
    {
        for(int i=0;i<hiddenWord.length();i++)
        {
            if(hiddenWord.charAt(i)!=charArray[i]) return false;
        }
        return true;
    }

    public static boolean containsChar(char[] charArray,char alphabet)
    {
        for(int i=0;i<charArray.length;i++)
        {
            if(charArray[i]==alphabet) return true;
        }
        return false;
    }

    public static boolean containsAlphabet(String hiddenWord,char alphabet)
    {
        for(int i=0;i<hiddenWord.length();i++)
        {
           if(hiddenWord.charAt(i)==alphabet)return true;
        }
        return false;
    }
}


class Words
{
    private final List<String> dictionary = new ArrayList<>(List.of(
            // words starting with 'a'
            "apple", "ant", "astronaut", "aardvark", "albatross", "anchor", "arrow", "ambulance", "artist", "archer",
            "almond", "apartment", "apology", "army", "avocado", "axe", "armadillo", "amphibian", "apricot", "adventure",

            // words starting with 'b'
            "banana", "bear", "balloon", "butterfly", "boat", "bottle", "basket", "button", "buffalo", "bridge",
            "book", "battery", "bicycle", "blender", "branch", "beetle", "brick", "broccoli", "bowl", "bracelet",

            // words starting with 'c'
            "cat", "car", "castle", "cucumber", "crab", "candle", "camera", "coffee", "chocolate", "cloud",
            "clock", "calculator", "cheetah", "cup", "couch", "crown", "canyon", "cactus", "calendar", "chicken",

            // words starting with 'd'
            "dog", "duck", "dolphin", "dragon", "diamond", "drum", "drawer", "desert", "doctor", "dance",
            "donkey", "desk", "dice", "daisy", "diary", "dinner", "dish", "dream", "doll", "dinosaur",

            // words starting with 'e'
            "elephant", "eagle", "ear", "engine", "envelope", "eggplant", "energy", "engine", "escalator", "envelope",
            "experiment", "excavator", "exercise", "exit", "exhibit", "explorer", "eel", "echo", "emerald", "earthquake",

            // words starting with 'f'
            "fish", "frog", "fox", "flamingo", "feather", "flower", "fountain", "flag", "forest", "fire",
            "fan", "fence", "ferris", "falcon", "fruit", "friend", "fabric", "football", "fork", "flashlight",

            // words starting with 'g'
            "giraffe", "gorilla", "guitar", "garden", "glove", "grapes", "gold", "game", "goat", "garage",
            "gate", "gown", "galaxy", "glacier", "goblin", "gem", "glider", "giant", "grass", "goggles",

            // words starting with 'h'
            "house", "horse", "helicopter", "hamburger", "hat", "hawk", "hedgehog", "helmet", "hand", "hammer",
            "honey", "heart", "hose", "harbor", "hydrant", "harp", "hero", "hotel", "helmet", "hedge",

            // words starting with 'i'
            "igloo", "island", "ice", "insect", "iron", "idea", "instrument", "ink", "iceberg", "ivy",
            "internet", "invention", "invitation", "icicle", "illusion", "impact", "incense", "item", "illustration", "injury",

            // words starting with 'j'
            "jelly", "jaguar", "jungle", "jacket", "jellyfish", "jar", "jet", "jeep", "jigsaw", "jumper",
            "jewelry", "journal", "juice", "jukebox", "juggler", "journey", "joystick", "joke", "journey", "jazz",

            // words starting with 'k'
            "kite", "kangaroo", "key", "king", "kettle", "kitten", "knee", "knife", "kiwi", "keyboard",
            "ketchup", "kiss", "knight", "kitchen", "kangaroo", "kabob", "kettle", "kite", "knapsack", "kaleidoscope",

            // words starting with 'l'
            "lion", "lemon", "ladder", "lamp", "leaf", "lake", "lizard", "lighthouse", "lamb", "laptop",
            "library", "lava", "lobster", "lock", "lantern", "letter", "ladybug", "luggage", "lynx", "lollipop",

            // words starting with 'm'
            "monkey", "mountain", "moon", "mouse", "motorcycle", "milk", "mango", "mask", "mushroom", "map",
            "mirror", "mansion", "meadow", "marble", "magazine", "medal", "microscope", "melon", "mine", "magnet",

            // words starting with 'n'
            "nest", "nail", "notebook", "nose", "net", "nugget", "night", "necklace", "napkin", "needle",
            "nest", "notebook", "ninja", "nightmare", "nectar", "neighbor", "noodle", "newspaper", "neutron", "navy",

            // words starting with 'o'
            "orange", "owl", "ocean", "octopus", "oven", "ostrich", "onion", "oasis", "oil", "orbit",
            "organ", "omelet", "opal", "olive", "oven", "orca", "orchid", "oxygen", "overcoat", "opera"
        ));
        
        public String choosenWord()
        {
            Random random=new Random();
            int randomIndex=random.nextInt(dictionary.size());
            return dictionary.get(randomIndex);
        }

}


