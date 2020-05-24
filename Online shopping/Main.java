#include<iostream>
using namespace std;
int main()
{
  int fam,fdis,fship,sam,sdis,sship,aam,adis,aship;
  int amzcst,snapcst,flipcst,d1,d2,d3;
  std::cin>>fam>>fdis>>fship>>sam>>sdis>>sship>>aam>>adis>>aship;
 d1=(fam*fdis)/100;
  d2=(sam*sdis)/100;
  d3=(aam*adis)/100;
  flipcst=fam-d1+fship;
  snapcst=sam-d2+sship;
  amzcst=aam-d3+aship;
 
 std::cout<<"In Flipkart Rs."<<flipcst<<"\n"<<"In Snapdeal Rs."<<snapcst<<"\n"<<"In Amazon Rs."<<amzcst<<"\n";
  if(flipcst<=snapcst && flipcst<=amzcst)
    std::cout<<"He will prefer Flipkart";
  else if(snapcst<=flipcst && snapcst<=amzcst)
    std::cout<<"He will prefer Snapdeal";
  else
    std::cout<<"He will prefer Amazon";
}