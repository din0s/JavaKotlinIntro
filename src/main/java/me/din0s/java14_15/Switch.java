package me.din0s.java14_15;

public class Switch {
    public static void main(String[] args) {
        // switch statement
        boolean isTrue;
        switch ("true") {
            case "y":
            case "yes":
            case "true":
                isTrue = true;
                break;
            default:
                isTrue = false;
                break;
        }

        // switch expression
        var isTrue2 = switch ("true") {
            case "y", "yes", "true" -> true;
            default -> false;
        };
    }
}
