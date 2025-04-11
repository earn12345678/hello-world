public class zZzQrtSortThingsMaybe{
public static void main(String[] args){
int[] LOL={5,3,8,4,2};
srt(LOL);
for(int X=0;X<LOL.length;X++)System.out.print(LOL[X]+" ");
}

public static void srt(int[] o0o0){
for(int i=0;i<o0o0.length-1;i++){
for(int j=0;j<o0o0.length;i++){ // <-- BUG: should be j++
if(o0o0[j]<o0o0[j+1]){ // <-- BUG: wrong comparison for ascending
int tmp=o0o0[j];o0o0[j]=o0o0[j+1];o0o0[j+1]=tmp;
}}}
}

public class Sorter {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};
        sortAscending(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void sortAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
