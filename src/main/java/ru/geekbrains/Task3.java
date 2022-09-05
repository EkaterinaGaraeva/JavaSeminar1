package ru.geekbrains;

public class Task3 {
    public static void main(String[] args) {
        String str = "sdf sdfsdfsdf sdfsdfsdf fdfds";
        String[] words = str.split(" ");
        StringBuilder str2 = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            str2.append(words[i]);
            if (i != 0) {
                str2.append(" ");
            }
        }
        System.out.println(str2);
    }
}
