package com.idwxy.exmybatis.service.impl;

import com.idwxy.exmybatis.dao.CardDao;
import com.idwxy.exmybatis.entity.Card;
import com.idwxy.exmybatis.service.CardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Resource
    private CardDao cardDao;

    @Override
    public int insertCard(Card card) {

        return cardDao.insert(card);
    }

    @Override
    public int deleteCard(Integer id) {

        return cardDao.delete(id);
    }

    @Override
    public int updateCard(Card card) {

        return cardDao.update(card);
    }

    @Override
    public Card selectCardById(Integer id) {

        return cardDao.selectById(id);
    }

    @Override
    public List<Card> selectAllCard() {

        return cardDao.selectAll();
    }

    @Override
    public List<Card> fuzzySearch(Card card) {

        return cardDao.fuzzySearch(card);
    }

    @Override
    public List<Card> selectCardByLevelId(List<Integer> levels) {

        return cardDao.selectByLevelId(levels);
    }
}
