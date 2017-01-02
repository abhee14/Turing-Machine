# Turing-Machine

This program simulates a Turing machine M on input string w. Turing machine M could be non-
deterministic, and therefore, the program simulates all possible copies of the machine. A copy of M
could run for a very long time or forever. In order to limit the program running time, the program
runs each copy of M for at most 20 transitions (starting from the first transition from the start state).

• The program prints out exactly “M stops and accepts w” (without the quotes), if at least one
copy of M stops and accepts w with at most 20 transitions.

• It prints out exactly “M stops and rejects w” (without the quotes), if every copy of
M stops and rejects w with at most 20 transitions.

• It prints out exactly “M is still running” (without the quotes), in all other cases.

The input to your program is an encoding string < M, w > of a Turing machine M and a string w.
The encoding string < M, w > must be read from the standard input. The input alphabet Σ is {a, b},
the tape alphabet Γ is {a, b, ⊔}, state q0 is the start state, state qa is the accept state, and state
qr is the reject state. The additional states of M are named q1, q2, ....q9 (i.e., at most 9 additional
states). 

Here is a sample encoding string from one of the testcases, that represents the running
of a turing machine

#q0,a->qa,a,R#q0,a->q1,a,R#q0,b->q1,b,R#q0,_->q1,_,R#q1,b->q1,b,R
#q1,_->q1,_,R#q1,a->qr,a,R#q1,b->qr,b,R##ab#

An encoding string < M, w > is a single line with no more than 1024 characters. The blank
symbol ⊔ is denoted by symbol _ in an encoding string. The empty string w = ε is denoted by
symbol e in an encoding string. The Turing machine M given in an encoding string < M, w > is
always valid (to simplify the project).

For each input, the following five lines are printed
• Line 1: The encoding string of Turing machine M . 

• Line 2: The input string w. 

• Line 4: Total number of states of Turing machine M . 

• Line 5: Whether M accepts w 

