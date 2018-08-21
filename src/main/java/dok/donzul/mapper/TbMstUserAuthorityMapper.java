package dok.donzul.mapper;

import dok.donzul.entity.TbMstUserAuthority;
import dok.donzul.entity.TbMstUserAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMstUserAuthorityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donzul.tb_mst_user_authority
     *
     * @mbg.generated Tue Aug 21 00:32:08 JST 2018
     */
    long countByExample(TbMstUserAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donzul.tb_mst_user_authority
     *
     * @mbg.generated Tue Aug 21 00:32:08 JST 2018
     */
    int deleteByExample(TbMstUserAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donzul.tb_mst_user_authority
     *
     * @mbg.generated Tue Aug 21 00:32:08 JST 2018
     */
    int deleteByPrimaryKey(Long indexNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donzul.tb_mst_user_authority
     *
     * @mbg.generated Tue Aug 21 00:32:08 JST 2018
     */
    int insert(TbMstUserAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donzul.tb_mst_user_authority
     *
     * @mbg.generated Tue Aug 21 00:32:08 JST 2018
     */
    int insertSelective(TbMstUserAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donzul.tb_mst_user_authority
     *
     * @mbg.generated Tue Aug 21 00:32:08 JST 2018
     */
    List<TbMstUserAuthority> selectByExample(TbMstUserAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donzul.tb_mst_user_authority
     *
     * @mbg.generated Tue Aug 21 00:32:08 JST 2018
     */
    TbMstUserAuthority selectByPrimaryKey(Long indexNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donzul.tb_mst_user_authority
     *
     * @mbg.generated Tue Aug 21 00:32:08 JST 2018
     */
    int updateByExampleSelective(@Param("record") TbMstUserAuthority record, @Param("example") TbMstUserAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donzul.tb_mst_user_authority
     *
     * @mbg.generated Tue Aug 21 00:32:08 JST 2018
     */
    int updateByExample(@Param("record") TbMstUserAuthority record, @Param("example") TbMstUserAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donzul.tb_mst_user_authority
     *
     * @mbg.generated Tue Aug 21 00:32:08 JST 2018
     */
    int updateByPrimaryKeySelective(TbMstUserAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table donzul.tb_mst_user_authority
     *
     * @mbg.generated Tue Aug 21 00:32:08 JST 2018
     */
    int updateByPrimaryKey(TbMstUserAuthority record);
}