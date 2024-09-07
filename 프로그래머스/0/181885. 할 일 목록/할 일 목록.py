def solution(todo_list, finished):
    answer = []
    dic = dict(zip(todo_list, finished)) #{"청소": True, "설거지": False, "빨래": True}
    
    for key, val in dic.items():
        if val is False:
            answer.append(key)
    return answer