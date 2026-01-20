package A2Z_Sheet.Step3.Lec1;

import java.util.ArrayList;

public class Union {
    static ArrayList<Integer> union(int[] a, int[] b){
        int n1 = a.length;
        int n2 = b.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> Union = new ArrayList<>();
        while (i<n1 && j<n2){
            if (a[i] <= b[j]){
                if (Union.size() == 0 || Union.get(Union.size()-1) != a[i])
                    Union.add(a[i]);
                i++;
            }else {
                if (Union.size() == 0 || Union.get(Union.size()-1) != b[j])
                    Union.add(b[j]);
                j++;
            }
        }
        while (i < n1) {
            if (Union.size() == 0 || Union.get(Union.size()-1) != a[i])
                Union.add(a[i]);
            i++;
        }
        while (j<n2){
            if (Union.size() == 0 || Union.get(Union.size()-1) != b[j])
                Union.add(b[j]);
            j++;
        }

        return Union;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = union(arr1, arr2);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");

    }
}
