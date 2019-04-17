package com.tang;

/**
 * Created by Administrator on 2018/11/27.
 */
public class LinkNode<M> {

    public M data;
    public LinkNode nextNode;

    @Override
    public String toString() {
        return "LinkNode [data=" + data + ", nextNode=\n" + nextNode + "]";
    }
}
