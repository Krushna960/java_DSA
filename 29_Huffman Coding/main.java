public class main {
    public static void main(String[] args) throws Exception {
        String source = "aabbccdd";
        HuffmanCoder huffmanCoder = new HuffmanCoder(source);

        String encodedString = huffmanCoder.encode(source);
        System.out.println("Encoded String: " + encodedString);

        String decodedString = huffmanCoder.decode(encodedString);
        System.out.println("Decoded String: " + decodedString);
    }
}
