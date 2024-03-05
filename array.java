import java.util.Scanner;

public class array
{
    static void traverse(String[] fruits)
    {
        for(int i=0; i<fruits.length; i++)
        {
            System.out.print(fruits[i]+" ");
        }
        System.out.println();
    }
    
    static int search(String[] fruits, String name)
    {
        for(int i=0; i<fruits.length; i++)
        {
            if(fruits[i].equals(name))
            {
                return 1;
            }
        }
        return -1;
    }

    static String[] insert(String[] fruits, String name, int index)
    {
        String[] newFruits= new String[fruits.length+1];
        if(index<0 || index>fruits.length)
        {
            System.out.println("Invalid index");
            return fruits;
        }
        for(int i=0, j=0; i<newFruits.length; i++)
        {
            if(i==index){
                newFruits[i]=name;
            }
            else{
                newFruits[i]=fruits[j++];
            }
        }
        return newFruits;
    }

    static String[] delete(String[] fruits, String name)
    {
        String[] newFruits=new String[fruits.length-1];
        for(int i=0, j=0; i<fruits.length; i++)
        {
            if(!fruits[i].equals(name))
            {
                newFruits[j]=fruits[i];
                j++;
            }
        }
        return newFruits;
    }

    static String[] update(String[] fruits, String name, int index)
    {
        String[] newFruits = new String[fruits.length];
        for(int i=0;i<fruits.length;i++)
        {
            if(i==index)
            {
                newFruits[i]=name;
                continue;
            }
            newFruits[i]=fruits[i];
        }
        return newFruits;
    }

    public static void main(String[] args)
    {
        String[] fruits = {"apple", "orange", "banana", "grapes"};
        String name;
        int index = 0;
        System.out.println("---Menu---");
        System.out.println("1. Traverse");
        System.out.println("2. Search");
        System.out.println("3. Insert");
        System.out.println("4. Delete");
        System.out.println("5. Update");
        System.out.println("6. Exit");
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1:
                    traverse(fruits);
                    break;
                case 2:
                    System.out.println("Enter the search element:");
                    name=sc.nextLine();
                    int y = search(fruits, name);
                    if(y==1){
                        System.out.println("Element found");
                    }
                    else{
                        System.out.println("Element not found");
                    }
                    break;
                case 3:
                    System.out.println("Enter the element to be inserted: ");
                    name=sc.nextLine();
                    System.out.println("Enter the index to insert: ");
                    index=sc.nextInt();
                    fruits=insert(fruits, name, index);
                    break;
                case 4:
                    System.out.println("Enter the element to be deleted: ");
                    name=sc.nextLine();
                    fruits=delete(fruits,name);
                    break;
                case 5:
                    System.out.println("Enter the element to be updated: ");
                    name=sc.nextLine();
                    System.out.println("Enter the index of the element: ");
                    index= sc.nextInt();
                    fruits=update(fruits,name,index);
                    break;
                case 6:
                    System.exit(0);    
                default:
                    System.out.println("Enter the valid choice...!");    
            }
        }

    }
}