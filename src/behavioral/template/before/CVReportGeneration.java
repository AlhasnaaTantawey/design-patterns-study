package behavioral.template.before;

import java.io.File;

public interface CVReportGeneration {

    File readFile(String path);

    GenerateReport generateCVReport(String cvFilePath);

     ExtractData extractFile(File file);

    AnalayizData analize(ExtractData extractData);
}
