package com.tang;

/**
 * Created by Administrator on 2018/11/27.
 */
public class MainTest {
    public static void main(String[] args) {
        LinkNode<Person> linkNode=new LinkNode<Person>();
        Person person=new Person();
        person.setAge(20);
        person.setName("tangzhihai");
        linkNode.data=person;
        LinkNode<Person> linkNode1=linkNode;
        for (int i = 0; i <100 ; i++) {
            LinkNode<Person> linkNode2=new LinkNode<Person>();
            Person person1=new Person();
            person1.setName("tang"+i);
            person1.setAge(+i);
            linkNode2.data=person1;
            linkNode1.nextNode=linkNode2;
            linkNode1=linkNode2;
        }
        System.out.println(linkNode);
    }
}
