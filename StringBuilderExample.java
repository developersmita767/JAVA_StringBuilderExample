public class StringBuilderExample {
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        String message = sb.toString();
        System.out.println(message);
    }
}