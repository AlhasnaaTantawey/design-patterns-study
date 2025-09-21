package behavioral.template.before;

import java.io.File;

public class WordCVReportGeration implements CVReportGeneration{
    @Override
    public GenerateReport generateCVReport(String cvFilePath) {
        File file = readFile(cvFilePath);
        Data2 extractedData = extractFile(file);
        AnalayizData analyzedData = analize(extractedData);
        return generateReportOf(analyzedData);
    }

    private GenerateReport generateReportOf(AnalayizData analayizData) {
        System.out.println("generating report from " );
        return new GenerateReport(true);
    }

    @Override
    public File readFile(String filePath) {
        System.out.println("Reading word file from: " + filePath);
        return null;
    }

    @Override
    public Data2 extractFile(File file) {
        System.out.println("extract data from word " );
        return null;
    }

    @Override
    public AnalayizData analize(Data2 data2) {
        System.out.println("analayiz data from: " );
        return null;
    }
}
