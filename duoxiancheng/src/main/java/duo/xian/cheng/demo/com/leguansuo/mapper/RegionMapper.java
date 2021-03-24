package duo.xian.cheng.demo.com.leguansuo.mapper;


import duo.xian.cheng.demo.com.leguansuo.vo.AbilitySeqTest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Hong-Yang Xiao
 */
@Mapper
public interface RegionMapper {
    @Select("select max(seq_no) from ability_seq_test where service=3")
    int findMax();

    @Update("update ability_seq_test set seq_no=#{seqNo} where id=17 and seq_no<#{seqNo}")
    int update(Integer seqNo);

    @Select("select region_id,region_name from region")
    List<AbilitySeqTest> findIdAndName();

    @Insert("INSERT INTO `ability_seq_test`(`ability_name`, `seq_no`) VALUES (#{abilityName}, #{seqNo})")
    void insert(AbilitySeqTest abilitySeqTest);
}
