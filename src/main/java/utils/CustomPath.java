package utils;

import java.io.File;
import java.nio.file.Paths;

public class CustomPath {

    public String getProjectPath(){
        return System.getProperty("user.dir");
    }

    public String getResourcePath(String resourceFile)
    {
        return Paths.get(new File( getClass()
        .getClassLoader()
        .getResource(resourceFile)
        .getFile()
        ).getAbsolutePath()).toString();

    }

}
