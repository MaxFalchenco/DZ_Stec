package com.company;



/**
 * Created by Максим on 17.04.2016.
 */
public class StackImpl implements Stack
{
    static int i;
    int size;
    int[] data;
    

     StackImpl(int size_of_arr)
     {
         data = new int [size_of_arr];
     }

    public int Push(int value) throws StackException
    {

        if(size >= 5) throw new StackException("steck is full");
        return data[size++] = value;

    }

    public void Pop() throws StackException
    {
        if(size <= 0) throw new StackException("steck is empty");
        data[--size] = 0;

    }

   public void Clear()
   {
       for (i = 0; i <= 4; i++)
       {
           data[i] = 0;
       }
   }


    public static void main (String[] args)
    {

        StackImpl stack = new StackImpl(5);

        try
        {

            stack.Push(1);
            stack.Push(2);
            stack.Push(3);
            stack.Push(4);
            stack.Push(5);
            stack.Push(6);

        }
        catch (StackException e)
        {
            System.out.println(e.getMessage());
        }




        for (int i = 0; i <= 4; i++)
            System.out.println(stack.data[i]);

        System.out.println("--------------------------------------------------------------");

        try {
            stack.Pop();
            stack.Pop();
            stack.Pop();
            stack.Pop();
            stack.Pop();
            stack.Pop();
        }
        catch (StackException e)
        {
            System.out.println(e.getMessage());
        }
        for (i = 0; i <= 4; i++)
        {
            System.out.println(stack.data[i]);
        }

        System.out.println("--------------------------------------------------------------");


        try
        {


            stack.Push(6);
            stack. Push(7);


        }
        catch (StackException e)
        {
            System.out.println(e.getMessage());
        }
        for (i = 0; i <= 4; i++)
        {
            System.out.println(stack.data[i]);
        }
        System.out.println("--------------------------------------------------------------");

        stack.Clear();

        for (i = 0; i <= 4; i++)
        {
            System.out.println(stack.data[i]);
        }

    }




}