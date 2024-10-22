public class WordUpper {

    public static String wordUpper(String text){
        StringBuilder word = new StringBuilder();
        for(int i = 0; i < text.length(); i++){
            if(i % 2 == 0){
                word.append(Character.toUpperCase(text.charAt(i)));
            }

            else{
                word.append(text.charAt(i));
            }

            if(text.charAt(i) == ' '){
                word.append(text.charAt(i));
            }
        }
        return word.toString();
    }

    public static void main(String[] args){
      String text = "java este un limbaj fain!";
      String word = wordUpper(text);
      System.out.println(word);
    }
}
