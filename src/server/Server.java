package server;

public class Server implements ServerInterface{
    private String answer;

    public Server(){};

    @Override
    public String Registration(String Login, String pass) {
        answer = "true";
        return answer;
    }

    @Override
    public String Autorization(String Login, String pass) {
        answer = "true";
        return answer;
    }
    
    @Override
    public String SendCalendar() {
        answer = "true";
        return answer;
    }
        
    @Override
    public String SendCarInfo(int id_rec) {
        answer = "true";
        return answer;
    }

    @Override
    public String SendRecordInfo(int id_manager) {
        answer = "true";
        return answer;
    }

    @Override
    public String ToBookATime(int id_rec, int time) {
        answer = "true";
        return answer;
    }

    // Manager

    @Override
    public String SendClientInfoToManager(int id_rec) {
        answer = "true";
        return answer;
    }

    @Override
    public String ChangeStatus(int id_rec, String status) {
        answer = "true";
        return answer;
    }

    @Override
    public String ChangeTime(int id_rec, int time) {
        answer = "true";
        return answer;
    }

    // Admin Interface

    @Override
    public String ChangeManager(int id_rec, int id_manager) {
        answer = "true";
        return answer;
    }

    @Override
    public String SetManager(int id_user) {
        answer = "true";
        return answer;
    }

    @Override
    public String RemoveManager(int id_user) {
        answer = "true";
        return answer;
    }

    @Override
    public String SendAllUsersInfo() {
        answer = "true";
        return answer;
    }
}
