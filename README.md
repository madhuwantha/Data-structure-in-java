# bst.traversal


Given a binary search tree (BST), show the order of keys when performing pre-order traversal, in-order traversal, and post-order traversal?

Input Format

The first line contains the number of keys in the tree,

.

The second line contains the keys in the order at which they are inserted in the binary search tree.

Constraints

All keys are integers in the range to

All inserted keys are guaranteed to be unique

Output Format

Three lines, as follows:

The first line contains the keys in pre-order traversal

The second line contains the keys in in-order traversal

The third line contains the keys in post-order traversal

Sample Input 0

10
12 8 9 20 7 21 22 18 6 19

Sample Output 0

12 8 7 6 9 20 18 19 21 22 
6 7 8 9 12 18 19 20 21 22 
6 7 9 8 19 18 22 21 20 12 



# dequeue

A dequeue is a double-ended queue, in which the items can be added to or removed from the head or the tail. The dequeue APIs are shown in the below code. Your task is to write the implementation of each function.

For simplicity, we will assume all items stored in the dequeue are integers.

Note: Do not modify the main function.

Note: Do not import (or include) any libraries from Java or C++.

Note: All APIs must be O(1)

Hint: use double linked-list implementation.

Input Format

The first line contains the number of queries.

Each of the following lines contains a query (see the sample test cases).

Constraints

It is guaranteed that the number of queries will not exceed

.

It is guaranteed that all test cases will never cause underflow.

Output Format

The output of each querey (if any).

Sample Input 0

11
addFirst 3
addFirst 7
addLast 4
addLast 2
addFirst 1
addLast 9
removeLast
removeLast
removeFirst
removeFirst
isEmpty

Sample Output 0

9
2
1
7
No

Sample Input 1

7
addLast 6
addLast 7
addFirst 8
removeFirst
removeFirst
removeFirst
isEmpty

Sample Output 1

8
6
7
Yes




# three.arr.heap



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







