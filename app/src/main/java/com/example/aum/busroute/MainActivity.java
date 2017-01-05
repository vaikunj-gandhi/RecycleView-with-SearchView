package com.example.aum.busroute;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    private LinearLayoutManager lLayout;
    SearchView search_view;
    RecyclerViewAdapter  rcAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(MainActivity.this);
        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);
        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);
        search_view = (SearchView) findViewById(R.id.search_view);
        search_view.setOnQueryTextListener(this);



    }
    private List<ItemObject> getAllItemList() {
        List<ItemObject> allItems = new ArrayList<ItemObject>();

        allItems.add(new ItemObject("Route 11 (AYURVEDIK CROSS ROAD)", "Aayurvedik Cross Road → Swaminarayan Nagar → Ram Vatica → Poonam Complex → Kala Darshan → Vadeshvar Hanuman Mandir → Parivar Char Rasta # → Vrundavan Char Rasta # → Prabhat → Ring Road → Airport Circle → Amitnagar char rasta → Sama Talav → Savli College"));
        allItems.add(new ItemObject("Route 12 (PRABHAT COLONY)", "Prabhat Colony → Uma cross road → Mahavir Hall → Kishan Vadi → Premdas Jalaram → Panchsheel → Dhaval char rasta → Sangam Cross Road → Gandhi Park → Airport Circle → Amitnagar Char Rasta → Sama Talav → Savli College"));
        allItems.add(new ItemObject("Route 13 (SUSEN CHAR RASTA", "Susen Char Rasta → Akashwani → Kabir Complex → Bhavans School → Baroda Dairy → Hazira → Pratapnagar Bridge → Zenith → Soma Talav → Gurukul → Parivar Char Rasta → Vrundavan Char Rasta → Sardar Estate → Khodiyar Nagar → Vaikunth → Airport Circle → Amitnagar Char Rasta → Sama Talav → Savli College"));
        allItems.add(new ItemObject("Route 14 (VADSAR BRIDGE)", "Vadsar Bridge → Darbar Chowkdi → Suncity circle → Smasan Char Rasta → Avdhut Fatak → Amitnagar char rasta → Sama Talav → Savli College"));
        allItems.add(new ItemObject("Route 15 (BAGIKHANA)", "Bagikhana → Kirti Stambh → Kothi Char Rasta → Salatwada → Nagarvada → Bhutdizapa → Jivan Bharti → Muktanand → Watertank → Amitnagar char rasta → Sama Talav → Savli College"));
        allItems.add(new ItemObject("Route 16 (YESH COMPLEX)", "Yash Complex → Kalp Vruksh → Harinagar → Race Course Circle → Genda Circle → Fatehgunj Char Rasta → Amitnagar char rasta → Sama Talav → Savli College"));
        allItems.add(new ItemObject("Route 17 (TIME CIRCLE)" , "Time Circle → Vasna Road → Raneshwar → Tandalja → Rajiv Road → Manisha Cross Road → Havmor → Chakli Circle → Genda Circle → Amitnagar Char Rasta → Sama Talav → Savli College"));
        allItems.add(new ItemObject("Route 18 (DASHAMA TEMPLE)", "Dashama Temple → Aakanksha Duplex → Samta Char Rasta → Suresh Bhajiya house → Jhansi Ki Rani → Reliance Petrol pump → Ganga Jamuna → Ellora Park → Genda Circle → Fatehgunj Char Rasta → Nizampura → Delux Char Rasta → Sama talav → Savli College"));
        allItems.add(new ItemObject("Route 19 (UNDERA)","Undera → Petrofils → Panchvati → Sahyog → I.T.I. → Bapu Ni Dargah → Gujarat High Board → Genda Circle → Fatehgunj → Nizampura → Delux Char Rasta → Military Boys Hostel → Sama Talav → Savli College"));
        allItems.add(new ItemObject("Route 20 (CHHANI ROAD)","Chhani → Ramakaka ni Dairy → Keya Motors → Chhani Jakatnaka → Abhilasha char rasta → Sama talav → Savli College"));
       allItems.add(new ItemObject("Route 21 (SOMA TALAV)","Soma Talav → Narayan School → Parivaar char rasta → Vrundavan char rasta → Sardar Estate → Khodiyar Nagar → Airport Circle → Amitnagar char rasta → Sama talav → Savli College"));
       allItems.add(new ItemObject("Route 22 (ANAND)","Bakrol Gate → Vaibhav Cinema → Raghuvir Chembers → Bhaikaka → APC → Town Hall → New Bus Stop → Baggi → Borsad Chowkdi → Ganesh Chowkdi → Chikhodra Chowkdi → Bedva → Sarsa → Khambholaj → Savli College")) ;
       allItems.add(new ItemObject("Route 24 (TULSIDHAM)","Tulsi Dham char rasta → Saraswati complex → Ramesh Patel (Manjalpur) → Rajmahal Road → Salatwada → Nagarwada → Amitnagar char rasta → Sama talav → Savli College"));
       allItems.add(new ItemObject("Route 26 (TARSALI)","Tarsali (Ganga Sagar) → Tarsali (Market) → Tarsali Mandir → Soma Talav → Vrundavan char rasta → New Ring Road → Amitnagar char rasta → Sama Talav → Savli College"));
       allItems.add(new ItemObject("Route 27 (AKSHAR CHOWK)","Akshar Chowk → Mujmahuda → Akota Garden → Cow Circle → Havmore → Genda Circle → Amitnagar char rasta → Sama talav → Savli College"));
        allItems.add(new ItemObject("Route 29 (MILITARY BOYS HOSTEL)","Military Boys Hostel → Jal Jyot → Chanakyapuri → Sama Garden → Sama Talav → Savli College"));
        allItems.add(new ItemObject("Route 31 (MANEJA)","Gayatri Nagar → Maneja → Maneja Crossing → Makarpura → Hunuman Temple → Novino → Susen → Tarsali → Soma Talav → Vrundavan char rasta → Ring Road → Airport Circle → Amitnagar char rasta → Sama Talav → Savli College"));
        allItems.add(new ItemObject("Route 32 (NADIAD)","Nadiad S.T. Bus Stop → Santram Mandir → City Point ss→ Maha Gujarat → Vaniavad → Uttarsanda → Chaklasi → Kasor → Bhalej → Ode Chaukdi # → Shili → Ahima → Savli College"));
        allItems.add(new ItemObject("Route 33 (UMRETH - DAKOR)","Dakor Bus Stand → Umreth → Bechari → Sureli → Sundalpura → Savli College"));


        return allItems;
    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
         rcAdapter.getFilter().filter(newText);
        return true;
    }
}
