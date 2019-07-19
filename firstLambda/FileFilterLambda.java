package firstLambda;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

    public static void main(String[] args) {
        //Este pathname.getname é o nosso retorno
        FileFilter filterLambda = (File pathname) ->  pathname.getName().endsWith(".java");

        File dir = new File("/home/elias/Desktop/");

        File [] files = dir.listFiles(filterLambda);

        for(File f: files){
            System.out.println(f);
        }
    }
}
