package code;

import java.io.IOException;
import java.util.ArrayList;

public class Subject {

    private String id;
    private boolean status;
    private ArrayList<String> preSubjectsId;

    public Subject(String id, boolean status, String preSubjectsIdString) {
        this.id = id;
        this.status = status;
        preSubjectsId = new ArrayList<>();

        if (preSubjectsIdString.contains(":")) {
            String[] preSubjectsIdStringSplit = preSubjectsIdString.split(":");
            for (int i = 0; i < preSubjectsIdStringSplit.length; i++) {
                preSubjectsId.add(preSubjectsIdStringSplit[i]);
            }
        } else {
            preSubjectsId.add(preSubjectsIdString);
        }
    }

    public String getId() {
        return id;
    }

    public Boolean isPassed() {
        return status;
    }

    public boolean isPassedOnePreSubject() throws IOException {
        SubjectManager subjectManager = new SubjectManager();

        for (String preSubject : preSubjectsId) {
            if (preSubject.equals("null") || subjectManager.getSubject(preSubject).isPassed())
                return true;
        }
        return false;
    }

    public boolean isPassedAllPreSubject() throws IOException {
        SubjectManager subjectManager = new SubjectManager();

        int passedPreSubject = 0;
        for (String preSubject : preSubjectsId) {
            if (preSubject.equals("null"))
                return true;
            else if (subjectManager.getSubject(preSubject).isPassed())
                passedPreSubject++;
        }

        return (passedPreSubject == preSubjectsId.size());
    }

    public ArrayList<String> getPreSubjectsId() {
        return preSubjectsId;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}