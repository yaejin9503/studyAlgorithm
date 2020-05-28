```
def solution(s):
    answer = True
    count =0 
    ycount =0 

    for index in s: 
        if index == 'p': 
            count += 1
        elif index =='P':
            count +=1 
        elif index =='Y':
            ycount +=1
        elif index =='y':
            ycount +=1 

    if count == ycount:
        return True

    return False
```

```
def numPY(s):
    return s.lower().count('p') == s.lower().count('y')
```

<h6>너무 간단해서 올리기 싫었는디,,,ㅎ,,나중에 발전 되었을 때 보면,,이럴 때가 있었지 하고 추억하지 않을까,,</h6>
