import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Broadcast {

    static class Program {
        private final String name;
        private final LocalTime startTime;
        private final LocalTime endTime;

        public Program(String name, String startTimeStr, String endTimeStr) {
            this.name = name;
            this.startTime = LocalTime.parse(startTimeStr);
            this.endTime = LocalTime.parse(endTimeStr);
        }

        // 특정 시간이 방영 시간 범위에 포함되는지 확인하는 메서드
        public boolean isAirTime(LocalTime time) {
            
            return (!time.isBefore(startTime)) && (!time.isAfter(endTime));
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        
        List<Program> schedule = new ArrayList<>();
        schedule.add(new Program("프로그램 1", "03:00", "05:00"));
        schedule.add(new Program("프로그램 2", "05:01", "06:30"));
        schedule.add(new Program("프로그램 3", "06:31", "08:00"));
        schedule.add(new Program("프로그램 4", "08:01", "09:00"));
        schedule.add(new Program("프로그램 5", "09:01", "10:00"));
        schedule.add(new Program("프로그램 6", "10:01", "12:00"));
        schedule.add(new Program("프로그램 7", "12:01", "13:30"));
        schedule.add(new Program("프로그램 8", "13:31", "15:00"));
        schedule.add(new Program("프로그램 9", "15:01", "17:00"));
        schedule.add(new Program("프로그램 10", "17:01", "18:00"));
        schedule.add(new Program("프로그램 11", "18:01", "21:00"));
        schedule.add(new Program("프로그램 12", "21:01", "23:00"));
        schedule.add(new Program("프로그램 13", "23:01", "23:59"));
        
        
        LocalTime currentTime = LocalTime.now();
        
        System.out.println("=== 현재 시간 기준 방영 프로그램 ===");
        System.out.println("현재 시간: " + currentTime.format(DateTimeFormatter.ofPattern("HH:mm")));
        checkAndPrintProgram(schedule, currentTime);

        System.out.println("\n------------------------------------");


        System.out.println("=== 예시 테스트 케이스 ===");
        
      
        LocalTime testTime1 = LocalTime.of(10, 34);
        System.out.print("[테스트 1] 10:34 -> 결과: ");
        checkAndPrintProgram(schedule, testTime1);


        LocalTime testTime2 = LocalTime.of(1, 11);
        System.out.print("[테스트 2] 01:11 -> 결과: ");
        checkAndPrintProgram(schedule, testTime2);
    }


    private static void checkAndPrintProgram(List<Program> schedule, LocalTime targetTime) {
        for (Program program : schedule) {
            if (program.isAirTime(targetTime)) {
                System.out.println(program.getName());
                return;
            }
        }
        
        System.out.println("방영중인 시간이 아닙니다.");
    }
}
