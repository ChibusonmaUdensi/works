def main():
    numbers = []

    # Continuously prompt the user for input until they choose to stop
    while True:
        try:
            num = float(input("Enter a number (enter any non-numeric value to stop): "))
            numbers.append(num)
        except ValueError:
            break

    if len(numbers) == 0:
        print("No numbers entered.")
    else:
        # Find the largest and smallest numbers
        largest = max(numbers)
        smallest = min(numbers)

        # Display the largest and smallest numbers
        print(f"Largest number entered: {largest}")
        print(f"Smallest number entered: {smallest}")

if __name__ == "__main__":
    main()