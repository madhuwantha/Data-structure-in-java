A 3-ary heap is like a binary heap, except that each node has three childrens, instead of two. In this challenge, you are required to implement a 3-ary max-heap. Specifically, you need to complete the implementation of the two APIs (insert and deleteMax) in below.

For simplicity, we will assume all items stored in the 3-array heap are integers.

Note: Do not modify the main function.

Note: Do not import (or include) any libraries from Java or C++.

Note: All APIs must be O(

)

Input Format

The first line contains the number of queries to the 3-ary heap.

Each of the following lines contains a query (see the sample test cases).

Constraints

It is guaranteed that the number of queries will not exceed

.

It is guaranteed that all test cases will never cause underflow.

Output Format

The output of each querey (if any).

Sample Input 0

7
insert 7
insert 8
insert 9
insert 6
insert 4
delMax
delMax

Sample Output 0

9
8

Sample Input 1

18
insert 20
insert 21
insert 29
insert 30
insert 25
delMax
insert 33
insert 31
delMax
delMax
insert 13
insert 10
delMax
delMax
delMax
delMax
delMax
delMax

Sample Output 1

30
33
31
29
25
21
20
13
10

