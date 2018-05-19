package exercise;

import java.util.Calendar;


public class Canlen {

	public static void main(String args[]) {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int today = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "年" + (month + 1) + "月" + today + "日");

		char str[] = "日一二三四五六".toCharArray();
		for (char c : str) {
			System.out.printf("%5c", c);// 输出的char型数据占5列（以字节来算，每个人的电脑都不一样）
		}
		System.out.println();
		// 设置日历为当前月第一天
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		// 获取本月1号是星期几
		int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekDay);
		// 获得一周的第一天
		int firstDayOfWeek = calendar.getFirstDayOfWeek();

		// 确定一号之前的都是空格符
		int a = 0;
		while (weekDay != firstDayOfWeek) {
			a++;
			calendar.add(Calendar.DAY_OF_MONTH, -1);
			weekDay = calendar.get(Calendar.DAY_OF_WEEK);
			System.out.print(weekDay);
			

		}
		System.out.println();
		
		//do-while先执行一次循环体，再看表达式进行判断
		do {
			// 天数加1
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			// 获取星期
			weekDay = calendar.get(Calendar.DAY_OF_WEEK);
			System.out.print(weekDay);

		} while (weekDay != firstDayOfWeek);
		
		

		// 输出一号之前的空格符
		for (int i = 1; i <= a; i++) {
			System.out.print("    ");
		}

		// 设置当月第一天
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		do {
			// 获取日期
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			// 打印日期
			System.out.printf("%3s", day);
			// 设置打印的格式，如果是今天就在后面输出*
			if (day == today) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			// 增加天数，循环
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			// 获取当前日期的周数
			weekDay = calendar.get(Calendar.DAY_OF_WEEK);
			// 如果是第一天就换行
			if (weekDay == firstDayOfWeek) {
				System.out.println();
			}
		} while (calendar.get(Calendar.MONTH) == month);
	}
}
