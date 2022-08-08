package com.example.dits.controllers;

import com.example.dits.dto.TestStatisticByUser;
import com.example.dits.service.StatisticService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserStatisticsController {

    private final StatisticService statisticService;

    @GetMapping("/statistics")
    public String userStatistics(Model model, HttpSession session) {
        List<TestStatisticByUser> statistics = new ArrayList<>() {};
        statistics.add(new TestStatisticByUser("Chem", 1, 100));
        statistics.add(new TestStatisticByUser("Maht", 5, 90));
        statistics.add(new TestStatisticByUser("Phiz", 2, 50));

        model.addAttribute("statistics", statistics);
        return "user/personalStatistic";
    }
}
