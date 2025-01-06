package DAY1020;

import java.util.Scanner;

public class gameProgram2 extends trance{
    static void gameProgram2(){ //문자 입력시 실행될 게임 프로그램

        int winCount = 0;
        int drowCount = 0;
        int loseCount = 0;

        Scanner scanner = new Scanner(System.in);
        String[] hand = {"가위","바위","보"};
        System.out.println("게임 시작");

        while (true){
            System.out.println("뭐내실?");
            String user = scanner.next();
            int user_int = trance(user);

                if(user_int == 4) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else if(user_int==3) {
                    System.out.print("'종료'를 입력하면 종료합니다\n설명보기 : '설명'\n");
                    continue;
                } else if (user_int==9999) {
                    System.out.println("다시 입력해주세요.");
                    continue;
                } else if (user_int < 3) {
                    int ranCom = (int)(Math.random()*3); // 0<x<1 실수
                    String com = hand[ranCom];
                    String player = hand[user_int];

                    if (com == player){
                        System.out.println("무승부");
                        ++drowCount;
                        System.out.printf("%d승 %d무 %d패%n",winCount,drowCount,loseCount);
                    } else if (!(com == player)) {
                        if (com.equals("가위")){
                            if (player.equals("바위")){
                                System.out.println("승리");
                                ++winCount;
                                System.out.printf("%d승 %d무 %d패%n",winCount,drowCount,loseCount);
                            }else if (player.equals("보")){
                                System.out.println("패배");
                                ++loseCount;
                                System.out.printf("%d승 %d무 %d패%n",winCount,drowCount,loseCount);
                            }
                        }
                        else if (com.equals("바위")){
                            if (player.equals("보")){
                                System.out.println("승리");
                                winCount++;
                                System.out.printf("%d승 %d무 %d패%n",winCount,drowCount,loseCount);
                            }else if (player.equals("가위")){
                                System.out.println("패배");
                                loseCount++;
                                System.out.printf("%d승 %d무 %d패%n",winCount,drowCount,loseCount);
                            }
                        }
                        else if (com.equals("보")){
                            if (player.equals("가위")){
                                System.out.println("승리");
                                winCount++;
                                System.out.printf("%d승 %d무 %d패%n",winCount,drowCount,loseCount);
                            }else if (player.equals("바위")){
                                System.out.println("패배");
                                loseCount++;
                                System.out.printf("%d승 %d무 %d패%n",winCount,drowCount,loseCount);
                            }
                        }
                    }
                }
            }
        }
    }

