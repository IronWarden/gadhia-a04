package baseline;

import org.junit.jupiter.api.Test;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class GenerateFilesTest {
    @Test
    void test_if_index_file_created() {
        GenerateFiles files = new GenerateFiles();
        String siteName = "jelly.com";
        String authorName = "kingJelly";

        String cssFolder = "y";

        files.generateIndexFile(siteName, authorName);

        Path path = Paths.get("data/index.html");

        assertTrue(Files.exists(path));
    }

    @Test
    void test_if_jss_folder_is_created() {
        GenerateFiles files = new GenerateFiles();

        files.generatejsFolder();
         Path path = Paths.get("data/js");

         assertTrue(Files.isDirectory(path));
    }

    @Test
    void test_if_css_folder_is_created() {
        GenerateFiles files = new GenerateFiles();
        files.generatecssFolder();;
        Path path = Paths.get("data/css");

        assertTrue(Files.isDirectory(path));

    }
}

