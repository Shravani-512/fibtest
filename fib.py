def fibonacci(n):
    fib_series = [0, 1]
    while len(fib_series) < n:
        fib_series.append(fib_series[-1] + fib_series[-2])
    return fib_series

# Number of terms in Fibonacci series
terms = 10  # You can change this value to generate more terms

# Generate and print the Fibonacci series
print(f"The first {terms} terms of the Fibonacci series are: {fibonacci(terms)}")
