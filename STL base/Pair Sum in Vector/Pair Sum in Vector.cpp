//Initial Template for C++
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
void sum(vector<pair<int,int>>v);
//Position this line where user code will be pasted.
int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    vector<pair<int,int>>v; //Making a vector that holds pairs
	    for(int i=0;i<n;i++)
	    {
	        int x,y;
	        cin>>x>>y;
	        v.push_back(make_pair(x,y)); //Pushing a pair in the vector
	    }

	   sum(v); //The sum function

	}
	return 0;
}
void sum(vector<pair<int,int>>v)
{
    long long sum=0;
    for(int i = 0; i < v.size(); i++){
        sum += v[i].second;
    }
    cout<<sum;
    cout<<endl;
}
