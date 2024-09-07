def solution(myString):
    answer = []
    tmp = myString.split("x")
    for i in tmp:
        answer.append(len(i))
    return answer