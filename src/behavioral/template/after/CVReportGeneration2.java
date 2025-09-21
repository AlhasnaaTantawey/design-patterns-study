package behavioral.template.after;

import behavioral.template.before.AnalayizData;
import behavioral.template.before.GenerateReport;

import java.io.File;

public abstract class CVReportGeneration2 {

   public GenerateReport generateCVReport(String cvFilePath ,  boolean isPassed){
        File file = readFile(cvFilePath);//parent
        Data extractedData = extractData(file); // each child execute it
        AnalayizData analyzedData = analize(extractedData); // parent
        return generateReportOf(analyzedData,isPassed);// parent
    }

    protected abstract Data extractData(File file);

    private GenerateReport generateReportOf(AnalayizData analayizData , boolean isPassed) {
        System.out.println("generating report from " );
        return new GenerateReport(isPassed);
    }

    private File readFile(String filePath) {
        System.out.println("Reading word file from: " + filePath);
        return null;
    }


    private AnalayizData analize(Data data2) {
        System.out.println("analayiz data from: " );
        return null;
    }

}
