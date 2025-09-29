// 🧮 Selection Sort kya hota hai?
// Selection Sort ek simple sorting algorithm hai jo list ke smallest (ya largest) element ko dhundh kar usse correct position par rakh deta hai — step by step.
// 🔧 Kaise kaam karta hai?
// Socho tumhare paas ek list hai: [5, 3, 8, 1, 2]
// Step-by-step process:
// - First pass:
// - Puri list mein sabse chhota element dhundo → 1
// - Usse first position ke element 5 se swap karo → [1, 3, 8, 5, 2]
// - Second pass:
// - Baaki list mein sabse chhota element dhundo → 2
// - Usse second position ke element 3 se swap karo → [1, 2, 8, 5, 3]
// - Third pass:
// - Baaki list mein sabse chhota → 3
// - Swap with 8 → [1, 2, 3, 5, 8]
// - Aur aise hi last tak sort ho jata hai ✅
// Chahe list sorted ho ya nahi — Selection Sort har baar pura list scan karta hai.
// ✅ Use kab karein?
// - Jab list chhoti ho
// - Jab simplicity chahiye
// - Jab memory kaafi limited ho (kyunki ye in-place sort karta hai)
public class SelectionSort{
    public static void main(String[] args) {
        int arr[] = { 16, 10, 9, 15, 20 };
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int MinIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[MinIndex]) {
                    MinIndex = j;
                }
            }
            int temp = arr[MinIndex];
            arr[MinIndex] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }
}
