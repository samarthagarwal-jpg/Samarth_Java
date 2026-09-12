public class Practiceset3 {
    public static void main(String[] args) {

        //1
        String name = "SAMARTH";
        System.out.println(name.toLowerCase());

        //2
        String sentence ="The name is Samarth Agarwal.";
        System.out.println(sentence.replace(' ', '_'));

        //3
        String a = "Dear <|name|>, Thanks a lot!";
        System.out.println(a.replace("<|name|>", "Samarth"));

        //4
        String b ="Hello  Everyone, My name   is Samarth.";
        System.out.println(b.indexOf("  "));
        System.out.println(b.indexOf("   "));

        //5
        String c="Dear Samarth,\nThis Java course is nice. \nThanks!";
        System.out.println(c);

        
    }
    
}
