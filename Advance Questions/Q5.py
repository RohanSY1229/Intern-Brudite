# 5. Create a Time class and initialize it with hours and minutes.
# Create a method addTime which should take two Time objects and add them.
# E.g.- (2 hour and 50 min)+(1 hr and 20 min) is (4 hr and 10 min)
# Create another method displayTime which should print the time.
# Also create a method displayMinute which should display the total minutes in the
# Time.
# E.g.- (1 hr 2 min) should display 62 minutes

class Time:
  def __init__(self, hours, minutes):
    self.hours = hours
    self.minutes = minutes

  def addTime(self, other):
    total_hours = self.hours + other.hours
    total_minutes = self.minutes + other.minutes
    
    if total_minutes >= 60:
      total_hours += 1
      total_minutes -= 60
    return Time(total_hours, total_minutes)

  def displayTime(self):
    print(f"{self.hours} hours and {self.minutes} mins")

  def displayMinute(self):
    total_minutes = self.hours * 60 + self.minutes
    print(f"{total_minutes} mins")

time1 = Time(2, 50)
time2 = Time(1, 20)
time3 = time1.addTime(time2)

time3.displayTime()
time3.displayMinute()