import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;
import org.opencv.objdetect.CascadeClassifier;

public class Main {

    public static void faceDetection() {
        //System.out.println(Main.class.getClassLoader().getResource("resources/haarcascades/haarcascade_frontalface_alt.xml"));
        String pathToHaarCascades = "resources/haarcascades/haarcascade_frontalface_alt.xml";
        CascadeClassifier faceDetector = new CascadeClassifier(Main.class.getResource(pathToHaarCascades).getPath());
        String pathToImage = "resources/images/students_rgb";
        // Mat image = Highgui
        //         .imread(Main.class.getResource(pathToImage).getPath());
 
        
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Welcome to OpenCV " + Core.VERSION);
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat m  = Mat.eye(3, 3, CvType.CV_8UC1);
        System.out.println("m = " + m.dump());
        faceDetection();
    }

}
