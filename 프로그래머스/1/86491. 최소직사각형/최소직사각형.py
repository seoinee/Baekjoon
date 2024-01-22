def solution(sizes):
    answer = 0
    _min = 0
    
    for l in sizes:
        if l[0] < l[1]:
            temp = l[0]
            l[0] = l[1]
            l[1] = temp
            
    for l in sizes:
        if l[0] > _min:
            _min = l[0]
    
    for l in sizes:
        if l[1] > answer:
            answer = l[1]
            
    answer = answer * _min
            
    return answer