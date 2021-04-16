package week04;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MakeLunchGroup {
    private final int MEMBER_COUNT_PER_GROUP = 4;
    private final int MIN_MEMBER_COUNT = 1;
    private final int MAX_MEMBER_COUNT = 30;
    private final String NEW_LINE = "\n";
    private final String MEMBER_DELIMITER = ",";

    private final SecureRandom SECURE_RANDOM = new SecureRandom();

    private final List<String> DEFAULT_MEMBERS = Arrays.asList(
            "일호", "세환", "필성", "동휘", "대리"
            , "은지", "경주", "희섭", "안현", "연정"
            , "종인", "수빈", "재현", "현이", "진경"
            , "희진", "경훈", "병준", "다은", "고은"
            , "해영", "세미", "승우", "나리", "태욱"
            , "창열", "메가", "데이", "자바", "만세"
    );

    private int memberCount;
    private int groupCount;
    private int gardeningMemberCount;

    MakeLunchGroup(int memberCount) {
        this.memberCount = memberCount;

        validateMemberCount();
        calculateGroupCount();
        calculateGardeningMemberCount();
    }



    private void validateMemberCount() {
        if (memberCount < MIN_MEMBER_COUNT) {
            throw new IllegalArgumentException("직원 수는 1명 이상이어야 합니다.");
        }

        if (memberCount > MAX_MEMBER_COUNT) {
            throw new IllegalArgumentException("직원 수는 30명 이하여야 합니다.");
        }
    }

    public void printGroup() {
        List<String> shuffleMemberList = shuffleMemberList();
        int lastIndex = memberCount - gardeningMemberCount;

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < lastIndex; i++) {
            builder.append(shuffleMemberList.get(i));

            if (i < lastIndex - 1) {
                builder.append(MEMBER_DELIMITER);
            }

            boolean isFullGroup = (i + 1) % MEMBER_COUNT_PER_GROUP == 0;
            if (isFullGroup) {
                builder.append(NEW_LINE);
            }
        }

        if (gardeningMemberCount > 0) {
            builder.append(NEW_LINE).append("식물 담당: " + shuffleMemberList.get(lastIndex));
        }

        System.out.println(builder);
    }

    public List<String> shuffleMemberList() {
        List<String> shuffledMemberList = DEFAULT_MEMBERS.stream().collect(Collectors.toList());
        shuffledMemberList.sort(Comparator.comparingInt(o -> SECURE_RANDOM.nextInt()));

        return shuffledMemberList;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public int getGroupCount() {
        return groupCount;
    }

    public int getGardeningMemberCount() {
        return gardeningMemberCount;
    }

    private void calculateGroupCount() {
        groupCount = memberCount / MEMBER_COUNT_PER_GROUP;
    }

    private void calculateGardeningMemberCount() {
        gardeningMemberCount = memberCount % MEMBER_COUNT_PER_GROUP == 0 ? 0 : 1;
    }
}
