package pkg;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by jeffgoes on 6/10/16.
 */
public class main {
    public static void main (String [] args) throws FileNotFoundException {
        File file = new File ("/Users/jeffgoes/New Folder With Items/GitHub/");   //Referenciando um caminho de arquivo
        File filenew = new File("n1ewName.txt");            //Criando um arquivo auxiliar

        File arquivo2 = new File("/Users/jeffgoes/New Folder With Items/GitHub/FOLDERTEXTE/Arquivo2.txt"); //Criando Arquivo2
        FileOutputStream op = new FileOutputStream(arquivo2); //Usando o arquivo para escrever em bytes
        PrintWriter PW = new PrintWriter(arquivo2);     //Filtro que permite escrever caracter
        PW.println("Olá esse é um arquivo teste");      // Escrever no arquivo
        PW.close();     // Fechar função de escrever



        File[] files = file.listFiles();   //Criar vetor que armazenará todos os arquivos dentro de file.


        //Collections.sort(files);
        //Arrays.sort(file);
        //files[0].


      for (int i=0; i<files.length; i++){
            String auxiliar = files[i].getName();
            System.out.printf(auxiliar+"\n");

        }


    }
}
