import java.io.*;
import java.nio.file.*;
import java.lang.reflect.Method;

public class CustomClassLoader extends ClassLoader {
    private String classPath;

    public CustomClassLoader(String classPath) {
        this.classPath = classPath;
    }

    @Override
    public Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            Path path = Paths.get(classPath, name.replace('.', '/') + ".class");
            byte[] classBytes = Files.readAllBytes(path);
            return defineClass(name, classBytes, 0, classBytes.length);
        } catch (IOException e) {
            throw new ClassNotFoundException("Class not found", e);
        }
    }

    public static void main(String[] args) throws Exception {
        String pathToClasses = "C:\\Users\\harsh\\OneDrive\\Desktop\\LeetCode\\DSA";
        CustomClassLoader loader = new CustomClassLoader(pathToClasses);

        // Load the JuggedArrayInJava class
        Class<?> myClass = loader.loadClass("JuggedArrayInJava");

        // Use reflection to invoke the main method of JuggedArrayInJava
        Method mainMethod = myClass.getMethod("main", String[].class);
        
        // Prepare an empty String array for the main method's arguments
        String[] mainArgs = new String[] {};
        
        // Invoke the main method on the class
        mainMethod.invoke(null, (Object) mainArgs);
    }
}
