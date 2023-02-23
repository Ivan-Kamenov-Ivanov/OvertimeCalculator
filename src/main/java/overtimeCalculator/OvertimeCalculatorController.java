package overtimeCalculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OvertimeCalculatorController {

    @RequestMapping(value = "/")
    public String showInputForm(Model theModel) {

        EmployeeOvertimeData theEmployee = new EmployeeOvertimeData();

        theModel.addAttribute("employee", theEmployee);

        return "inputForm";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("employee") EmployeeOvertimeData theEmployee) {

        double result = (theEmployee.getIncome() / theEmployee.getWorkingHoursInCurrentMonth())
                * theEmployee.getWorkedHours();

                theEmployee.setOvertime(result);

        return "overtimeResult";
    }
}
