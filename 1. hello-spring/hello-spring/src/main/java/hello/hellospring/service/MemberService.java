package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRespository;

import java.util.List;
import java.util.Optional;

public class MemberService {
    private final MemberRespository memberRespository;

    public MemberService(MemberRespository memberRespository) {
        this.memberRespository = memberRespository;
    }


    public Long join(Member member){
        validateDuplicateMember(member);
        memberRespository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRespository.findByName(member.getName())
                .ifPresent(m ->{
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    public List<Member> findMembers() {
        return memberRespository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRespository.findById(memberId);
    }
}
