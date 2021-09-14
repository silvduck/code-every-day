#python

# 1. Find the last element of a list

def myLast(list):
  return list[-1]

print(myLast([1,2,3,4]))


# 2. Find the K'th element of a list. The first element in the list is number 1.

def element_at(list, position):
  return list[position-1]

print(element_at([1,2,3], 2))
