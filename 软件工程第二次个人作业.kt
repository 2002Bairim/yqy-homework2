#include <stdio.h>
#include <stdlib.h>
int maxSubarraySum(int arr[], int n) {
    int maxSum = 0;
    int currSum = 0;
    for (int i = 0; i < n; i++) {
        currSum += arr[i];
        if (currSum < 0) {
            currSum = 0;
        }
        if (currSum > maxSum) {
            maxSum = currSum;
        }
    }
    return maxSum;
}
int main() {
    int n;
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);
    int* arr = (int*)malloc(n * sizeof(int));
    if (arr == NULL) {
        printf("Memory allocation failed.\n");
        return 1;
    }
    printf("Enter the elements of the array:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    int maxSum = maxSubarraySum(arr, n);
    printf("The maximum subarray sum is: %d\n", maxSum);
    free(arr);
    return 0;
}