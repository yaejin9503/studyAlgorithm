# 문제 풀이 핵심 아이디어 
# 데이터 개수(N <= 100)가 많지 않으므로, 단순히 문제에서 요구하는 대로 구현 
# 현재 리스트에서 가장 큰 수가 앞에 올 때까지 회전 시킨 뒤에 추출 
# 가장 큰 수가 M이면서 가장 앞에 있을 때 프로그램을 종료 

test_case = int(input())

for _ in range(test_case):
    n,m = list(map(int,input().split(' ')))
    queue = list(map(int, input().split(' ')))
    queue = [(i, idx) for idx, i in enumerate(queue)] # 튜플 형태로 저장함 (값, 인덱스)

    count = 0
    while True :
        if queue[0][0] == max(queue, key=lambda x: x[0])[0]:
            count +=1
            if queue[0][1] == m:
                print(count)
                break
            else:
                queue.pop(0)
        else:
            queue.append(queue.pop(0))
