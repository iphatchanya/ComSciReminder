package code;

import java.io.*;
import java.util.ArrayList;

public class SubjectManager {

    private ArrayList<Subject> subjects;

    public SubjectManager() throws IOException {
        subjects = new ArrayList<>();
        readFileToSubject(subjects);
    }

    public File getFile() {
        try {
            String jarDir = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent();
            return new File(jarDir + "/SubjectsList.txt");
        } catch (Exception e) {
            return null;
        }
    }

    private void generateNewFile() throws IOException {
        StringBuilder fileInitialData = new StringBuilder();
        fileInitialData.append("01418112/U/null\n");
        fileInitialData.append("01418114/U/null\n");
        fileInitialData.append("01418131/U/null\n");
        fileInitialData.append("01417111/U/null\n");
        fileInitialData.append("01999111/U/null\n");
        fileInitialData.append("01418113/U/01418112\n");
        fileInitialData.append("01418132/U/null\n");
        fileInitialData.append("01417112/U/01417111\n");
        fileInitialData.append("01418211/U/01418113\n");
        fileInitialData.append("01418231/U/01418113\n");
        fileInitialData.append("01417322/U/01417112\n");
        fileInitialData.append("01422111/U/null\n");
        fileInitialData.append("01418221/U/01418113\n");
        fileInitialData.append("01418233/U/01418113:01418131\n");
        fileInitialData.append("01418232/U/01418231:01418132\n");
        fileInitialData.append("01418331/U/01418233\n");
        fileInitialData.append("01418321/U/01418221:01418211\n");
        fileInitialData.append("01418497/U/01418232:01418233:01418221\n");
        fileInitialData.append("01418341/U/null\n");
        fileInitialData.append("01418332/U/01418331\n");
        fileInitialData.append("01418333/U/01418132\n");
        fileInitialData.append("01418351/U/01418331\n");
        fileInitialData.append("01418390/U/01418321\n");
        fileInitialData.append("01418334/U/null\n");
        fileInitialData.append("01418490/U/01418390\n");
        fileInitialData.append("01418499/U/01418321\n");

        FileOutputStream fileOutputStream = new FileOutputStream(getFile());
        fileOutputStream.write(fileInitialData.toString().getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    private void saveChangeToFile() throws IOException {
        StringBuilder stf = new StringBuilder();
        for (Subject subject : subjects) {
            stf.append(subject.getId() + "/");
            if (subject.isPassed())
                stf.append("P/");
            else
                stf.append("U/");

            if (subject.getPreSubjectsId().size() > 0) {
                StringBuilder tmpStringBuilder = new StringBuilder();
                for (String preSubjectId : subject.getPreSubjectsId()) {
                    tmpStringBuilder.append(preSubjectId + ":");
                }
                stf.append(tmpStringBuilder.toString().substring(0, tmpStringBuilder.toString().length() - 1));
            } else {
                stf.append("null");
            }

            stf.append("\n");
        }

        try (PrintWriter printWriter = new PrintWriter(getFile())) {
            printWriter.print(stf.toString());
        } catch (FileNotFoundException e) {
            throw e;
        }
    }

    public void toggleStatusOfSubject(Subject subject) throws IOException {
        if (subject.isPassed()) {
            subject.setStatus(false);
        } else {
            subject.setStatus(true);
        }
        saveChangeToFile();
    }

    public void disableSubject(Subject subject) throws IOException {
        subject.setStatus(false);
        saveChangeToFile();
    }

    private void readFileToSubject(ArrayList<Subject> subjects) throws IOException {
        this.subjects.clear();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(getFile()));
            String line = bufferedReader.readLine();
            while (line != null && !line.isEmpty()) {
                String[] sffs = line.split("/");
                if (sffs[1].equals("P"))
                    subjects.add(new Subject(sffs[0], true, sffs[2]));
                else
                    subjects.add(new Subject(sffs[0], false, sffs[2]));
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            generateNewFile();
            readFileToSubject(subjects);
        }
    }

    public Subject getSubject(String id) {
        for (Subject subject : subjects) {
            if (id.equals(subject.getId()))
                return subject;
        }
        return null;
    }

    public boolean isThatSpecialSeminarSubject(String id) {
        return (id.equals("01418497"));
    }
}