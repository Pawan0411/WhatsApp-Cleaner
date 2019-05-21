package com.example.pawan.whatsAppcleaner.tabs;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.pawan.whatsAppcleaner.DataHolder;

public class TabsAdapter extends FragmentStatePagerAdapter {
    private String receivedPath;
    private String sentPath;
    private String category;

    TabsAdapter(FragmentManager fm, String category, String receivedPath, String sentPath) {
        super(fm);
        this.category = category;
        this.receivedPath = receivedPath;
        this.sentPath = sentPath;
    }

    @Override
    public Fragment getItem(int i) {
        switch (category) {
            default:
            case DataHolder.IMAGE:
                switch (i) {
                    default:
                    case 0:
                        return FilesFragment.newInstance(DataHolder.IMAGE, receivedPath);
                    case 1:
                        return FilesFragment.newInstance(DataHolder.IMAGE, sentPath);
                }
            case DataHolder.DOCUMENT:
                switch (i) {
                    default:
                    case 0:
                        return FilesFragment.newInstance(DataHolder.DOCUMENT, receivedPath);
                    case 1:
                        return FilesFragment.newInstance(DataHolder.DOCUMENT, sentPath);
                }
            case DataHolder.VIDEO:
                switch (i) {
                    default:
                    case 0:
                        return FilesFragment.newInstance(DataHolder.VIDEO, receivedPath);
                    case 1:
                        return FilesFragment.newInstance(DataHolder.VIDEO, sentPath);
                }
            case DataHolder.AUDIO:
                switch (i) {
                    default:
                    case 0:
                        return FilesFragment.newInstance(DataHolder.AUDIO, receivedPath);
                    case 1:
                        return FilesFragment.newInstance(DataHolder.AUDIO, sentPath);
                }
            case DataHolder.GIF:
                switch (i) {
                    default:
                    case 0:
                        return FilesFragment.newInstance(DataHolder.GIF, receivedPath);
                    case 1:
                        return FilesFragment.newInstance(DataHolder.GIF, sentPath);
                }

        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Recieved Files";
            case 1:
                return "Sent Files";
            default:
                return "";
        }
    }
}
