package lab13.Iterator.example;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator{
    private Facebook facebook;
    private String email, type;

    private int currentPosition = 0;
    private List<Profile> profiles = new ArrayList<>();
    private List<String> emails = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String type, String email) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.email, this.type);
            for (String profile : profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }



    @Override
    public Profile getNext() {
        if (!hasMore()) {
            return null;
        }

        String friendEmail = emails.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = facebook.requestProfileFromFacebook(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }

    @Override
    public boolean hasMore() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
