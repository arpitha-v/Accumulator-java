# Accumulator

About Accumulator
-------------
Accumulates one or more variables together and maintains a running sum of the
elements.
 Updates to this total sum are done via the accumulate method.
 The current value of the running total is returned by calling getTotal.
 The initial value of the running sum is 0.The total sum can be set to 0 by calling reset.

Concurrency Tests
-----------------
Used vmlens library to test Multi threaded scenario.

Build:
------
use 'mvn clean' to clean the project.
And 'mvn install' to build and run the unit test cases.

Coverage Report:
----------------
Once 'mvn install' is run can find the coverage report,
under :   'Accumulator_java/target/site/cobertura/index.html'
