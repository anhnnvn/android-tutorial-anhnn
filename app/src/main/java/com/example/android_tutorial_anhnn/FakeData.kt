package com.example.android_tutorial_anhnn

import com.example.android_tutorial_anhnn.data.model.AppInfor
import com.example.android_tutorial_anhnn.data.model.National

object FakeData {

    var nationals = mutableListOf(
        National(R.drawable.ic_nation_argentina, "Argentina"),
        National(R.drawable.ic_nation_bahrain, "Bahrain"),
        National(R.drawable.ic_nation_canada, "Canada"),
//        National(R.drawable.ic_nation_colombia, "Colombia"),
//        National(R.drawable.ic_nation_czech_republic, "Czech Republic"),
//        National(R.drawable.ic_nation_france, "France"),
//        National(R.drawable.ic_nation_germany, "Germany"),
//        National(R.drawable.ic_nation_greece, "Greece"),
//        National(R.drawable.ic_nation_india, "India"),
//        National(R.drawable.ic_nation_italy, "Italy"),
//        National(R.drawable.ic_nation_japan, "Japan"),
//        National(R.drawable.ic_nation_malaysia, "Malaysia"),
//        National(R.drawable.ic_nation_myanmar, "Myanmar"),
//        National(R.drawable.ic_nation_north_korea, "North Korea"),
//        National(R.drawable.ic_nation_panama, "Panama"),
//        National(R.drawable.ic_nation_philippines, "Philippines"),
//        National(R.drawable.ic_nation_portugal, "Portugal"),
//        National(R.drawable.ic_nation_romania, "Romania"),
//        National(R.drawable.ic_nation_saudi_arabia, "Saudi Arabia"),
//        National(R.drawable.ic_nation_singapore, "Singapore"),
//        National(R.drawable.ic_nation_south_africa, "France"),
//        National(R.drawable.ic_nation_south_korea, "South Korea"),
//        National(R.drawable.ic_nation_spain, "Spain"),
//        National(R.drawable.ic_nation_switzerland, "Switzerland"),
//        National(R.drawable.ic_nation_ukraine, "Ukraine"),
//        National(R.drawable.ic_nation_vietnam, "Viet Nam")
    )

    fun getAppInfoList(): MutableList<AppInfor> {
        var list: MutableList<AppInfor> = mutableListOf()

        list.add(AppInfor().apply {
            name = "App Store"
            url = "https://firebasestorage.googleapis.com/v0/b/myfood-2b764.appspot.com/o/AppIcon%2Fapp-store.png?alt=media&token=18a08487-b0d5-448d-8f0e-d48ceda0a1e5"
        })
        list.add(AppInfor().apply {
            name = "Behance"
            url = "https://firebasestorage.googleapis.com/v0/b/myfood-2b764.appspot.com/o/AppIcon%2Fbehance.png?alt=media&token=d57445f0-075c-419d-8a4a-046fc6b1d39d"
        })
        list.add(AppInfor().apply {
            name = "Books"
            url = "https://firebasestorage.googleapis.com/v0/b/myfood-2b764.appspot.com/o/AppIcon%2Fbooks.png?alt=media&token=c0ff568d-c8b1-423a-a163-1d120f7ca1c3"
        })
//        list.add(AppInfor().apply {
//            name = "Facebook"
//            url ="https://firebasestorage.googleapis.com/v0/b/myfood-2b764.appspot.com/o/AppIcon%2Ffacebook.png?alt=media&token=4149cdf9-02b9-4c8d-aed2-1325d83fe083"
//        })
//        list.add(AppInfor().apply {
//            name = "Been Together"
//            url = "https://firebasestorage.googleapis.com/v0/b/myfood-2b764.appspot.com/o/AppIcon%2Flove.png?alt=media&token=79bf2635-d6f6-497d-a640-a1399e8ac3bd"
//        })
//        list.add(AppInfor().apply {
//            name = "Map"
//            url = "https://firebasestorage.googleapis.com/v0/b/myfood-2b764.appspot.com/o/AppIcon%2Fmap.png?alt=media&token=a187a7fc-cc7f-4e17-8cb2-9e9d4f3241e0"
//        })
//        list.add(AppInfor().apply {
//            name = "Pinterest"
//            url = "https://firebasestorage.googleapis.com/v0/b/myfood-2b764.appspot.com/o/AppIcon%2Fpinterest.png?alt=media&token=625cb46c-1d52-4287-8483-d1c4fc4da022"
//        })
//        list.add(AppInfor().apply {
//            name = "Earth"
//            url = "https://firebasestorage.googleapis.com/v0/b/myfood-2b764.appspot.com/o/AppIcon%2Fplanet-earth.png?alt=media&token=603e16df-1c56-42cb-9a8e-c63780005fea"
//        })
//        list.add(AppInfor().apply {
//            name = "Play Store"
//            url = "https://firebasestorage.googleapis.com/v0/b/myfood-2b764.appspot.com/o/AppIcon%2Fplay.png?alt=media&token=3f6de1c4-ee3d-4ee4-9aff-27192ae4b0b4"
//        })
//        list.add(AppInfor().apply {
//            name = "Safari"
//            url = "https://firebasestorage.googleapis.com/v0/b/myfood-2b764.appspot.com/o/AppIcon%2Fsafari.png?alt=media&token=c1788354-a900-4a86-ad2a-5b462c50c310"
//        })
//        list.add(AppInfor().apply {
//            name = "Google"
//            url = "https://firebasestorage.googleapis.com/v0/b/myfood-2b764.appspot.com/o/AppIcon%2Fsearch.png?alt=media&token=a732b8d3-985a-4b72-a7c5-b0f207e84c76"
//        })
//        list.add(AppInfor().apply {
//            name = "Telegram"
//            url = "https://firebasestorage.googleapis.com/v0/b/myfood-2b764.appspot.com/o/AppIcon%2Ftelegram.png?alt=media&token=213bb2b1-7015-4bf6-8e1b-b6198ee556d5"
//        })
//        list.add(AppInfor().apply {
//            name = "Twitter"
//            url = "https://firebasestorage.googleapis.com/v0/b/myfood-2b764.appspot.com/o/AppIcon%2Ftwitter.png?alt=media&token=7ddc7a65-cf23-4331-9648-71bc255934b9"
//        })
//        list.add(AppInfor().apply {
//            name = "Viber"
//            url = "https://firebasestorage.googleapis.com/v0/b/myfood-2b764.appspot.com/o/AppIcon%2Fviber.png?alt=media&token=525cac43-7db6-49ab-a98e-5801537d5de5"
//        })
//        list.add(AppInfor().apply {
//            name = "Whats app"
//            url = "https://firebasestorage.googleapis.com/v0/b/myfood-2b764.appspot.com/o/AppIcon%2Fwhatsapp.png?alt=media&token=ca2cf3bf-528c-4cf1-936d-58a8924ba673"
//        })
//        list.add(AppInfor().apply {
//            name = "Pet"
//            url = "https://firebasestorage.googleapis.com/v0/b/myfood-2b764.appspot.com/o/Icon%2Fworried.png?alt=media&token=0c9467a3-23b5-430f-962e-65aa9a87bf57"
//        })

        return list
    }
}