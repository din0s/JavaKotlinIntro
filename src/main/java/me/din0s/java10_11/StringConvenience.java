package me.din0s.java10_11;

public class StringConvenience {
    public static void main(String[] args) {
        var a = "";
        var b = "     ";
        System.out.println(a.isEmpty());
        System.out.println(b.isBlank());

        var str = "hi\n_hey\nhello\n_bye";
        str.lines()
                .filter(s -> s.startsWith("_"))
                .map(s -> s.substring(1))
                .forEach(System.out::println);

        var star = "*";
        System.out.println(star.repeat(5));
    }
}
