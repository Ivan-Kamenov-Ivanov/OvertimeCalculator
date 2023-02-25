package overtimeCalculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;

@Controller
public class OvertimeCalculatorController {

    @RequestMapping(value = "/")
    public String showInputForm(Model theModel) {

        EmployeeOvertimeData theEmployee = new EmployeeOvertimeData();

        theModel.addAttribute("employee", theEmployee);

        return "inputForm";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("employee") EmployeeOvertimeData theEmployee) throws ParseException {

        double moneyPerHour = theEmployee.getIncome() / theEmployee.getWorkingHoursInCurrentMonth();

        int overtime = theEmployee.getWorkedHours() - theEmployee.getWorkingHoursInCurrentMonth();

        if (overtime <= 0) {
            overtime = 0;
        }

        double result = (double) Math.round((moneyPerHour * theEmployee.getMethodOfPayment()) * overtime);
        theEmployee.setOvertime(result);

        return "overtimeResult";
    }
}
