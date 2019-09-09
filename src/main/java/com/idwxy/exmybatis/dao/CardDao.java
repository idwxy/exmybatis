package com.idwxy.exmybatis.dao;

import com.idwxy.exmybatis.entity.Card;

import java.util.List;

public interface CardDao {

    /**
     * 通过 id 查找 card
     * @param id
     * @return
     */
    Card selectById(Integer id);

    /**
     * 模糊查找 card
     * @param card
     * @return
     */
    List<Card> fuzzySearch(Card card);

    /**
     * 查询所有 card
     * @return
     */
    List<Card> selectAll();

    /**
     * 通过 level 查找 card
     * @param levels
     * @return
     */
    List<Card> selectByLevelId(List<Integer> levels);

    /**
     * 创建 card
     * @param card
     * @return
     */
    int insert(Card card);

    /**
     * 通过 id 跟新 card 信息
     * @param card
     * @return
     */
    int update(Card card);

    /**
     * 通过 id 删除 card
     * @param id
     * @return
     */
    int delete(Integer id);
}
