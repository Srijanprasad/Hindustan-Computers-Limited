package Assignment1;

import java.util.Scanner;

public class Assignment02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[100];
        int n = 0;
        int choice;

        do
        {
            System.out.println("\n----- ARRAY MENU -----");
            System.out.println("1. Insertion");
            System.out.println("2. Deletion");
            System.out.println("3. Linear Search");
            System.out.println("4. Binary Search");
            System.out.println("5. Maximum Value");
            System.out.println("6. Count Even and Odd");
            System.out.println("7. Insertion Sort");
            System.out.println("8. Display");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();

                    System.out.print("Enter value: ");
                    int value = sc.nextInt();

                    if(pos >= 0 && pos <= n)
                    {
                        for(int i = n; i > pos; i--)
                        {
                            a[i] = a[i - 1];
                        }

                        a[pos] = value;
                        n++;

                        System.out.println("Element inserted");
                    }
                    else
                    {
                        System.out.println("Invalid position");
                    }
                    break;

                case 2:
                    if(n == 0)
                    {
                        System.out.println("Array is empty");
                        break;
                    }

                    System.out.print("Enter position to delete: ");
                    pos = sc.nextInt();

                    if(pos >= 0 && pos < n)
                    {
                        for(int i = pos; i < n - 1; i++)
                        {
                            a[i] = a[i + 1];
                        }

                        n--;
                        System.out.println("Element deleted");
                    }
                    else
                    {
                        System.out.println("Invalid position");
                    }
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();

                    int found = -1;

                    for(int i = 0; i < n; i++)
                    {
                        if(a[i] == value)
                        {
                            found = i;
                            break;
                        }
                    }

                    if(found != -1)
                        System.out.println("Element found at position " + found);
                    else
                        System.out.println("Element not found");

                    break;

                case 4:
                    if(n == 0)
                    {
                        System.out.println("Array is empty");
                        break;
                    }

                    // First sort the array
                    for(int i = 1; i < n; i++)
                    {
                        int key = a[i];
                        int j = i - 1;

                        while(j >= 0 && a[j] > key)
                        {
                            a[j + 1] = a[j];
                            j--;
                        }

                        a[j + 1] = key;
                    }

                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();

                    int low = 0;
                    int high = n - 1;
                    found = -1;

                    while(low <= high)
                    {
                        int mid = (low + high) / 2;

                        if(a[mid] == value)
                        {
                            found = mid;
                            break;
                        }
                        else if(a[mid] < value)
                        {
                            low = mid + 1;
                        }
                        else
                        {
                            high = mid - 1;
                        }
                    }

                    if(found != -1)
                        System.out.println("Element found at position " + found);
                    else
                        System.out.println("Element not found");

                    break;

                case 5:
                    if(n == 0)
                    {
                        System.out.println("Array is empty");
                        break;
                    }

                    int max = a[0];

                    for(int i = 1; i < n; i++)
                    {
                        if(a[i] > max)
                            max = a[i];
                    }

                    System.out.println("Maximum value = " + max);
                    break;

                case 6:
                    int even = 0;
                    int odd = 0;

                    for(int i = 0; i < n; i++)
                    {
                        if(a[i] % 2 == 0)
                            even++;
                        else
                            odd++;
                    }

                    System.out.println("Even numbers = " + even);
                    System.out.println("Odd numbers = " + odd);
                    break;

                case 7:
                    for(int i = 1; i < n; i++)
                    {
                        int key = a[i];
                        int j = i - 1;

                        while(j >= 0 && a[j] > key)
                        {
                            a[j + 1] = a[j];
                            j--;
                        }

                        a[j + 1] = key;
                    }

                    System.out.println("Array sorted");
                    break;

                case 8:
                    System.out.println("Array elements:");

                    for(int i = 0; i < n; i++)
                    {
                        System.out.print(a[i] + " ");
                    }

                    System.out.println();
                    break;

                case 9:
                    System.out.println("Program ended");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 9);

        sc.close();
    }
}