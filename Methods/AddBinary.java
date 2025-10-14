public class AddBinary {
    // Method to add two binary strings
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            result.append(sum % 2);
            carry = sum / 2;
        }
        return result.reverse().toString();
    }

    // Overloaded method: add binary numbers given as integers
    public static String addBinary(int a, int b) {
        return addBinary(Integer.toBinaryString(a), Integer.toBinaryString(b));
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println("Sum: " + addBinary(a, b)); // Output: 10101

        int x = 10;
        int y = 11;
        System.out.println("Sum: " + addBinary(x, y)); // Output: 10101
    }
}
