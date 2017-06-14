import java.util.*;
class SortedArray
{
public static void main(String args[])
{
  int arr1[]=new int[args.length];
  int arr2[]=new int[args.length];
  for(int i=0;i<args.length;i++)
  {
    arr1[i]=Integer.parseInt(args[i]);
    arr2[i]=arr1[i];
  }
  Arrays.sort(arr2);
  if(Arrays.equals(arr1,arr2))
     System.out.println("SORTED ORDER");
  else
     System.out.println("NOT SORTED");
    }
  }
