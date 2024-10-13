package homework10_1;

public class DocHandler {
    public String docNumber;

    public DocHandler(String docNumber) {
        this.docNumber = docNumber;
    }

    public static void displayTwoBlocks(String docNumber) {
        String substring1 = docNumber.substring(0, 4);
        String substring2 = docNumber.substring(9, 13);
        System.out.println("2 first blocks: " + substring1 + substring2);
    }

    //https://javarush.com/groups/posts/2845-replace-string-v-java
    public static void replaceOnAsterisk(String docNumber) {
        String replaced = docNumber.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println("Replaced: " + replaced);
    }

    public static void displayLettersLowerCase(String docNumber) {
        String substring1 = docNumber.substring(5, 8);
        String substring2 = docNumber.substring(14, 17);
        String substring3 = docNumber.substring(19, 20);
        String substring4 = docNumber.substring(21, 22);
        String resultLowerCase = (substring1 + "/" + substring2 + "/" + substring3 + "/" + substring4).toLowerCase();
        System.out.println("Letters only: " + resultLowerCase);
    }

    public static void dislayLettersUpperCase(String docNumber) {
        String docNumber2 = docNumber.toUpperCase();
        StringBuilder stringBuilder = new StringBuilder(docNumber2);
        stringBuilder.insert(8, "/");
        stringBuilder.insert(18, "/");
        stringBuilder.insert(22, "/");
        stringBuilder.delete(0, 5);
        stringBuilder.delete(4, 10);
        stringBuilder.delete(8, 10);
        stringBuilder.delete(10, 11);
        StringBuilder stringBuilder2 = new StringBuilder("Letters:");
        stringBuilder2.append(stringBuilder);
        System.out.println(stringBuilder2);
    }

    public static void ifContainsAbc(String docNumber) {
        boolean abcUpper = docNumber.contains("abc");
        boolean abcLower = docNumber.contains("ABC");
        if (abcUpper == true || abcLower == true) {
            System.out.println("The document number contains 'abc' sequence");
        } else System.out.println("The document number doesn't contain 'abc' sequence");
    }

    public static void ifStartsFrom555(String docNumber) {
        boolean start = docNumber.startsWith("555");
        if (start == true) {
            System.out.println("The document number starts with '555'");
        } else System.out.println("The document number doesn't start with '555'");
    }

    public static void ifEndsWith(String docNumber) {
        boolean end = docNumber.endsWith("1a2b");
        if (end == true) {
            System.out.println("The document number ends with '1a2b'");
        } else System.out.println("The document number doesn't end with '1a2b'");
        boolean end2 = docNumber.endsWith("1A2B");
        if (end2 == true) {
            System.out.println("But the document number ends with '1A2B'");
        }
    }
}
