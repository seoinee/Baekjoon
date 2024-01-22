def solution(array, commands):
    answer = []
    
    for i in commands:
        i, j, k = i
        new = array[i-1:j]
        new.sort()
        answer.append(new[k-1])
    return answer