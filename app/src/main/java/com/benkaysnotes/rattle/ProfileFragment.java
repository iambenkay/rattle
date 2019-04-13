package com.benkaysnotes.rattle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class ProfileFragment extends Fragment {
    RecyclerView rv;
    RVObject[] posts = {
            new Profile("Benjamin Kayode", "i_ambenkay", "Your friendly neighborhood nigerian", 333546, 35, 7123766),
            new Post("Benjamin Kayode", "i_ambenkay", "Hello... This is not how I would Usually waste my time but whadda heck.\n\n\nTwo years ago I became 36 hahaha!!!\n\nHow don't you go to a house every time.", true),
            new Post("FOUR EYED EDO BOY", "Alex_HouseOf308", "I know only 25 letters of the alphabet...\nI can't seem to know Y", false),
            new Post("AYOMIDE The FEMALE Artist", "cindeee", "A guy was arrested for sleeping with a horse...\n\nSuch a pity, that was his first stable relationship!!", false),
            new Post("Donald Trump Jnr", "realDonaldTrump", "This border wall is not gonna build itself. The Dems better give me the money or the Govt. stays shut down. covfefe", true),
            new Post("FOLLOW HELP", "followtrain", "Follow me for more followers. Follow everyone who likes this and get massive follow backs. Start Now.", false),
            new Post("IDK", "johnson345", "Ahswearugad, girls are confusing. One minute they're loving you the next minute they are breaking up because of ordinary valentine gift that i forgot.", false),
            new Post("FRANK EDO", "iamspreado", "So.....\n\nFor those of you that don't have blind girlfriends, how do you get away with forgetting their birthdays?", false),
            new Post("OLUJAMISON", "realJAMI", "One of my girlfriends finally confessed that she isn't blind...\n\nShit means she has been seeing other guys!!\n\nI broke up with the idiot, sharp sharp", false),
            new Footer(),
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View result = inflater.inflate(R.layout.profile_frag, container, false);

        rv = result.findViewById(R.id.recycler_view);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(new PostAdapter(getActivity(), posts));
        return result;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.profile_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
