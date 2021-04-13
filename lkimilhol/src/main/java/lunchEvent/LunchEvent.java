package lunchEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LunchEvent {
    private int memberCnt;
    private final List<Member> memberList;
    private int groupCnt;
    private Member botanist;

    public LunchEvent(int memberCnt) {
        this.memberCnt = memberCnt;
        memberList = new ArrayList<>();
    }

    public List<Member> choiceLunchGroup() {
        if (hasBotanist()) {
            this.botanist = selectMember();
            this.memberCnt--;
        }

        while (memberList.size() < this.memberCnt) {
            memberList.add(selectMember());
        }
        return this.memberList;
    }

    public void printLunchGroup() {
        System.out.print("식물 담당자: ");
        System.out.println(this.botanist == null ? "없음" : this.botanist.getName());
        System.out.println();
        for (int i = 1; i <= this.groupCnt; i++) {
            System.out.println("[" + i + "조]");
            printLunchMember(i);
        }
    }

    private void printLunchMember(int i) {
        this.memberList.stream().filter(member -> member.getGroupNumber() == i).forEach(member -> System.out.println(member.getName()));
    }

    protected Member selectMember() {
        int idx = getRandomIndex();
        Member member = new Member(getMemberName(idx), getGroupNumber());
        removePeopleIndex(idx);
        return member;
    }

    private int getRandomIndex() {
        return new Random().nextInt(Constant.PEOPLE_LIST.size());
    }

    private int getGroupNumber() {
        int currentGroupCnt = getCurrentGroupCnt();
        increaseGroupCnt(currentGroupCnt);
        return currentGroupCnt;
    }

    protected int getCurrentGroupCnt() {
        return (this.memberList.size() / Constant.GROUP_CNT) + 1;
    }

    private void increaseGroupCnt(int currentGroupCnt) {
        if (this.groupCnt < currentGroupCnt) {
            this.groupCnt = currentGroupCnt;
        }
    }

    protected boolean hasBotanist() {
        return this.memberCnt % Constant.GROUP_CNT != 0 && this.memberCnt > 1;
    }

    private String getMemberName(int idx) {
        return Constant.PEOPLE_LIST.get(idx);
    }

    private void removePeopleIndex(int idx) {
        Constant.PEOPLE_LIST.remove(idx);
    }
}