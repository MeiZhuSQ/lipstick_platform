package com.ruoyi.project.emmanuel.mto.domain;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户画像表(UserPortrait)表实体类
 *
 * @author makejava
 * @since 2023-04-15 17:18:58
 */
@SuppressWarnings("serial")
@Data
@TableName("t_user_portrait")
public class UserPortrait extends Model<UserPortrait> {
    //主键ID
    private Long id;
    //用户ID
    private Long userId;
    //标签ID
    private String tagId;
    //创建者
    private String createBy;
    //创建时间
    private Date createTime;
    //更新者
    private String updateBy;
    //更新时间
    private Date updateTime;
    //备注
    private String remark;

    }

