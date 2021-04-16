import random
import sys

teams = {
    0: '손승우',
    1: '서혜영',
    2: '김다은',
    3: '김고은',
    4: '임세환',
    5: '소은지',
    6: '이희섭',
    7: '박동휘',
    8: '정필성',
    9: '김일호',
    10: '이경주',
    11: '홍대표',
    12: '장재현',
    13: '문희진',
    14: '오병준',
    15: '민경훈',
    16: '한수빈',
    17: '신종인',
    18: '최현이',
    19: '황진경',
    20: '임연정',
    21: '최안현',
    22: '장세미',
    23: '최준영'
}

total = len(teams)

teamKeys = list(range(0, 24))
random.shuffle(teamKeys)
print(teamKeys)
DEFAULT_TEAM_SIZE = 5

try:
    print("묶을려는 명수를 입력하세요!")
    if sys.argv[1] is not None:
        DEFAULT_TEAM_SIZE = sys.argv[1]
except:
    print("묶을려는 명수를 입력하세요! \nex) python react_lunch_generator.py 5")
    DEFAULT_TEAM_SIZE = 5


group = {}
tg = 1
add = 0
for i in teamKeys:
    if add >= int(DEFAULT_TEAM_SIZE):
        add = 0
        tg += 1
    group[teams[i]] = tg
    add += 1

sortGroup = sorted(group.items(), key=lambda item: item[1])

print("여신티켓 임직원 수 : (%s명)" % total)

n = 0
for i, m in sortGroup:
    print(str(m) + "팀 : "+ i)
    n += 1



