#include<iostream>
#include<vector>
using namespace std;

int binarySearch(vector<int> arr, int target){
    int start = 0;
    int end = arr.size()-1;

    while(start<=end){
        int mid=(start+end)/2;
        if(arr[mid]>target){
            end=mid-1;
        }
        else if(arr[mid]<target){
            start=mid+1;
        }
        else{
            return mid;
        }

    }
    return -1;
}

int main(){
    vector<int> arr = {1,2,3,4,5,6,7,8,9};
    int target = 6;

    cout <<"Element found at index: " << binarySearch(arr, target) << endl;
    return 0;
}