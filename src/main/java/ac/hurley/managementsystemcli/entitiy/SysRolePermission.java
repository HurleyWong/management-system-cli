package ac.hurley.managementsystemcli.entitiy;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色权限实体类
 *
 * @author hurley
 */
@Data
public class SysRolePermission implements Serializable {

    @TableId
    private String id;

    private String roleId;

    private String permissionId;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
}
