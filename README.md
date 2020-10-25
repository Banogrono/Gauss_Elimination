# Gauss Elimination

This method, characterized by step‐by‐step elimination of the variables, is called Gaussian elimination.
The fundamental idea is to add multiples of one equation to the others in order to eliminate a variable and to continue this process until only one variable is left. Once this final variable is determined, its value is substituted back into the other equations in order to evaluate the remaining unknowns. 
[source](https://www.cliffsnotes.com/study-guides/algebra/linear-algebra/linear-systems/gaussian-elimination)

* This code is partially inspired by:
[This](https://github.com/grimcritter/gaussianEliminationAlgorithm/blob/master/gaussianElimination.java)
[And this](https://github.com/ralphpina/Gaussian-Elimination-with-Partial-Pivoting/blob/master/Gauss.java)

  Outpput with test matrix {{1, 1, -1, 9}, {0, 1, 3, 3}, {-1, 0, -2, 2}}:

 > |    1.0000,     1.0000,    -1.0000  |       |    9.0000   |
 > |    0.0000,     1.0000,     3.0000  |   =   |    3.0000   |
 > |    0.0000,     0.0000,    -6.0000  |       |    8.0000   |
 > X_1 =     0.6667
 > X_2 =     7.0000
 > X_3 =    -1.3333

----
