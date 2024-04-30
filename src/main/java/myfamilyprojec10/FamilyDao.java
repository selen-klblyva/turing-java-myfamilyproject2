package myfamilyprojec10;

import java.util.List;
import java.io.*;
public class FamilyDao {
    private static final String FILE_PATH = "family_data.txt";

    public void saveData(List<Family> families) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(families);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            logError("Error saving data: " + e.getMessage());
        }
    }

    public List<Family> loadData() {
        List<Family> families = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            families = (List<Family>) ois.readObject();
            System.out.println("Data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            logError("Error loading data: " + e.getMessage());
        }
        return families;
    }

    // Log error messages
    private void logError(String message) {
        System.err.println("[ERROR] " + message);
    }
}
