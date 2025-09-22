package behavioral.template.after;


import java.io.File;
//Concrete Subclas
public class ImageCVReportGeration2 extends CVReportGeneration2 {


    @Override
    protected Data extractData(File file) {
        System.out.println("extract data from image... " );
        return null;
    }
}
