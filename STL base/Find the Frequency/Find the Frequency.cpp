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
	    vector<int> v;

	    // Taking vector element input
	    for(int i = 0;i<N;i++){
	        int k;
	        cin >> k;
	        v.push_back(k);
	    }

	    // element whose frequency to be find
	    int x;
	    cin >> x;

	    cout << findFrequency(v, x) << endl;
	}

	return 0;
}
int findFrequency(vector<int> v, int x){
    return count(v.begin(), v.end(), x);
}
