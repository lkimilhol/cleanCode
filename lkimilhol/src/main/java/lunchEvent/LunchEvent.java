package lunchEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LunchEvent {
    private final int memberCnt;
    private final List<Member> memberList;
    private Member botanist;

    public LunchEvent(int memberCnt) {
        this.memberCnt = memberCnt;
        memberList = new ArrayList<>();
    }

    public List<Member> choiceLunchGroup() {
        while (memberList.size() < this.memberCnt) {
            int idx = getRandomIndex();
            Member member = new Member(getMemberName(idx), getGroupNumber());
            memberList.add(member);
            removePeopleIndex(idx);
        }
        return this.memberList;
    }

    private int getRandomIndex() {
        return new Random().nextInt(Constant.PEOPLE_LIST.size());
    }

    private int getGroupNumber() {
        return this.memberList.size() / Constant.GROUP_CNT + 1;
    }

    protected boolean isBotanist() {
        return this.memberCnt % Constant.GROUP_CNT == 0;
    }

    private String getMemberName(int idx) {
        return Constant.PEOPLE_LIST.get(idx);
    }

    private void removePeopleIndex(int idx) {
        Constant.PEOPLE_LIST.remove(idx);
    }
}