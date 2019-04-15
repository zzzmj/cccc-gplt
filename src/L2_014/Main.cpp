#include<stdio.h>
int main() {
    int n;
    scanf("%d", &n);
    int a[100005];
    int cnt = 0;
    for (int i = 0; i < n; i++) {
        int t;
        scanf("%d", &t);
        // 第一次和列车队列最小值小于当前值，则需要重开 
        if (i == 0 || a[cnt-1] < t) {
            a[cnt++] = t;
        } else {
            // 二分查找最小值 
            int lo = 0, hi = cnt;
            while(lo < hi) { 
                int mid = (lo + hi) / 2;
                if (a[mid] < t) lo = mid + 1;
                else hi = mid;
            }
            a[lo] = t;
        }
    }
    printf("%d\n", cnt);
}