public static void main(String args[]) {
  int A[]={1,2,3,3,4,5,6,7};
  int B[]= {3,3,4,4,5,8};

  ArrayList<Integer> ans=new ArrayList<>();

  int i = 0, j = 0; // to traverse the arrays

  while (i < A.length && j < B.length) {
    if (A[i] < B[j]) { //if current element in i is smaller
      i++;
    } else if (B[j] < A[i]) {
      j++;
    } else {
      ans.add(A[i]); //both elements are equal
      i++;
      j++;
    }
  }
  System.out.print("The elements are: ");
  for (i = 0; i < ans.size(); i++) {
    System.out.print(ans.get(i)+" ");
  }
}