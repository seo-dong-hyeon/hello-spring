package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // 인터페이스로 공통화 할 수 없는 인터페이스만 추가
    // JPQL -> select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
