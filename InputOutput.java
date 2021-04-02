import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  String nama;
  String npm;
  String kelas;

  System.out.print("Masukkan nama anda: ");
  nama = scanner.nextLine();
 
  System.out.print("Masukkan npm anda: ");
  npm = scanner.nextLine();

  System.out.print("Masukkan kelas anda: ");
  kelas = scanner.nextLine();
  
  System.out.println();
  System.out.println("Nama : "+nama);
  System.out.println("NPM : "+npm);
  System.out.println("Kelas : "+kelas);
 }
}