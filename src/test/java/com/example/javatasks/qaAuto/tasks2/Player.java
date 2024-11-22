package com.example.javatasks.qaAuto.tasks2;

public class Player {
    private String nickname;
    private int level;
    private int score;

    public Player(String nickname, int level, int score) {
        this.nickname = nickname;
        this.level = level;
        this.score = score;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void levelUp() {
        level++;
    }

    public void addScore(int points) {
        score += points;
    }

    public void printPlayerInfo() {
        System.out.println("Игрок: %s, Уровень: %d, Очки: %d"
                .formatted(nickname, level, score));
    }
}
