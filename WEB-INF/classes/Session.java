public class Session {
    private int time_limit;
    private int start_time;
    private int end_time;
    private User participant;
    private boolean isActive;


    public Session(int timelim, User part, boolean isact) {
        set_start(timelim);
        set_part(part);
        set_end(0);
        set_status(isact);

    }

    public void set_start(int limit) {
        time_limit = limit;
        start_time = 0;
    }

    public int getTime_limit() {
        return time_limit;
    }

    public int getStart_time() {
        return start_time;
    }
    public void set_end(int end){
        end_time = end;
    }
    public void set_part(User x) {
        participant = x;
    }

    public User getParticipant() {
        return participant;
    }

    public void set_status(boolean t) {
        isActive = t;
    }

    public boolean get_status() {
        return isActive;
    }
    public void print_status(){
        System.out.println(time_limit +start_time +end_time+ participant.getUsername() +isActive);
    }

    public static void main(String[] args) {
        User nikhil = new User(3532,"nihegde","NIKHIL",20);
        nikhil.print_stats();
        Session testsesh = new Session(100,nikhil,true);
        testsesh.print_status();
    }
}