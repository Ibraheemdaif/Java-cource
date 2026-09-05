public class Main {
    static void main() {
        Student student = new Student();
        Thread t1 = new Thread(
                () ->
                {
                    for (int i = 0; i < 3000; i++) {
                        student.incrementCount();
                    }
                }

        );
        Thread t2 = new Thread(
                () ->
                {
                    for (int i = 0; i < 3000; i++) {
                        student.incrementCount();
                    }
                }
        );

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Count = " + student.getCount());

    // مشكلة ال race condition بتحصل لما يكون في اكتر من thread بيشتغلو على نفس الحاجة في نفس الوقت
        // فعليا كل ثريد بتشتغل على الكونت 3000 مرة (تقرا القيمة القديمة وتعدل عليها وتخزن القيمة الجديدة) ولكن
        //  المشكلة الاساسية هنا بتحصل لما ال 2 ثريد يقراو نفس القيمة في نفس الوقت يعني مثلا القيمة الحالية 2000 كل واحدة
        // هتقرا 2000 وتزود واحد وترجع تخزن 2001 هما اللي بيحصل ان واحدة فيهم بتلغي عمل التانية فيما يعر بال اوفر رايتينج
        // عندنا للمشكلة دي اكتر من حل اشهرهم ال Atomic , synchronized
    }
}