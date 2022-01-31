
// // interface MountainArray {
// //     public int get(int index) {}

// //     public int length() {}
// // }

// class Solution {
//     public int findInMountainArray(int target, MountainArray arr) {
//         int peakIndex = findPeak(arr);

//         int minIndex = searchIn(arr, target, 0, peakIndex);
//         if (minIndex != -1) {
//             return (minIndex);
//         }
//         return searchDes(arr, target, peakIndex + 1, arr.length() - 1);
//     }

//     public int findPeak(MountainArray arr) {
//         int start = 0;
//         int end = arr.length() - 1;

//         while (start < end) {
//             int mid = start + (end - start) / 2;
//             if (arr.get(mid) > arr.get(mid + 1)) {
//                 end = mid;
//             } else {
//                 start = mid + 1;
//             }
//         }
//         return start;
//     }

//     public int searchIn(MountainArray arr, int target, int start, int end) {

//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (arr.get(mid) == target) {
//                 return mid;
//             } else if (arr.get(mid) > target) {
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }
//         }
//         return -1;
//     }

//     public int searchDes(MountainArray arr, int target, int start, int end) {

//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (arr.get(mid) == target) {
//                 return mid;
//             } else if (arr.get(mid) < target) {
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }
//         }
//         return -1;
//     }
// }
