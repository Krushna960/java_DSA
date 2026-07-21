import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.OutputStream;

class Main {
    public static void main(String[] args) {
        // try(InputStreamReader isr = new InputStreamReader(System.in)){
        //     System.out.print("Enter some latter: ");
        //     int letters = isr.read();
        //     while(isr.ready()){
        //         System.out.println((char) letters);
        //         letters = isr.read();
        //     }

        //     isr.close();
        //     System.out.println();
        // }catch (Exception e){
        //     System.out.println(e.getMessage());
        // }

        // try(FileReader fr = new FileReader("note.txt")){
        //     int letters = fr.read();
        //     while(fr.ready()){
        //         System.out.println((char) letters);
        //         letters = fr.read();
        //     }

        //     // fr.close();
        //     System.out.println();
        // }catch (Exception e){
        //     System.out.println(e.getMessage());
        // }

        // //byte to char stream and then reading char stream
        // try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //     System.out.println("You typed: " + br.readLine());
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }

        // try(BufferedReader br = new BufferedReader(new FileReader("note.txt"))){
        //     while(br.ready()){
        //         System.out.println(br.readLine());
        //     }
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }
        

        //output stream
        OutputStream os = System.out;
        // os.write(65);
        System.out.println();

        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write("Hello World");
            osw.write(97);
            osw.write("\n"  );
            char[] arr = "hello world".toCharArray();
            osw.write(arr);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileWriter fw = new FileWriter(" note.txt", true)){
            fw.write("this should be appended to the file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(" note.txt"))){
            bw.write(" hare krushna");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}