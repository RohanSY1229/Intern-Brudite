# You are developing a program that analyzes weather data. Write a Python function
# that takes a list of temperature readings for a specific location and determines the
# average temperature, highest temperature, and lowest temperature.
# Input
# temperature_readings = [25, 28, 21, 24, 27]
# Output:
# Average Temperature: 25.0
# Highest Temperature: 28
# Lowest Temperature: 21

def readings(temperatures):

    avg_temp = sum(temperatures) / len(temperatures)
    max_temp = max(temperatures)
    min_temp = min(temperatures)

    print("Average Temperature:", avg_temp)
    print("Highest Temperature:", max_temp)
    print("Lowest Temperature:", min_temp)

temperatures = [25, 28, 21, 24, 27]
print(readings(temperatures))