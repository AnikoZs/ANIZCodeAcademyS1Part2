package Lesson35.ErrorLogger;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WindmillFileReader {

    private Logger logger;

    public WindmillFileReader(Logger logger) {
        this.logger = logger;
    }

    public void readWindData(String fileName, Windmill windmill) {

        logger.log("Starting file reading...", LogLevel.INFO);

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {
                try {
                    double windSpeed = Double.parseDouble(line);

                    if (windSpeed < 0) {
                        logger.log("Negative wind speed: " + line, LogLevel.WARNING);
                        continue;
                    }

                    double power = windmill.calculatePower(windSpeed);
                    logger.log("Wind: " + windSpeed + " -> Power: " + power, LogLevel.INFO);

                } catch (NumberFormatException e) {
                    logger.log("Invalid number: " + line, LogLevel.ERROR);
                }
            }

        } catch (IOException e) {
            logger.log("File error: " + e.getMessage(), LogLevel.ERROR);
        }
    }
}