#include <iostream>
#include <climits>
using namespace std;

int main(){
    // int marks[5] = {12,34,45,67,89};
    // cout<< marks[0]<<endl;

    // for(int i=0;i<5;i++){
    //     cout<<marks[i]<<endl;
    // }




    // find smallest/lagest element in an array
    int nums[6] = {34,56,12,32,78,90};
    int maxVal = INT_MIN;
    for(int i=0;i<6;i++){
        // if(maxVal<nums[i]){
        //     maxVal=nums[i];
        // }
        maxVal = max(maxVal, nums[i]);
    }
    cout<< maxVal<< endl;
    return 0;
}