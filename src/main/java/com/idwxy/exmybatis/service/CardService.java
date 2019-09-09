package com.idwxy.exmybatis.service;

import com.idwxy.exmybatis.entity.Card;

import java.util.List;

public interface CardService {

    /**
     * 新增 card
     * @param card
     * @return
     */
    int insertCard(Card card);

    /**
     * 通过 id 删除 Card
     * @param id
     * @return
     */
    int deleteCard(Integer id);

    /**
     * 更新卡号
     * @param card
     * @return
     */
    int updateCard(Card card);

    /**
     * 通过 id 查 card
     * @param id
     * @return
     */
    Card selectCardById(Integer id);

    /**
     * 查询所有 card
     * @return
     */
    List<Card> selectAllCard();

    /**
     * 模糊查询 card
     * @param card
     * @return
     */
    List<Card> fuzzySearch(Card card);

    /**
     * 通过 levels 查找card
     * @param levels
     * @return
     */
    List<Card> selectCardByLevelId(List<Integer> levels);
}
