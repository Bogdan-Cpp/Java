public class WordUpper {

    public static String wordUpper(String text){
        String word = "";
        for(int i = 0; i < text.length(); i++){

            if(i % 2 == 0){

                word += Character.toUpperCase(text.charAt(i));
            }

            else{

                word += text.charAt(i);
            }

            if(text.charAt(i) == ' '){

                word += text.charAt(i);
            }
        }
        return word;
    }

    public static void main(String[] args){

      String text = "java este un limbaj fain!";
      String word = wordUpper(text);
      System.out.println(word);
    }
}
