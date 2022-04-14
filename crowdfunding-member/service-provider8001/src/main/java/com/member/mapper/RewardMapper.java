package com.member.mapper;

import com.member.entities.po.RewardPO;
import com.member.entities.po.RewardPOExample;
import java.util.List;

import com.member.entities.vo.RewardVO;
import org.apache.ibatis.annotations.Param;

public interface RewardMapper {

    int insertBatch(@Param("rewardPOList") List<RewardPO> rewardPOList, @Param("projectId") Integer projectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward
     *
     * @mbg.generated Wed Apr 13 21:45:49 CST 2022
     */
    long countByExample(RewardPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward
     *
     * @mbg.generated Wed Apr 13 21:45:49 CST 2022
     */
    int deleteByExample(RewardPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward
     *
     * @mbg.generated Wed Apr 13 21:45:49 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward
     *
     * @mbg.generated Wed Apr 13 21:45:49 CST 2022
     */
    int insert(RewardPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward
     *
     * @mbg.generated Wed Apr 13 21:45:49 CST 2022
     */
    int insertSelective(RewardPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward
     *
     * @mbg.generated Wed Apr 13 21:45:49 CST 2022
     */
    List<RewardPO> selectByExample(RewardPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward
     *
     * @mbg.generated Wed Apr 13 21:45:49 CST 2022
     */
    RewardPO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward
     *
     * @mbg.generated Wed Apr 13 21:45:49 CST 2022
     */
    int updateByExampleSelective(@Param("record") RewardPO record, @Param("example") RewardPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward
     *
     * @mbg.generated Wed Apr 13 21:45:49 CST 2022
     */
    int updateByExample(@Param("record") RewardPO record, @Param("example") RewardPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward
     *
     * @mbg.generated Wed Apr 13 21:45:49 CST 2022
     */
    int updateByPrimaryKeySelective(RewardPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward
     *
     * @mbg.generated Wed Apr 13 21:45:49 CST 2022
     */
    int updateByPrimaryKey(RewardPO record);
}