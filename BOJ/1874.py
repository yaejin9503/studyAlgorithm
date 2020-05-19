# 문제 풀이 핵심 아이디어

# 스택에 원소를 삽입 할 때는,특정 수에 도달 할 때까지 삽입
# 스택에서 원소를 연달아 빼낼 때 내림차순을 유지할 수 있는 지 확인

n = int(input())

count = 1
stack = []
result = []

for i in range(1, n+1): # 데이터의 갯수만큼 반복
    data = int(input())
    while count <= data: # 입력 받은 데이터에 도달 할 때까지 삽입
        stack.append(count)
        count += 1
        result.append('+')
    if stack[-1] == data: # 스택의 최상위 원소가 데이터와 같을 때 출력
        stack.pop()
        result.append('-')
    else:
        print('NO')
        exit(0)

print('\n'.join(result))
