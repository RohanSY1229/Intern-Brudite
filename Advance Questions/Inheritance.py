# Single 
class Animal:
    def __init__(self,name):
        self.name = name

    def speak(self):
        pass

class Lion(Animal):

    def speak(self):
        print(f"{self.name} Roars!!!")

bruno = Lion("Simba")
bruno.speak()

# multiple

class Bird():
    def __init__(self) -> None:
        pass

class Mutated(Lion,Bird):
    def body(self):
        print(f"{self.name} has lions body with wings")

grif = Mutated("Griffin")
grif.body()

# Multilevel
class Thing:
    def __init__(self, name):
        self.name = name

class Toys(Thing):
    def play(self):
        print("We play with toys")

class Rubic(Toys):
    def solve(self):
        print(f"We solve {self.name}")
    
obj = Rubic("Rubics Cube")
obj.solve()