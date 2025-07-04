/*Find Duplicate Elements in an Array
Objective:
Write a program that prints all duplicate elements in an array (if any).

Example Input:
int[] items = {1, 5, 3, 1, 2, 3, 4};
Expected Output:
Duplicates: 1, 3     */




public class FindDuplicates {
    public static void main(String[] args) {
        int[] items = {1, 5, 3, 1, 2, 3, 4};

        System.out.print("Duplicates: ");
        boolean foundDuplicate = false;

        for (int i = 0; i < items.length; i++) {
            for (int j = i + 1; j < items.length; j++) {
                if (items[i] == items[j]) {
                    // Check if it's already printed
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (items[k] == items[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (!alreadyPrinted) {
                        System.out.print(items[i] + " ");
                        foundDuplicate = true;
                    }
                }
            }
        }

        if (!foundDuplicate) {
            System.out.print("None");
        }
    }
}