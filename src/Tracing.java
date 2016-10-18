import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * A driver to demonstrate tracing.
 *
 *  This is a simple program to demonstrate tracing a multiclass program.
 *
 * @author Brad Dennis
 * @version  10/16/2016
 * Modified: --
 */
public class Tracing {

    public static void main(String[] args) {
        StringReplacer percentReplacer = new Tracing().new StringReplacer('%');
        StringReplacer poundReplacer = new Tracing().new StringReplacer('#');

        System.out.println(percentReplacer.replace("The % brown fox ", "quick"));
        System.out.println(poundReplacer.replace("jumped over the # dog.", "lazy"));
    }

    private class StringReplacer {
        private char marker = 'X';

        /**
         * A StringReplacer can't be instantiated with passing in a marker.
         * @param marker the replacement marker to use.
         */
        public StringReplacer(char marker) {
            this.marker = marker;
        }

        /**
         * Replaces instances of the marker in a give string.
         * @param target the target string to make the replacements in.
         * @return the modified string.
         */
        public String replace(String target, String replacement) {
            String solution = "";

            for (int i = 0; i < target.length(); i++) {
                if (target.charAt(i) == marker) {
                    solution += replacement;
                } else {
                    solution += target.charAt(i);
                }
            }
            return solution;
        }
    }
}

