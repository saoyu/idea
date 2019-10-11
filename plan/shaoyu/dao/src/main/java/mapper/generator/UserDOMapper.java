package mapper.generator;

import com.iwhalecloud.server.dao.dataobject.generator.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 *
 * @author leeshoayu
 * @date 2019/8/22
 * @version 1.0
 */
@Component
@Mapper
public interface UserDOMapper {

    /**
     * 根据主键删除用户
     * @param id
     * @return int
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 新增用户
     * @param record
     * @return int
     */
    int insert(UserDO record);

    /**
     * 新增用户
     * @param record
     * @return int
     */
    int insertSelective(UserDO record);

    /**
     * 通过主键查询用户
     * @param id
     * @return UserDO
     */
    UserDO selectByPrimaryKey(Long id);

    /**
     * 通过主键更新用户
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(UserDO record);

    /**
     * 通过主键更新用户
     * @param record
     * @return int
     */
    int updateByPrimaryKey(UserDO record);
}