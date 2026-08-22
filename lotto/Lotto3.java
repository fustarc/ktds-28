package com.ktdsuniversity.edu.oop.exam.lotto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Lotto3 {

    // 1회 게임 번호 6개를 생성하는 도우미 메서드
    private static List<Integer> generateLottoNumbers(Random random) {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 6) {
            int num = random.nextInt(45) + 1;
            if (!numbers.contains(num)) {
                numbers.add(num);
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> roundLottoMap = new HashMap<>();
        Random random = new Random();
        int totalRounds = 5; // 생성할 총 회차 수 (예: 5회차)

        // 1회차부터 N회차까지 생성하여 Map에 저장
        for (int round = 1; round <= totalRounds; round++) {
            List<Integer> lotto = generateLottoNumbers(random);
            roundLottoMap.put(round, lotto);
        }

        // 결과 출력
        System.out.println("=== 회차별 당첨 번호 ===");
        for (int round = 1; round <= totalRounds; round++) {
            List<Integer> numbers = roundLottoMap.get(round);
            
            // "5, 8, 1, 37, 22, 38" 포맷으로 변환
            String formattedNumbers = numbers.toString();

            System.out.printf("%d회차 => %s%n", round, formattedNumbers);
        }
    }
}
