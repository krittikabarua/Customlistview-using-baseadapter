package com.krittika.custom_listview_with_baseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    ListView list;

    String[] district ={
            "2 construction workers killed as truck collides lorry in Gazipur",
            "Dhaka, some other parts of country may witness rain today: BMD",
            "RMG workers block Banani-Airport road for 2 hours protesting factory closure",
            "Gazipur train collision: Probe committee forme",
            "Gazipur train collision: Rescue operation continues for 2nd day",
            "Finance minister shares Bangladesh’s vision for clean, green energy transition",
            "Ctg road accidents kill 2",
            "Bangladesh, Gambia for speedy resolution of Myanmar case at ICJ"

    };

    String[] description ={
           "Two construction workers were killed and 14 others injured as a truck collided with a lorry in Sreepur upazila of Gazipur early today.\n" +
                   "\n" +
                   "The deceased were identified as Russel Mia, 25, and Abu Sufian, 25, of Sreepur.\n" +
                   "\n" +
                   "Officer-in-Charge of Sreepur Police Station Akbar Ali Khan told The Daily Star that the accident took place around 5:00am.\n" +
                   "\n" +
                   "Station Officer of Sreepur Fire Service Belal Ahmed said a lorry, carrying a concrete mixer machine and 16 workers, was going to Mawna from Sreepur.\n" +
                   "\n" +
                   "When the lorry reached in front of Bhangnahati councilor's house on Sreepur-Mawna regional road, a heavy truck hit it from behind.\n" +
                   "\n" +
                   "After the collision, the lorry overturned and the workers were crushed under the mixer machine, the OC said.\n" +
                   "\n" +
                   "Russel and Abu Sufian were brought dead, Dr Sabina of Sreepur Upazila Health Complex said, adding that 14 injured workers were also brought to the complex.\n" +
                   "\n" +
                   "Sub-Inspector (SI) of Sreepur Police Station Kuddus said the truck was seized but its driver managed to flee the scene.\n" +
                   "\n" +
                   "Legal action will be taken in this regard, the SI said.\n" +
                   "\n" +
                   " ",
            "Bangladesh Meteorological Department (BMD) has predicted rains or thunder showers in parts of the country, including Dhaka, in 24 hours commencing 9:00am today.\n" +
                    "\n" +
                    "\"Rains or thundershowers accompanied by temporary gusty or squally wind are likely at a few places over Sylhet division and at one or two places over Rangpur, Dhaka, Mymensingh, Barishal and Chattogram divisions with hails at isolated places,\" said a Met office bulletin.\n" +
                    "\n" +
                    "Besides, mild to moderate heat wave may continue in Dhaka and the five other divisions during the period.\n" +
                    "\n" +
                    "\"A severe heat wave is sweeping over the districts of Pabna, Jashore, Chuadanga and Bagerhat districts while a mild to moderate heat wave is scorching Dhaka, Rajshahi, Rangpur, Mymensingh and Barishal divisions and parts of Khulna division and Moulvibazar and Chandpur districts and it may continue,\" said the bulletin.\n" +
                    "\n" +
                    "Weather may remain mainly dry with temporary partly cloudy sky elsewhere over the country.\n" +
                    "\n" +
                    "Day and night temperatures may remain nearly unchanged over the country.\n" +
                    "\n" +
                    "A trough of westerly low lies over West Bengal to the North-east Bay across southwestern part of Bangladesh.",
            "Several hundred garment workers blocked Banani-Airport Road for over two hours this morning protesting the closure of their factory without any prior notice.\n" +
                    "\n" +
                    "More than 300 workers of Apparels Industries Limited blocked the road in front of Sainik Club around 8:30am for over two hours, halting vehicular movement in the area during rush hours.\n" +
                    "\n" +
                    "Huge traffic congestion was created on both sides of the Banani-Airport Road and its nearby alleys following the demonstration.\n" +
                    "\n" +
                    "The garment workers alleged that the authorities hung the closure notice on the main gate without paying the salary for the month of April to its staffs and workers.\n" +
                    "\n" +
                    "Officer-in-Charge of Banani Police Station Kazi Shahan Haque told The Daily Star that upon request from the law enforcers, the workers left the road after 10:30am considering public sufferings.\n" +
                    "\n" +
                    "They were standing on the footpath when the report was filed around 11:00am.\n" +
                    "\n" +
                    "The Daily Star tried to reach the factory authorities for a comment in this regard but did not get any response.",
                   "A three-member enquiry committee was formed as a commuter train hit a stationary oil tanker train at Joydebpur Outer Signal (Kazibari) area on Dhaka-Tangail rail route today.\n" +
                           "\n" +
                           "Three persons -- Joydebpur Junction Station master Md Hashem, pointsmen Mostafizur Rahman and Saddam Hossain -- were suspended following the incident.\n" +
                           "\n" +
                           "Quoiting the railway authorities, Deputy Commissioner Abul Fate Mohammad Safiqul Islam told this to our Gazipur correspondent.\n" +
                           "\n" +
                           "However, three trains have been operated through one of the double lines since this afternoon, according to the railway authorities.\n" +
                           "\n" +
                           "Following the accident, several trains got stuck on Dhaka Tangail and Dhaka Mymensingh railway routes, Joydevpur Junction Railway Police In-charge Setabar Rahman said around 4:00pm. Three trains are running between the lines so far, he added.\n" +
                           "\n" +
                           "Train movement on the line affected by the accident is not normal yet, he also said.\n" +
                           "\n" +
                           "An empty Dhaka-bound Tangail commuter train with staff onboard hit the stationary oil tanker train at Joydebpur Outer Signal (Kazibari) area around 10:45am. Three people, including a loco master, were injured in the incident.",
            "According to Samad Mia, senior station officer of Joydebpur Fire Service, the Petroleum Corporation was moving wagons filled with oil since last night.\n" +
                    "\n" +
                    "Two wagons remain to be moved from the railway tracks, he said around 8:00am.\n" +
                    "\n" +
                    "Joydebpur Junction Railway Police's in-charge, Setabar Rahman, stated, \"We're here to maintain security. BGB members are also present here to safeguard the oil wagons.\"\n" +
                    "\n" +
                    "The railway authorities said that the train's oil tanker was damaged in the collision. Consequently, oil is seeping out. To prevent further accidents, these tankers ought to be moved first, he said.\n" +
                    "\n" +
                    "BGB Public Relations Officer Shariful Islam said that two platoons of Border Guard Bangladesh (BGB) sent to the spot to rescue the oil train's wagons.\n" +
                    "\n" +
                    "Gazipur district administration and railway authorities have formed two separate probe committees. Joydebpur Junction Station Master Hanif Mia confirmed the matter.\n" +
                    "\n" +
                    "Three persons -- Joydebpur Junction Station master Md Hashem, pointsmen Mostafizur Rahman and Saddam Hossain -- were suspended following the incident.",
            "Finance Minister AH Mahmood Ali yesterday said building greater trust and confidence among countries could be key to leveraging enormous opportunities for cross border energy trade and attracting international finance in energy transition projects in South Asia.\n" +
                    "\n" +
                    "Speaking at an SASEC knowledge event, the finance minister presented Bangladesh's vision for a clean and green energy transition.\n" +
                    "\n" +
                    "While speaking as a panelist, he focused on building greater trust and confidence among South Asian countries to leverage their additional capacities in hydro, solar, and other non-fossil fuel sources to meet the region's growing energy needs sustainably.\n" +
                    "\n" +
                    "The minister put emphasis on creating enabling environment for domestic and foreign investors to bring finances to bankable energy projects.\n" +
                    "\n" +
                    "He sought ADB's support to this connection.\n" +
                    "\n" +
                    "As 2024 ADB annual meeting progressed into its second day, Bangladesh's finance minister attended the SASEC knowledge event on \"Financing the Clean Energy Transition in South Asia.\"",
            "Two people were killed in separate road accidents in Chattogram yesterday.\n" +
                    "\n" +
                    "The deceased were identified as Osman Goni, 40, an auto-rickshaw driver, and Mohammed Minhaj, 35, our local correspondent reports quoting police\n" +
                    "\n" +
                    "In Patiya upazila, an auto-rickshaw driver was killed when two CNG-run auto-rickshaws collided around 6:00pm, said police\n" +
                    "\n" +
                    "Meanwhile, a pedestrian was killed and two were injured when a motorcycle hit them in Khejurtala area of Chattogram city around 7:00pm.\n" +
                    "\n" +
                    "Sub-inspector Nurul Alam, also in-charge of Chattogram Medical College Hospital outpost, said the bodies were sent to the CMCH morgue for autopsy.",
            "Bangladesh and the Gambia yesterday expressed hope to witness a speedy resolution of the case filed against Myanmar on the charge of Rohingya genocide with the International Court of Justice (ICJ).\n" +
                    "\n" +
                    "The optimism was reflected at a meeting between Bangladesh Foreign Minister Hasnan Mahmud and Gambian Justice Minister and Attorney General Dawda A Jallow on the sideline of the preparatory meeting of the foreign ministers ahead of the 15th summit of Organization for Islamic Cooperation (OIC) in Gambia, said a foreign ministry press release.\n" +
                    "\n" +
                    "During the meeting, Gambian minister expressed sincere thanks to the Bangladesh government for providing humanitarian shelter to forcibly displaced Rohingyas.\n" +
                    "\n" +
                    "He also expressed his gratitude to the Bangladesh government for providing financial assistance to the Gambia for handling the Rohingya genocide case.\n" +
                    "\n" +
                    "Hasan discussed Bangladesh government's steps to provide humanitarian shelter to Rohingyas as well as the future obstacles regarding the crisis.\n" +
                    "\n" +
                    "He emphasised the repatriation of the Rohingyas, staying in Bangladesh, to their homeland Myanmar in order to find a sustainable solution to the crisis.\n" +
                    "\n" +
                    "Jallow described the current scenario of the Rohingya case and expressed his confidence in proving the allegations of genocide against Myanmar.\n" +
                    "\n" +
                    "However, he also raised the issue of insufficient funds to run the case with ICJ.\n" +
                    "\n" +
                    "Hasan assured of providing necessary legal assistance and evidence from Bangladesh side to Gambia to continue the case.\n" +
                    "\n" +
                    "In 2019, the Gambia filed a case against Myanmar with the ICJ alleging Rohingya genocide following a consensus of the OIC member states."
    };


  String[] timedate={
            "Sat May 4, 2024 11:25 AM\n" +
                    "Last update on: Sat May 4, 2024 11:41 AM",
            "Sat May 4, 2024 11:59 AM\n" +
                    "Last update on: Sat May 4, 2024 12:01 PM",
            "Sat May 4, 2024 11:12 AM\n" +
                    "Last update on: Sat May 4, 2024 11:48 AM",
            "Sat May 4, 2024 11:02 AM\n" +
                    "Last update on: Sat May 4, 2024 11:45 AM",
            "Fri May 3, 2024 07:46 PM\n" +
                    "Last update on: Fri May 3, 2024 08:24 PM",
            "Sat May 4, 2024 01:32 AM\n" +
                    "Last update on: Sat May 4, 2024 01:34 AM",
          "Sat May 4, 2024 12:14 AM\n" +
                  "Last update on: Sat May 4, 2024 12:16 AM",
          "Sat May 4, 2024 01:53 AM\n" +
                  "Last update on: Sat May 4, 2024 02:15 AM"

    };

    Integer[] imageId ={
            R.drawable.img_13,
            R.drawable.img_14,
            R.drawable.img_15,
            R.drawable.img_16,
            R.drawable.img_17,
            R.drawable.img_18,
            R.drawable.img_19,
            R.drawable.img_20




    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list =findViewById(R.id.li);



        CustomAdapter listAdapter = new CustomAdapter(MainActivity.this, district, imageId,description,timedate);
        list.setAdapter(listAdapter);




    }
}