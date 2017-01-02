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
