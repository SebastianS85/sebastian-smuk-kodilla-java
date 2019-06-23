package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {

        Forum forumUser=new Forum();

        Map<Integer,ForumUser> theResultMapOfUsers= forumUser.getList().stream().filter(user->user.getSex()=='M').filter(user->user.getAge()>20)
                .filter(user->user.getQuantityOfPosts()>0).collect(Collectors.toMap(ForumUser::getUserId,user->user));
        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}




