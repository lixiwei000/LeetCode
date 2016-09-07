package niuke.jingdong;

import java.util.*;

/**
 * @author NikoBelic
 * @create 16/9/5 20:21
 */
public class Climb
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int max = 0;
        List<Record> recordList = new ArrayList<>();
        for (int i = 0; i<m; i++)
        {
            recordList.add(new Record(scanner.nextInt(),scanner.nextInt()));
        }
        recordList.sort(new Comparator<Record>()
        {
            @Override
            public int compare(Record o1, Record o2) {
                if (o1.day > o2.day)
                    return  1;
                else if (o1.day < o2.day)
                    return -1;
                else return 0;
            }
        });
        for (int i = 0; i < recordList.size() - 1; i++)
        {
            int passDay = recordList.get(i+1).day - recordList.get(i).day;
            int highFrom = recordList.get(i).high;
            int highTo = recordList.get(i+1).high;
            int tmp = (int) Math.floor(Math.abs(highTo - highFrom) + passDay / 2) + highFrom;
            if (tmp > max)
                max = tmp;

            if (highTo - highFrom > passDay)
            {
                System.out.println("IMPOSSIBLE");
                return;
            }
        }
        System.out.println(max);

    }



    static class Record
    {
        private int day;
        private int high;

        public Record(int day, int high) {
            this.day = day;
            this.high = high;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getHigh() {
            return high;
        }

        public void setHigh(int high) {
            this.high = high;
        }

    }
}
