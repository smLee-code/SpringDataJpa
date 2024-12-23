package study.data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import study.data_jpa.entity.Item;
import study.data_jpa.entity.Member;


public interface ItemRepository extends JpaRepository<Item, Long>, JpaSpecificationExecutor<Member> {
}
