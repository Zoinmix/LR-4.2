public class Decoder {
    public static String decode(String word) {
        if (word.matches(".*\\d+.*")) {
            return vowelsMethodDecode(word);
        }
        return consonantsMethodDecode(word);
    }

    private static String vowelsMethodDecode(String word) {
        return word.chars()
                .mapToObj(symbol -> {
                    switch (symbol) {
                        case '1':
                            return 'a';
                        case '2':
                            return 'e';
                        case '3':
                            return 'i';
                        case '4':
                            return 'o';
                        case '5':
                            return 'u';
                        default:
                            return (char) symbol;
                    }
                })
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

    private static String consonantsMethodDecode(String word) {
        return word.chars().mapToObj(symbol -> {
            if ("bfjpv".contains(Character.toString(symbol))) {
                return (char) (symbol - 2);
            }
            if ("cdghklmnqrstwxyz".contains(Character.toString(symbol))) {
                return (char) (symbol - 1);
            }
            return (char) symbol;
        }).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
    }
}
