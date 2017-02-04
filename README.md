# Banker's Algorithm
[Wikipedia Reference](https://en.wikipedia.org/wiki/Banker's_algorithm)

## Introduction
The Banker's algorithm, sometimes referred to as the avoidance algorithm, is a resource allocation and deadlock avoidance algorithm developed by Edsger Dijkstra that tests for safety by simulating the allocation of predetermined maximum possible amounts of all resources, and then makes an "s-state" check to test for possible deadlock conditions for all other pending activities, before deciding whether allocation should be allowed to continue.

## Terms used
1. Process
  * max resource needed
  * allocated resource
2. Resource
  * resource free
  * total resource allocated
3. States
  * Deadlock
  * Running / Pending
  * Done
