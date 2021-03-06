
package com.example.zx.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GitModel implements Parcelable
{

    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("gravatar_id")
    @Expose
    private String gravatarId;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("followers_url")
    @Expose
    private String followersUrl;
    @SerializedName("following_url")
    @Expose
    private String followingUrl;
    @SerializedName("gists_url")
    @Expose
    private String gistsUrl;
    @SerializedName("starred_url")
    @Expose
    private String starredUrl;
    @SerializedName("subscriptions_url")
    @Expose
    private String subscriptionsUrl;
    @SerializedName("organizations_url")
    @Expose
    private String organizationsUrl;
    @SerializedName("repos_url")
    @Expose
    private String reposUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("received_events_url")
    @Expose
    private String receivedEventsUrl;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("site_admin")
    @Expose
    private boolean siteAdmin;
    @SerializedName("name")
    @Expose
    private Object name;
    @SerializedName("company")
    @Expose
    private Object company;
    @SerializedName("blog")
    @Expose
    private Object blog;
    @SerializedName("location")
    @Expose
    private Object location;
    @SerializedName("email")
    @Expose
    private Object email;
    @SerializedName("hireable")
    @Expose
    private Object hireable;
    @SerializedName("bio")
    @Expose
    private Object bio;
    @SerializedName("public_repos")
    @Expose
    private int publicRepos;
    @SerializedName("public_gists")
    @Expose
    private int publicGists;
    @SerializedName("followers")
    @Expose
    private int followers;
    @SerializedName("following")
    @Expose
    private int following;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    public final static Creator<GitModel> CREATOR = new Creator<GitModel>() {


        @SuppressWarnings({
            "unchecked"
        })
        public GitModel createFromParcel(Parcel in) {
            GitModel instance = new GitModel();
            instance.login = ((String) in.readValue((String.class.getClassLoader())));
            instance.id = ((int) in.readValue((int.class.getClassLoader())));
            instance.avatarUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.gravatarId = ((String) in.readValue((String.class.getClassLoader())));
            instance.url = ((String) in.readValue((String.class.getClassLoader())));
            instance.htmlUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.followersUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.followingUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.gistsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.starredUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.subscriptionsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.organizationsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.reposUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.eventsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.receivedEventsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.type = ((String) in.readValue((String.class.getClassLoader())));
            instance.siteAdmin = ((boolean) in.readValue((boolean.class.getClassLoader())));
            instance.name = ((Object) in.readValue((Object.class.getClassLoader())));
            instance.company = ((Object) in.readValue((Object.class.getClassLoader())));
            instance.blog = ((Object) in.readValue((Object.class.getClassLoader())));
            instance.location = ((Object) in.readValue((Object.class.getClassLoader())));
            instance.email = ((Object) in.readValue((Object.class.getClassLoader())));
            instance.hireable = ((Object) in.readValue((Object.class.getClassLoader())));
            instance.bio = ((Object) in.readValue((Object.class.getClassLoader())));
            instance.publicRepos = ((int) in.readValue((int.class.getClassLoader())));
            instance.publicGists = ((int) in.readValue((int.class.getClassLoader())));
            instance.followers = ((int) in.readValue((int.class.getClassLoader())));
            instance.following = ((int) in.readValue((int.class.getClassLoader())));
            instance.createdAt = ((String) in.readValue((String.class.getClassLoader())));
            instance.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public GitModel[] newArray(int size) {
            return (new GitModel[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The login
     */
    public String getLogin() {
        return login;
    }

    /**
     * 
     * @param login
     *     The login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * 
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 
     * @param avatarUrl
     *     The avatar_url
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * 
     * @return
     *     The gravatarId
     */
    public String getGravatarId() {
        return gravatarId;
    }

    /**
     * 
     * @param gravatarId
     *     The gravatar_id
     */
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The htmlUrl
     */
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * 
     * @param htmlUrl
     *     The html_url
     */
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * 
     * @return
     *     The followersUrl
     */
    public String getFollowersUrl() {
        return followersUrl;
    }

    /**
     * 
     * @param followersUrl
     *     The followers_url
     */
    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    /**
     * 
     * @return
     *     The followingUrl
     */
    public String getFollowingUrl() {
        return followingUrl;
    }

    /**
     * 
     * @param followingUrl
     *     The following_url
     */
    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    /**
     * 
     * @return
     *     The gistsUrl
     */
    public String getGistsUrl() {
        return gistsUrl;
    }

    /**
     * 
     * @param gistsUrl
     *     The gists_url
     */
    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    /**
     * 
     * @return
     *     The starredUrl
     */
    public String getStarredUrl() {
        return starredUrl;
    }

    /**
     * 
     * @param starredUrl
     *     The starred_url
     */
    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    /**
     * 
     * @return
     *     The subscriptionsUrl
     */
    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    /**
     * 
     * @param subscriptionsUrl
     *     The subscriptions_url
     */
    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    /**
     * 
     * @return
     *     The organizationsUrl
     */
    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    /**
     * 
     * @param organizationsUrl
     *     The organizations_url
     */
    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    /**
     * 
     * @return
     *     The reposUrl
     */
    public String getReposUrl() {
        return reposUrl;
    }

    /**
     * 
     * @param reposUrl
     *     The repos_url
     */
    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    /**
     * 
     * @return
     *     The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     * 
     * @param eventsUrl
     *     The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    /**
     * 
     * @return
     *     The receivedEventsUrl
     */
    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    /**
     * 
     * @param receivedEventsUrl
     *     The received_events_url
     */
    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The siteAdmin
     */
    public boolean isSiteAdmin() {
        return siteAdmin;
    }

    /**
     * 
     * @param siteAdmin
     *     The site_admin
     */
    public void setSiteAdmin(boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    /**
     * 
     * @return
     *     The name
     */
    public Object getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(Object name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The company
     */
    public Object getCompany() {
        return company;
    }

    /**
     * 
     * @param company
     *     The company
     */
    public void setCompany(Object company) {
        this.company = company;
    }

    /**
     * 
     * @return
     *     The blog
     */
    public Object getBlog() {
        return blog;
    }

    /**
     * 
     * @param blog
     *     The blog
     */
    public void setBlog(Object blog) {
        this.blog = blog;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Object getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Object location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The email
     */
    public Object getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    public void setEmail(Object email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The hireable
     */
    public Object getHireable() {
        return hireable;
    }

    /**
     * 
     * @param hireable
     *     The hireable
     */
    public void setHireable(Object hireable) {
        this.hireable = hireable;
    }

    /**
     * 
     * @return
     *     The bio
     */
    public Object getBio() {
        return bio;
    }

    /**
     * 
     * @param bio
     *     The bio
     */
    public void setBio(Object bio) {
        this.bio = bio;
    }

    /**
     * 
     * @return
     *     The publicRepos
     */
    public int getPublicRepos() {
        return publicRepos;
    }

    /**
     * 
     * @param publicRepos
     *     The public_repos
     */
    public void setPublicRepos(int publicRepos) {
        this.publicRepos = publicRepos;
    }

    /**
     * 
     * @return
     *     The publicGists
     */
    public int getPublicGists() {
        return publicGists;
    }

    /**
     * 
     * @param publicGists
     *     The public_gists
     */
    public void setPublicGists(int publicGists) {
        this.publicGists = publicGists;
    }

    /**
     * 
     * @return
     *     The followers
     */
    public int getFollowers() {
        return followers;
    }

    /**
     * 
     * @param followers
     *     The followers
     */
    public void setFollowers(int followers) {
        this.followers = followers;
    }

    /**
     * 
     * @return
     *     The following
     */
    public int getFollowing() {
        return following;
    }

    /**
     * 
     * @param following
     *     The following
     */
    public void setFollowing(int following) {
        this.following = following;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(login);
        dest.writeValue(id);
        dest.writeValue(avatarUrl);
        dest.writeValue(gravatarId);
        dest.writeValue(url);
        dest.writeValue(htmlUrl);
        dest.writeValue(followersUrl);
        dest.writeValue(followingUrl);
        dest.writeValue(gistsUrl);
        dest.writeValue(starredUrl);
        dest.writeValue(subscriptionsUrl);
        dest.writeValue(organizationsUrl);
        dest.writeValue(reposUrl);
        dest.writeValue(eventsUrl);
        dest.writeValue(receivedEventsUrl);
        dest.writeValue(type);
        dest.writeValue(siteAdmin);
        dest.writeValue(name);
        dest.writeValue(company);
        dest.writeValue(blog);
        dest.writeValue(location);
        dest.writeValue(email);
        dest.writeValue(hireable);
        dest.writeValue(bio);
        dest.writeValue(publicRepos);
        dest.writeValue(publicGists);
        dest.writeValue(followers);
        dest.writeValue(following);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
    }

    public int describeContents() {
        return  0;
    }

}
