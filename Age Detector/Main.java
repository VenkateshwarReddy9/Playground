#include<iostream>
using namespace std;
int main()
{
  int dob,curyear,age;
  std::cin>>dob>>curyear;
  if(curyear<dob)
  {
    dob=100-dob;
    age=dob+curyear;
    std::cout<<age;
  }
  else
  {
    age=curyear-dob;
    std::cout<<age;
  }
}