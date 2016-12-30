package org.openhab.binding.heos.resources;

public class HeosCommands {

    private String playerID = "";
    private String username = "";
    private String password = "";

    // System Commands
    private String registerChangeEventOn = "heos://system/register_for_change_events?enable=on";
    private String registerChangeEventOFF = "heos://system/register_for_change_events?enable=off";
    private String heosAccountCheck = "heos://system/check_account";
    private String prettifyJSONon = "heos://system/prettify_json_response?enable=on";
    private String prettifyJSONoff = "heos://system/prettify_json_response?enable=off";
    private String rebootSystem = "heos://system/reboot";
    private String signIn = "heos://system/sign_in?un=" + username + "&pw=" + password;
    private String signOut = "heos://system/sign_out";

    // Player Commands Control
    private String setPlayStatePlay = "heos://player/set_play_state?pid=";
    private String setPlayStatePause = "heos://player/set_play_state?pid=";
    private String setPlayStateStop = "heos://player/set_play_state?pid=";
    private String setVolume = "heos://player/set_volume?pid=";
    private String volumeUp = "heos://player/volume_up?pid=";
    private String volumeDown = "heos://player/volume_down?pid=";
    private String setMuteOn = "heos://player/set_mute?pid=";
    private String setMuteOff = "heos://player/set_mute?pid=";
    private String setMuteToggle = "heos://player/toggle_mute?pid=";
    private String playNext = "heos://player/play_next?pid=";
    private String playPrevious = "heos://player/play_previous?pid=";
    private String playQueueItem = "heos://player/play_queue?pid=";
    private String clearQueue = "heos://player/clear_queue?pid=";
    // private String saveQueueToPlayList = ""

    // Player Commands get Information

    private String getPlayers = "heos://player/get_players";
    private String getPlayerInfo = "heos://player/get_player_info?pid=";
    private String getPlayState = "heos://player/get_play_state?pid=";
    private String getNowPlayingMedia = "heos://player/get_now_playing_media?pid=";
    private String getVolume = "heos://player/get_volume?pid=";
    private String getMute = "heos://player/get_mute?pid=";
    private String getQueue = "heos://player/get_queue?pid=";

    // Browse Commands
    private String getMusicSources = "heos://browse/get_music_sources";
    private String browseSource = "heos://browse/browse";
    private String playStation = "heos://browse/play_stream?pid=";
    private String addToQueue = "heos://browse/add_to_queue?pid=";

    // private Sring playAuxIn = "heos://"

    public HeosCommands() {

    }

    public HeosCommands(String playerID) {

        this.playerID = playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getPlayerID() {
        return playerID;
    }

    public String registerChangeEventOn() {
        return registerChangeEventOn + "\r\n";
    }

    public String registerChangeEventOFF() {
        return registerChangeEventOFF + "\r\n";
    }

    public String heosAccountCheck() {
        return heosAccountCheck;
    }

    public String setPlayStatePlay(String pid) {
        return setPlayStatePlay + pid + "&state=play";
    }

    public String setPlayStatePause(String pid) {
        return setPlayStatePause + pid + "&state=pause";
    }

    public String setPlayStateStop(String pid) {
        return setPlayStateStop + pid + "&state=stop";
    }

    public String volumeUp(String pid) {
        return volumeUp + pid + "&step=1";
    }

    public String volumeDown(String pid) {
        return volumeDown + pid + "&step=1";
    }

    public String setMuteOn(String pid) {
        return setMuteOn + pid + "&state=on";
    }

    public String setMuteOff(String pid) {
        return setMuteOff + pid + "&state=off";
    }

    public String setMuteToggle(String pid) {
        return setMuteToggle + pid + "&state=off";
    }

    public String playNext(String pid) {
        return playNext + pid;
    }

    public String playPrevious(String pid) {
        return playPrevious + pid;
    }

    public String setVolume(String vol, String pid) {
        return setVolume + pid + "&level=" + vol;
    }

    public String getPlayers() {
        return getPlayers;
    }

    public String getPlayerInfo(String pid) {
        return getPlayerInfo + pid;
    }

    public String getPlayState(String pid) {
        return getPlayState + pid;
    }

    public String getNowPlayingMedia(String pid) {
        return getNowPlayingMedia + pid;
    }

    public String getVolume(String pid) {
        return getVolume + pid;
    }

    public String getMusicSources() {
        return getMusicSources;
    }

    public String prettifyJSONon() {
        return prettifyJSONon;
    }

    public String prettifyJSONoff() {
        return prettifyJSONoff;
    }

    public String getMute(String pid) {
        return getMute + pid;
    }

    public String getQueue(String pid) {
        return getQueue + pid;
    }

    public String playQueueItem(String pid) {
        return playQueueItem + pid;
    }

    public String BrowseSource() {
        return browseSource;
    }

    public String PlayStation(String pid) {
        return playStation + pid;
    }

    public String addToQueue(String pid) {
        return addToQueue + pid;
    }

    public String clearQueue(String pid) {
        return clearQueue + pid;
    }

    public String rebootSystem() {
        return rebootSystem;
    }

    public void setUsernamePwassword(String username, String password) {
        this.username = username;
        this.password = password;
        signIn = "heos://system/sign_in?un=" + this.username + "&pw=" + this.password;
    }

    public String signIn() {
        if (!username.isEmpty() && !password.isEmpty()) {
            return signIn;
        } else {
            System.out.println("No user Data set");
            return null;
        }

    }

    public String signIn(String username, String password) {
        return "heos://system/sign_in?un=" + username + "&pw=" + password;
    }

    public String signOut() {
        return signOut;
    }

}
