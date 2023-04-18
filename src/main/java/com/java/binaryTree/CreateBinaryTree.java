package com.java.binaryTree;

import java.util.Scanner;

class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    TreeNode(int data)
    {
        this.data=data;
    }
}
public class CreateBinaryTree {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        CreateBinaryTree cbt=new CreateBinaryTree();
        TreeNode root=cbt.createTree();
        System.out.println(root);
        System.out.println(root);

    }

    private TreeNode creat5eTree() {
       TreeNode root=null;
       System.out.println("please enter data");
       int data=CreateBinaryTree.sc.nextInt();
        if(data==-1)
        {
            return null;
        }
        root=new TreeNode(data);
        System.out.println("Enter left "+data);
        root.left=createTree();
        System.out.println("Enter right "+data);
        root.right=createTree();

        return root;
    }
}
