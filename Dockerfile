# Use an official Python runtime as the base image
FROM python:3.9-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Python program into the container
COPY fib.py .

# Command to run the Python program
CMD ["python", "fib.py"]

