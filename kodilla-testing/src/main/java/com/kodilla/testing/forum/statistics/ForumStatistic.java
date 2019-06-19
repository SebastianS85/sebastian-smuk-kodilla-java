package com.kodilla.testing.forum.statistics;

public class ForumStatistic {

    private int quantityOfUsers;
    private int quantityOfComments;
    private int quantityOfPosts;

    private double meanPostPUser;
    private double meanCommentsPUser;
    private double meanCommentsPPost;
    Statistics statistic;

    public ForumStatistic(Statistics statistic) {
        this.statistic = statistic;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        quantityOfUsers=statistics.usersNames().size();
        quantityOfComments=statistics.commentsCount();
        quantityOfPosts =statistics.postsCount();

         meanPostPUser=((double) quantityOfPosts /(double)quantityOfUsers);
         meanCommentsPUser=((double)quantityOfComments/(double)quantityOfUsers);
         meanCommentsPPost=((double)quantityOfComments/(double) quantityOfPosts);

    }

    public int getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public int getQuantityOfComments() {
        return quantityOfComments;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public double getMeanPostPUser() {if(statistic.usersNames().isEmpty())return 0;

        return meanPostPUser;
    }

    public double getMeanCommentsPUser() {if(statistic.usersNames().isEmpty())return 0;

        return meanCommentsPUser;
    }

    public double getMeanCommentsPPost() {if(statistic.usersNames().isEmpty())return 0;
    else if(statistic.postsCount()==0)return 0;
        return meanCommentsPPost;
    }
    public void showStatistics(){
    System.out.println("Mean comments of user is:"+getMeanCommentsPUser());
    System.out.println("Mean post of user :"+getMeanPostPUser());
    System.out.println("Mean comments per post:"+getMeanCommentsPPost());

    }
}
