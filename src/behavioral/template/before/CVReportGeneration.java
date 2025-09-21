package behavioral.template.before;

import java.io.File;

public interface CVReportGeneration {

    File readFile(String path);

    GenerateReport generateCVReport(String cvFilePath);

     Data2 extractFile(File file);

    AnalayizData analize(Data2 data2);
}
