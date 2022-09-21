public class Generate_all_binary_strings {
    public static void main(String[] args) {
        int n = 3;
        if (n <= 0) return;
        char[] ch = new char[n];
        ch[0] = '0';
        generate(n, ch, 1);
        ch[0] = '1';
        generate(n, ch, 1);
    }

    public static String toString(char[] a) {
        String string = new String(a);
        return string;
    }
 
    static void generate(int k, char[] ch, int n) {
        if (n == k) {
            System.out.print(toString(ch)+" ");
            return;
        }
        if (ch[n - 1] == '0') {
            ch[n] = '0';
            generate(k, ch, n + 1);
            ch[n] = '1';
            generate(k, ch, n + 1);
        }
        if (ch[n - 1] == '1') {
            ch[n] = '0';
            generate(k, ch, n + 1);
        }
    }
}