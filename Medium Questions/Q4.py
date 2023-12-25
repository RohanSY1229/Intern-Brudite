# 4. Given an array of size N The task is to rotate array by D elements towards right
# Sample Input: arr = [1, 2, 3, 4, 5], D = 2
# Sample Output: arr after rotation = [4, 5, 1, 2, 3]

def rotate_array(arr, d):
  position = 1

  while(position <= d):
    temp = arr[0]

    for i in range (len(arr) - 1):
      arr[i] = arr[i + 1]

    arr[len(arr) - 1] = temp
    position = position + 1
    
  return arr

arr = [1,2,3,4,5]
d = 2
print(rotate_array(arr,d))