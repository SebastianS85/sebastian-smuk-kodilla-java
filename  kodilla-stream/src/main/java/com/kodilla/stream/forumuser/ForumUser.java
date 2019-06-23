package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int quantityOfPosts;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;

    public ForumUser(int userId, String userName, char sex, int quantityOfPosts, int birthDay, int birthMonth, int birthYear) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.quantityOfPosts = quantityOfPosts;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        birthDate = LocalDate.of(birthYear,birthMonth,birthDay);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;

        ForumUser forumUser = (ForumUser) o;

        if (userId != forumUser.userId) return false;
        if (sex != forumUser.sex) return false;
        if (quantityOfPosts != forumUser.quantityOfPosts) return false;
        if (userName != null ? !userName.equals(forumUser.userName) : forumUser.userName != null) return false;
        return birthDate != null ? birthDate.equals(forumUser.birthDate) : forumUser.birthDate == null;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (int) sex;
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + quantityOfPosts;
        return result;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", quantityOfPosts=" + quantityOfPosts +
                '}';
    }
    public int getAge(){

        return (int)LocalDate.now().getYear()-birthDate.getYear();
    }
}
