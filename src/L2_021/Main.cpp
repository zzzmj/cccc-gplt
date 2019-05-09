#include<cstdio>
#include<iostream>
#include<algorithm>
#include<map>
#include<set>
using namespace std;
struct user {
    string name;
    int cnt;
    double avg;
};

int cmp (user a, user b) {
    if (a.cnt > b.cnt) return 1;
    else if (a.cnt == b.cnt && a.avg < b.avg) return 1;
    return 0;
}

int main() {
    int n;
    scanf("%d", &n);
    user mp[1005];
    for(int i = 0; i < n; i++) {
        int k;
        string name;
        cin >> name >> k;
        mp[i].name = name;
        set<int> t;
        for (int j = 0; j < k; j++) {
            int f;
            cin >> f;
            t.insert(f);
        }
        mp[i].cnt = t.size();
        mp[i].avg = k*1.0 / t.size();
    }
    sort(mp, mp+n, cmp);
    for (int i = 0; i < n && i < 3; i++) {
        if (i != 0) cout << " ";  
        cout << mp[i].name; 
    }
    
    for (int i = 2-n; i >= 0; i--) {
        cout << " -";
    }
}