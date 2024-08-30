/**
 * Copyright 2018 人人开源 http://www.renren.io
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.example.demo.service.utils;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * 日期处理
 */
public class DateUtils {

    /**
     * 时间格式(yyyy-MM-dd)
     */
    public final static String DATE_PATTERN_A = "yyyy/MM/dd";
    /**
     * 时间格式(yyyy-MM-dd)
     */
    public final static String DATE_PATTERN = "yyyy-MM-dd";
    /**
     * 时间格式(yyyy-MM-dd)
     */
    public final static String DATE_PATTERN_HH = "yyyyMMddHH";
    /**
     * 时间格式(yyyy-MM-dd HH:mm:ss)
     */
    public final static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public final static String ISO_DATE_TIME_PATTERN = "yyyy-MM-dd'T'HH:mm:ssXXX";

    /**
     * 日期格式化 日期格式为：yyyy-MM-dd
     *
     * @param date 日期
     * @return 返回yyyy-MM-dd格式日期
     */
    public static String format(Date date) {
        if (date == null) {
            return "";
        }
        return format(date, DATE_PATTERN);
    }

    /**
     * 日期格式化 日期格式为：yyyy-MM-dd
     *
     * @param date    日期
     * @param pattern 格式，如：DateUtils.DATE_TIME_PATTERN
     * @return 返回yyyy-MM-dd格式日期
     */
    public static String format(Date date, String pattern) {
        if (date != null) {
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            return df.format(date);
        }
        return null;
    }

    public static String formatGMT8(Date date, String pattern) {
        if (date != null) {
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            TimeZone destTimeZone = TimeZone.getTimeZone("GMT+8");
            df.setTimeZone(destTimeZone);
            return df.format(date);
        }
        return null;
    }

    /**
     * 字符串转换成日期
     *
     * @param strDate 日期字符串
     * @param pattern 日期的格式，如：DateUtils.DATE_TIME_PATTERN
     */
    public static Date stringToDate(String strDate, String pattern) {
        if (StringUtils.isBlank(strDate)) {
            return null;
        }

        DateTimeFormatter fmt = DateTimeFormat.forPattern(pattern);
        return fmt.parseLocalDateTime(strDate).toDate();
    }

    /**
     * 日期格式字符串转换
     */
    public static String convertDatePattern(String strDate, String pattern) {
        if (StringUtils.isBlank(strDate)) {
            return null;
        }
        Date stringToDate = stringToDate(strDate, DATE_TIME_PATTERN);
        return format(stringToDate, pattern);
    }

    /**
     * 根据周数，获取开始日期、结束日期
     *
     * @param week 周期  0本周，-1上周，-2上上周，1下周，2下下周
     * @return 返回date[0]开始日期、date[1]结束日期
     */
    public static Date[] getWeekStartAndEnd(int week) {
        DateTime dateTime = new DateTime();
        LocalDate date = new LocalDate(dateTime.plusWeeks(week));

        date = date.dayOfWeek().withMinimumValue();
        Date beginDate = date.toDate();
        Date endDate = date.plusDays(6).toDate();
        return new Date[]{beginDate, endDate};
    }

    /**
     * 对日期的【秒】进行加/减
     *
     * @param date    日期
     * @param seconds 秒数，负数为减
     * @return 加/减几秒后的日期
     */
    public static Date addDateSeconds(Date date, int seconds) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusSeconds(seconds).toDate();
    }

    /**
     * 对日期的【分钟】进行加/减
     *
     * @param date    日期
     * @param minutes 分钟数，负数为减
     * @return 加/减几分钟后的日期
     */
    public static Date addDateMinutes(Date date, int minutes) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusMinutes(minutes).toDate();
    }

    /**
     * 对日期的【小时】进行加/减
     *
     * @param date  日期
     * @param hours 小时数，负数为减
     * @return 加/减几小时后的日期
     */
    public static Date addDateHours(Date date, int hours) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusHours(hours).toDate();
    }

    /**
     * 对日期的【天】进行加/减
     *
     * @param date 日期
     * @param days 天数，负数为减
     * @return 加/减几天后的日期
     */
    public static Date addDateDays(Date date, int days) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusDays(days).toDate();
    }

    /**
     * 对日期的【周】进行加/减
     *
     * @param date  日期
     * @param weeks 周数，负数为减
     * @return 加/减几周后的日期
     */
    public static Date addDateWeeks(Date date, int weeks) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusWeeks(weeks).toDate();
    }

    /**
     * 对日期的【月】进行加/减
     *
     * @param date   日期
     * @param months 月数，负数为减
     * @return 加/减几月后的日期
     */
    public static Date addDateMonths(Date date, int months) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusMonths(months).toDate();
    }

    /**
     * 对日期的【年】进行加/减
     *
     * @param date  日期
     * @param years 年数，负数为减
     * @return 加/减几年后的日期
     */
    public static Date addDateYears(Date date, int years) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusYears(years).toDate();
    }

    /**
     * long转时间格式字符串
     */
    public static String longToDateStr(long time, String pattern) {
        Date stringToDate = stringToDate(String.valueOf(time), "yyyyMMddHHmmss");
        return format(stringToDate, pattern);
    }

    public static boolean isSameDate(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);

        boolean isSameYear = cal1.get(Calendar.YEAR) == cal2
                .get(Calendar.YEAR);
        boolean isSameMonth = isSameYear
                && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
        boolean isSameDate = isSameMonth
                && cal1.get(Calendar.DAY_OF_MONTH) == cal2
                .get(Calendar.DAY_OF_MONTH);

        return isSameDate;
    }

    public static boolean isSameMonth(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);

        boolean isSameYear = cal1.get(Calendar.YEAR) == cal2
                .get(Calendar.YEAR);
        boolean isSameMonth = isSameYear
                && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
        return isSameMonth;
    }

    /**
     * 是否相同月，忽略年份
     *
     * @param date1
     * @param date2
     * @return
     */
    public static boolean isSameMonthIngoreYear(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);

        boolean isSameMonth = cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
        return isSameMonth;
    }

    public static boolean isSameYear(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);

        boolean isSameYear = cal1.get(Calendar.YEAR) == cal2
                .get(Calendar.YEAR);
        return isSameYear;
    }

    public static Date getUTCE8Date() {
        Date date = null;
        // 1、取得本地时间：
        Calendar cal = Calendar.getInstance();
        // 2、取得时间偏移量：
        int zoneOffset = cal.get(Calendar.ZONE_OFFSET);
        // 3、取得夏令时差：
        int dstOffset = cal.get(Calendar.DST_OFFSET);
        // 4、从本地时间里扣除这些差量，即可以取得UTC时间：
        cal.add(Calendar.MILLISECOND, -(zoneOffset + dstOffset));
        //加8小时变成东8区时间
        cal.set(Calendar.HOUR, cal.get(Calendar.HOUR) + 8);
        date = cal.getTime();

        return date;
    }

    /**
     * 获取指定日期所在月份开始的时间戳
     *
     * @param date 指定日期
     * @return
     */
    public static Long getMonthBegin(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);

        //设置为1号,当前日期既为本月第一天
        c.set(Calendar.DAY_OF_MONTH, 1);
        //将小时至0
        c.set(Calendar.HOUR_OF_DAY, 0);
        //将分钟至0
        c.set(Calendar.MINUTE, 0);
        //将秒至0
        c.set(Calendar.SECOND, 0);
        //将毫秒至0
        c.set(Calendar.MILLISECOND, 0);
        // 获取本月第一天的时间戳
        return c.getTimeInMillis();
    }

    /**
     * 获取0点时间
     *
     * @param date
     * @return
     */
    public static Date getZeroTime(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);

        //将小时至0
        c.set(Calendar.HOUR_OF_DAY, 0);
        //将分钟至0
        c.set(Calendar.MINUTE, 0);
        //将秒至0
        c.set(Calendar.SECOND, 0);
        //将毫秒至0
        c.set(Calendar.MILLISECOND, 0);

        return c.getTime();
    }

    /**
     * 获取东8区0点时间
     *
     * @param date
     * @return
     */
    public static Date getGMT8ZeroTime(Date date) {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"), Locale.CHINESE);
        c.setTime(date);

        //将小时至0
        c.set(Calendar.HOUR_OF_DAY, 0);
        //将分钟至0
        c.set(Calendar.MINUTE, 0);
        //将秒至0
        c.set(Calendar.SECOND, 0);
        //将毫秒至0
        c.set(Calendar.MILLISECOND, 0);

        return c.getTime();
    }

    /**
     * 当前时间转换时区加/减小时（GTM+8/GTM-8）
     * @param date 当前时区的时间（要处理的时间）
     * @param timeZone 获取更改时间规则————配置文件中更改该（timeZone）值
     * @return
     */
    //	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    //	public static Date getGMTTime(Date date, String timeZone) {
    //		Date gmt = null;
    //		System.out.println("获取时区转换规则：" + timeZone);
    //
    //		try {
    //			Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone), Locale.CHINESE);
    //			Calendar day = Calendar.getInstance();
    //			day.setTime(date);//设置要处理的时间
    //			day.set(Calendar.YEAR, cal.get(Calendar.YEAR));
    //			day.set(Calendar.MONTH, cal.get(Calendar.MONTH));
    //			day.set(Calendar.DATE, cal.get(Calendar.DATE));
    //			day.set(Calendar.HOUR_OF_DAY, cal.get(Calendar.HOUR_OF_DAY));
    //			day.set(Calendar.MINUTE, cal.get(Calendar.MINUTE));
    //			day.set(Calendar.SECOND, cal.get(Calendar.SECOND));
    //			gmt = day.getTime();
    //		} catch (Exception e) {
    //			System.out.println("获取" + gmt + "时间 getGMTTime() error !");
    //		}
    //		return gmt;
    //	}

    /**
     * 当前时间转换时区加/减小时（GTM+8/GTM-8）
     *
     * @param date     当前时区的时间（要处理的时间）
     * @param timeZone 获取更改时间规则————配置文件中更改该（timeZone）值
     * @return
     */
    public static Date getTimeZone(Date date, Integer timeZone) {
        SimpleDateFormat sf = new SimpleDateFormat(DATE_TIME_PATTERN);
        Calendar ca = Calendar.getInstance();
        try {
            date = sf.parse(sf.format(date));
        } catch (ParseException e) {
        }
        ca.setTime(date);
        ca.add(Calendar.HOUR, timeZone);
        date = ca.getTime();
        return date;
    }

    /**
     * 动态获取当前时区
     *
     * @return
     */
    public static int getTimeZone1() {
        Calendar ca = Calendar.getInstance();
        int offset = ca.get(Calendar.ZONE_OFFSET);
        ca.add(Calendar.MILLISECOND, -offset);
        Long timeStampUTC = ca.getTimeInMillis();
        Long timeStamp = System.currentTimeMillis();
        int timeZone = (int) ((timeStamp - timeStampUTC) / (1000 * 3600));
        System.out.println("当前时区：UTC" + timeZone);
        return timeZone;
    }

    public static boolean isSameHour(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);

        boolean isSameHour = (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
                && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH)
                && cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH)
                && cal1.get(Calendar.HOUR_OF_DAY) == cal2.get(Calendar.HOUR_OF_DAY));
        return isSameHour;
    }

    public static boolean isSameMinute(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);

        boolean isSameMinute = (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
                && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH)
                && cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH)
                && cal1.get(Calendar.HOUR_OF_DAY) == cal2.get(Calendar.HOUR_OF_DAY)
                && cal1.get(Calendar.MINUTE) == cal2.get(Calendar.MINUTE));
        return isSameMinute;
    }

    public static boolean isSameSecond(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);

        boolean isSameSecond = (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
                && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH)
                && cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH)
                && cal1.get(Calendar.HOUR_OF_DAY) == cal2.get(Calendar.HOUR_OF_DAY)
                && cal1.get(Calendar.MINUTE) == cal2.get(Calendar.MINUTE)
                && cal1.get(Calendar.SECOND) == cal2.get(Calendar.SECOND));
        return isSameSecond;
    }

    public static Date plus(Date date, int rate, int cycle) {
        TemporalAmount amount = null;
        switch (rate) {
            case 0:// 每cycle秒执行一次
                amount = Duration.ofSeconds(cycle);
                break;
            case 1:// 每cycle分钟执行一次
                amount = Duration.ofMinutes(cycle);
                break;
            case 2:// 每cycle小时执行一次
                amount = Duration.ofHours(cycle);
                break;
            case 3:// 每cycle天的0点执行一次
                amount = Duration.ofDays(cycle);
                break;
        }
        Instant instant = date.toInstant();
        return Date.from(instant.plus(amount));
    }

    public static BigDecimal diffMinutes(Date date1, Date date2) {
        BigDecimal minutes = BigDecimal.valueOf((date1.getTime() - date2.getTime()) / (1000 * 60));
        return minutes;
    }

    /**
     * @param date
     * @return 本周周一的日期  年月日
     */
    public static String getThisWeekMonday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        // 获得当前日期是一个星期的第几天
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        // 获得当前日期是一个星期的第几天
        int day = cal.get(Calendar.DAY_OF_WEEK);
        // 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);
        return DateUtils.format(cal.getTime());
    }

    /**
     * @param
     * @return 上一周周一的日期  年月日
     */
    public static String geLastWeekMonday(Date date) {
        Date thisWeekMonday = DateUtils.stringToDate(getThisWeekMonday(date), DateUtils.DATE_PATTERN);
        Calendar cal = Calendar.getInstance();
        cal.setTime(thisWeekMonday);
        cal.add(Calendar.DATE, -7);
        return DateUtils.format(cal.getTime());
    }

    /**
     * @return 获取当前时间
     * @author wcj
     */
    public static String getNowTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(Calendar.getInstance().getTime());
    }

    /**
     * 获取前一个小时的时间，分钟和秒清零
     *
     * @return 前一个小时的 Date，分钟和秒为0
     */
    public static Date getOneHourBefore() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR_OF_DAY, -1);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取后一个小时的时间，分钟和秒清零
     *
     * @return 后一个小时的 Date，分钟和秒为0
     */
    public static Date getOneHourAfter() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR_OF_DAY, 1);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取两个Date对象之间相差的秒数
     *
     * @param startDate 开始日期
     * @param endDate   结束日期
     * @return 相差的秒数，如果endDate在startDate之前，则返回负数
     */
    public static long getSecondsBetweenDates(Date startDate, Date endDate) {
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Dates must not be null");
        }
        long diffInMillis = endDate.getTime() - startDate.getTime();
        return diffInMillis / 1000; // 将毫秒转换为秒
    }

    /**
     * 获取当前所在的小时（24小时制）
     *
     * @return 当前小时数（0-23）
     */
    public static int getCurrentHour24() {
        // 创建一个Calendar实例，默认时区和语言环境
        Calendar calendar = Calendar.getInstance();

        // 获取当前小时（Calendar.HOUR_OF_DAY 表示24小时制）
        return calendar.get(Calendar.HOUR_OF_DAY);
    }
}
