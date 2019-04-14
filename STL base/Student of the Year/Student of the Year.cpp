//Initial Template for C++
#include <bits/stdc++.h>
using namespace std;
//Position this line where user code will be pasted.
// Driver code
int main() {

	int testcase;
	cin >> testcase;

	while(testcase--){
	    int N;
	    cin >> N;

	    // Declaring vector
	    vector<pair<string, int>> v;

	    // Taking input to vector
	    for(int i = 0;i<N;i++){
	        string s;
	        cin >> s;
	        int k;
	        cin >> k;
	        v.push_back(make_pair(s, k));
	    }

	    // Calling function
	    v = sortMarks(v, N);

	    // Printing student name with their marks
	    for(auto it = v.begin(); it!=v.end();it++){
	        cout << it->first << " " << it->second << endl;
	    }

	}

	return 0;
}
bool sortinrev(pair<string, int> &a, pair<string, int> &b){
    if(a.second == b.second){
        return (a.first < b.first);
    }
    return (a.second > b.second);
}

vector<pair<string, int>> sortMarks(vector<pair<string, int>> v, int N){
    sort(v.begin(), v.end(), sortinrev);
    return v;
}
