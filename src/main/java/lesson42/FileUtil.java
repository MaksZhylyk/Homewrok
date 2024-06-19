package lesson42;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtil {
    private static final Logger log = LoggerFactory.getLogger(FileUtil.class);
    public static void main(String[] args) {
        File directory = new File("src/main/resources/testUtil");
        File directoryNew = new File("src/main/resources/testUtilsJava");
        Path path = directoryNew.toPath();
        boolean result = directory.mkdir();
        System.out.println(result);

        System.out.println("canRead " + directory.canRead());
        System.out.println("canWrite " + directory.canWrite());
        System.out.println("getParent " + directory.getParent());
        System.out.println("exists " + directory.exists());
        System.out.println("getPath " + directory.getPath());
        System.out.println("getAbsolutePath " + directory.getAbsolutePath());
        System.out.println("getTotalSpace " + directory.getTotalSpace());
        System.out.println("getUsableSpace " + directory.getUsableSpace());
        System.out.println("isDirectory " + directory.isDirectory());
        System.out.println("isFile " + directory.isFile());
        System.out.println("isHidden " + directory.isHidden());
        System.out.println("isHidden " + directory.renameTo(directoryNew));


        File[] filesInDirectory = directory.listFiles();
        for(File fileInDirectory : filesInDirectory){
            System.out.println(fileInDirectory.getName());{}
        }
        boolean deleteResult = directory.delete();
        System.out.println(deleteResult);

        try{
            Files.delete(new File("src/main/resources/testUtilsJava/file1.txt").toPath());
            Files.delete(new File("src/main/resources/testUtilsJava/file2.txt").toPath());
            Files.deleteIfExists(path);
        } catch(IOException e){
            throw new RuntimeException(e);
        } catch (NullPointerException e){
            log.error(e.getMessage());
        }
    }
}
