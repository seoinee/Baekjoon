def solution(arr1, arr2):
    answer = 0
    add1 = 0
    add2 = 0
    
    if len(arr1) > len(arr2):
        answer = 1
    elif len(arr1) < len(arr2):
        answer = -1
    else:
        for i in arr1:
            add1 += i
        for i in arr2:
            add2 += i
        if add1 > add2:
            answer = 1
        elif add1 < add2:
            answer = -1
        else:
            answer = 0
    return answer