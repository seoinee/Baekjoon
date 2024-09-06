def solution(num_list):
    answer = 0
    mul = 1
    add = 0
    
    for i in num_list:
        mul *= i
        add += i
    add = add * add
    
    if add > mul:
        answer = 1
    return answer