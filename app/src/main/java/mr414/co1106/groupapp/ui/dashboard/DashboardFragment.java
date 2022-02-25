package mr414.co1106.groupapp.ui.dashboard;

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
import mr414.co1106.groupapp.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;
    private String[] listview_array={ "EVENT ONE", "EVENT TWO", "EVENT THREE", "EVENT FOUR", "EVENT FIVE", "EVENT SIX" };
    ListView myList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        myList=(ListView)root.findViewById(R.id.day);
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