package mr414.co1106.groupapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import mr414.co1106.groupapp.Helper;
import mr414.co1106.groupapp.R;
import mr414.co1106.groupapp.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private String[] listview_array={ "EVENT ONE", "EVENT TWO", "EVENT THREE", "EVENT FOUR", "EVENT FIVE", "EVENT SIX", "EVENT SEVEN", "EVENT EIGHT", "EVENT NINE", "EVENT TEN","EVENT ELEVEN","EVENT TWELVE","EVENT THIRTEEN","EVENT FOURTEEN","EVENT FIFTEEN" };
    ListView myList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        myList=(ListView)root.findViewById(R.id.event_listing);
        ArrayAdapter<String> listViewAdapter= new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, listview_array);
        myList.setAdapter(listViewAdapter);
        Helper.getListViewSize(myList);


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}