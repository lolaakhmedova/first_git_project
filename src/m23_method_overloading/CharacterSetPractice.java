package m23_method_overloading;

public class CharacterSetPractice {
            static void main() {
                System.out.println(getCharacterSet('7', 'P'));
                System.out.println(getCharacterSet("special"));


            }

            public static String getCharacterSet(char start, char end){
                String result = "";

                for (char c = start; c <= end; c++) {
                    result += c;
                }
                return result;
            }
            public static String getCharacterSet( String group) {
                if (group == "uppercase") {
                    return "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                } else if (group == "lowercase") {
                    return "abcdefghijklmnopqrstuvwxyz";
                } else if (group == "digit") {
                    return "0123456789";
                } else if (group == "special") {
                    return "!\"#$%&'()*+,-.";
                }

                return "";



            }
}
