import java.nio.file.Path;
import java.nio.file.Paths;
public class PathProg {
    private Path path; 
    public static void main (String [] args) {
        PathProg example = new PathProg();
        example.createPath();
    }
    private void createPath() {
        path = Paths.get("C:\\mainfile\\file3\\manushi.txt");
        System.out.println("Path created: " + path.toString());
  }
}
