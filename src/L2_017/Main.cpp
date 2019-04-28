#include<stdio.h>
#include<iostream>
#include<algorithm>
using namespace std;
int main() {
    int a[100005];
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    sort(a, a+n);
    int s1 = 0, s2 = 0;
    int t = n/2;
    int j = n - t;
    for (int i = 0; i < n; i++) {
        if (i < t) {
            s1 += a[i];
        } else {
            s2 += a[i];
        }
    }
    
    if (n%2 != 0 && t+1 < n) {
        int diff = (s2 - a[t+1]) - (s1 + a[t+1]);
        if (diff > s2 - s1) {
            s2 -= a[t+1];
            s1 += a[t+1];
            t++;
            j--;
        }
    } 
    printf("Outgoing #: %d\n", j);
    printf("Introverted #: %d\n", t);
    printf("Diff = %d\n", s2-s1);

}