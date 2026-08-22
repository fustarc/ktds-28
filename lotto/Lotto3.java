package com.ktdsuniversity.edu.oop.exam.lotto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Lotto3 {

    // 1회차분의 고유한 로또 번호 6개를 생성하는 메서드
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
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Map<Integer, List<Integer>> roundLottoMap = new HashMap<>();

        System.out.print("회차 수를 입력하세요: ");
        int totalRounds = scanner.nextInt();

        for (int round = 1; round <= totalRounds; round++) {
            List<Integer> lottoNumbers = generateLottoNumbers(random);
            roundLottoMap.put(round, lottoNumbers);
        }

        System.out.println("\n=== 회차별 당첨 번호 ===");
        for (int round = 1; round <= totalRounds; round++) {
            List<Integer> numbers = roundLottoMap.get(round);

            String formattedNumbers = numbers.toString();

            System.out.printf("%d회차 => %s%n", round, formattedNumbers);
        }

        scanner.close();
    }
}