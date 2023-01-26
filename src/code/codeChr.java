package code;

/**
 *
 * @author davinky
 */
public class codeChr {
    public String encChr(char chr) {
        switch (chr) {
            case 'A':
                return "A0";
            case 'B':
                return "C0";
            case 'C':
                return "E0";
            case 'D':
                return "G0";
            case 'E':
                return "I0";
            case 'F':
                return "K0";
            case 'G':
                return "M0";
            case 'H':
                return "O0";
            case 'I':
                return "Q0";
            case 'J':
                return "S0";
            case 'K':
                return "U0";
            case 'L':
                return "W0";
            case 'M':
                return "Y0";
            case 'N':
                return "Z0";
            case 'O':
                return "X0";
            case 'P':
                return "V0";
            case 'Q':
                return "T0";
            case 'R':
                return "R0";
            case 'S':
                return "P0";
            case 'T':
                return "N0";
            case 'U':
                return "L0";
            case 'V':
                return "J0";
            case 'W':
                return "H0";
            case 'X':
                return "F0";
            case 'Y':
                return "D0";
            case 'Z':
                return "B0";
            case 'a':
                return "0B";
            case 'b':
                return "0D";
            case 'c':
                return "0F";
            case 'd':
                return "0H";
            case 'e':
                return "0J";
            case 'f':
                return "0L";
            case 'g':
                return "0N";
            case 'h':
                return "0P";
            case 'i':
                return "0R";
            case 'j':
                return "0T";
            case 'k':
                return "0V";
            case 'l':
                return "0X";
            case 'm':
                return "0Z";
            case 'n':
                return "0Y";
            case 'o':
                return "0W";
            case 'p':
                return "0U";
            case 'q':
                return "0S";
            case 'r':
                return "0Q";
            case 's':
                return "0O";
            case 't':
                return "0M";
            case 'u':
                return "0K";
            case 'v':
                return "0I";
            case 'w':
                return "0G";
            case 'x':
                return "0E";
            case 'y':
                return "0C";
            case 'z':
                return "0A";
            case '1':
                return "ZZ";
            case '2':
                return "YY";
            case '3':
                return "XX";
            case '4':
                return "WW";
            case '5':
                return "VV";
            case '6':
                return "EE";
            case '7':
                return "DD";
            case '8':
                return "CC";
            case '9':
                return "BB";
            case '0':
                return "AA";
            case '!':
                return "1B";
            case '#':
                return "1D";
            case '$':
                return "1F";
            case '%':
                return "1H";
            case '&':
                return "1J";
            case '(':
                return "1L";
            case ')':
                return "1N";
            case '*':
                return "1P";
            case '+':
                return "1R";
            case ',':
                return "1T";
            case '-':
                return "1W";
            case '.':
                return "1Y";
            case '/':
                return "A1";
            case ' ':
                return "B1";
            case ':':
                return "Z1";
            case ';':
                return "1Z";
            case '<':
                return "1X";
            case '=':
                return "1U";
            case '>':
                return "1S";
            case '@':
                return "1Q";
            case '[':
                return "1O";
            case ']':
                return "1M";
            case '^':
                return "1K";
            case '_':
                return "1I";
            case '{':
                return "1G";
            case '}':
                return "1E";
            case '|':
                return "1C";
            case '~':
                return "1A";
            default:
                return " " + chr;
        }
    }
    
    public String decChr(String chr) {
        switch (chr) {
            case "A0":
                return "A";
            case "C0":
                return "B";
            case "E0":
                return "C";
            case "G0":
                return "D";
            case "I0":
                return "E";
            case "K0":
                return "F";
            case "M0":
                return "G";
            case "O0":
                return "H";
            case "Q0":
                return "I";
            case "S0":
                return "J";
            case "U0":
                return "K";
            case "W0":
                return "L";
            case "Y0":
                return "M";
            case "Z0":
                return "N";
            case "X0":
                return "O";
            case "V0":
                return "P";
            case "T0":
                return "Q";
            case "R0":
                return "R";
            case "P0":
                return "S";
            case "N0":
                return "T";
            case "L0":
                return "U";
            case "J0":
                return "V";
            case "H0":
                return "W";
            case "F0":
                return "X";
            case "D0":
                return "Y";
            case "B0":
                return "Z";
            case "0B":
                return "a";
            case "0D":
                return "b";
            case "0F":
                return "c";
            case "0H":
                return "d";
            case "0J":
                return "e";
            case "0L":
                return "f";
            case "0N":
                return "g";
            case "0P":
                return "h";
            case "0R":
                return "i";
            case "0T":
                return "j";
            case "0V":
                return "k";
            case "0X":
                return "l";
            case "0Z":
                return "m";
            case "0Y":
                return "n";
            case "0W":
                return "o";
            case "0U":
                return "p";
            case "0S":
                return "q";
            case "0Q":
                return "r";
            case "0O":
                return "s";
            case "0M":
                return "t";
            case "0K":
                return "u";
            case "0I":
                return "v";
            case "0G":
                return "w";
            case "0E":
                return "x";
            case "0C":
                return "y";
            case "0A":
                return "z";
            case "ZZ":
                return "1";
            case "YY":
                return "2";
            case "XX":
                return "3";
            case "WW":
                return "4";
            case "VV":
                return "5";
            case "EE":
                return "6";
            case "DD":
                return "7";
            case "CC":
                return "8";
            case "BB":
                return "9";
            case "AA":
                return "0";
            case "1B":
                return "!";
            case "1D":
                return "#";
            case "1F":
                return "$";
            case "1H":
                return "%";
            case "1J":
                return "&";
            case "1L":
                return "(";
            case "1N":
                return ")";
            case "1P":
                return "*";
            case "1R":
                return "+";
            case "1T":
                return ",";
            case "1W":
                return "-";
            case "1Y":
                return ".";
            case "A1":
                return "/";
            case "B1":
                return " ";
            case "Z1":
                return ":";
            case "1Z":
                return ";";
            case "1X":
                return "<";
            case "1U":
                return "=";
            case "1S":
                return ">";
            case "1Q":
                return "@";
            case "1O":
                return "[";
            case "1M":
                return "]";
            case "1K":
                return "^";
            case "1I":
                return "_";
            case "1G":
                return "{";
            case "1E":
                return "}";
            case "1C":
                return "|";
            case "1A":
                return "~";
            default:
                return Character.toString(chr.charAt(1));
        }
    }
}
