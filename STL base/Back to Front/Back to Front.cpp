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

	    // Taking input to vector
	    for(int i = 0;i<N;i++){
	        int k;
	        cin >> k;
	        v.push_back(k);
	    }

	    // Calling function
	    reverseIterator(v.rbegin(), v.rend());

	}

	return 0;
}
void reverseIterator(vector<int>::reverse_iterator it1, vector<int>::reverse_iterator it2){
    while(it1 != it2){
        cout<<*it1<<" ";
        it1++;
    }
    cout<<endl;

}
