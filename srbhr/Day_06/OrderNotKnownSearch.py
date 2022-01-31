def rev_binary_search(arr: list, start: int, end: int, elem: int) -> int:
    while(start <= end):
        mid = start+(end-start)//2
        if arr[mid] == elem:
            return mid
        elif arr[mid] > elem:
            start = mid+1
        else:
            end = mid-1
    return -1


def binary_search(arr: list, start: int, end: int, elem: int) -> int:
    while(start <= end):
        mid = start+(end-start)//2
        if arr[mid] == elem:
            return mid
        elif arr[mid] > elem:
            end = mid-1
        else:
            start = mid+1
    return -1


def check_which_search(arr: list, start: int, end: int, elem: int) -> int:
    if len(arr) == 1:
        if arr[0] == elem:
            return 0
    elif len(arr) == 2:
        if arr[0] == elem:
            return 0
        if arr[1] == elem:
            return 1
    else:
        if start < end:
            return binary_search(arr, start, end, elem)
        else:
            return rev_binary_search(arr, start, end, elem)


# arr = [1, 4, 5, 6, 7, 8, 9, 12, 15]
arr = [51, 45, 36, 27, 25, 21, 17, 15, 12, 9,
       8, 7, 4, 4, 3, 3, 3, 3, 3, 3, 3, 2, 2, 1]
start = 0
end = len(arr)
elem = 3
print(rev_binary_search(arr, start, end, elem))
