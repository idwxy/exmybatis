package com.idwxy.exmybatis.controller;

import com.idwxy.exmybatis.common.ResultObject;
import com.idwxy.exmybatis.entity.Card;
import com.idwxy.exmybatis.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardService cardService;

    // 创建 card
    @PostMapping("/add")
    public ResultObject add(@RequestBody Card card) {
        int result = cardService.insertCard(card);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", result);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 删除 card
    @DeleteMapping("/delete/{id}")
    public ResultObject delete(@PathVariable Integer id) {
        int result = cardService.deleteCard(id);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", result);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 更新 card
    @PutMapping("/modify")
    public ResultObject modify(@RequestBody Card card) {
        int result = cardService.updateCard(card);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", result);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 通过 id 查询 card
    @GetMapping("/find/{id}")
    public ResultObject find(@PathVariable Integer id) {
        Card card = cardService.selectCardById(id);
        Map<String, Card> map = new HashMap<>();
        map.put("card", card);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 查询所有 Card
    @GetMapping("/findAll")
    public ResultObject findAll() {
        List<Card> cards = cardService.selectAllCard();
        Map<String, List<Card>> map = new HashMap<>();
        map.put("cards", cards);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 模糊查询 card
    @PostMapping("/fuzzySearch")
    public ResultObject fuzzySearch(Card card) {
        List<Card> cards = cardService.fuzzySearch(card);
        Map<String, List<Card>> map = new HashMap<>();
        map.put("cards", cards);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 通过 levels 查询
    @PostMapping("/findByLevelId")
    public ResultObject selectCardByLevelId(String levels) {
        System.out.println("levels" + levels);
        System.out.println("levels-length:" + levels.length());

        String[] strings = levels.split(",");
        List<Integer> ids = new ArrayList<>();

        System.out.println("strings" + Arrays.toString(strings));
        System.out.println(strings.length);

        for (int i = 0; i < levels.length(); i++) {
            ids.add(Integer.parseInt(strings[i]));
        }

        System.out.println("ids" + ids);

        List<Card> cards = cardService.selectCardByLevelId(ids);
        Map<String,List<Card>> map = new HashMap<>();
        map.put("card", cards);
        ResultObject resultObject = new ResultObject(200, "sueecss", map);
        return resultObject;
    }
}
