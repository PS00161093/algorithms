## Dynamic Programming (DP) ## 
is a programming paradigm that can systematically and efficiently explore all possible solutions to a problem. As such, it is capable of solving a wide variety of problems that often have the following characteristics:
- The problem can be broken down into "overlapping subproblems" - smaller versions of the original problem that are re-used multiple times.
- The problem has an "optimal substructure" - an optimal solution can be formed from optimal solutions to the overlapping subproblems of the original problem.

- These attributes may seem familiar to you. Greedy problems have optimal substructure, but not overlapping subproblems. Divide and conquer algorithms break a problem into subproblems, 
but these subproblems are not overlapping (which is why DP and divide and conquer are commonly mistaken for one another).
- Dynamic programming is a powerful tool because it can break a complex problem into manageable subproblems, avoid unnecessary recalculation of overlapping subproblems,
and use the results of those subproblems to solve the initial complex problem.
- DP not only aids us in solving complex problems, but it also greatly improves the time complexity compared to brute force solutions.
For example, the brute force solution for calculating the Fibonacci sequence has exponential time complexity,
while the dynamic programming solution will have linear time complexity because it reuses the results of subproblems rather than recalculating the results for previously seen subproblems.
