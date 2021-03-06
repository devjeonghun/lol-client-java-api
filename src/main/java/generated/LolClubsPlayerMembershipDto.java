package generated;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class LolClubsPlayerMembershipDto {

	public List<LolClubsClubDto> activeClubs;
	public LolClubsClubsServerConfigDto clubsServerConfig;
	public List<LolClubsMembershipInviteDto> pendingInvites;
	public LolClubsPlayerInfoDto player;
	public LolClubsPlayerMembershipPreferencesDto playerClubPreferences;
	public List<LolClubsClubReferenceDto> removedClubs;
	public String resourceUri;
	public List<LolClubsClubReferenceDto> revokedInviteClubs;
	public String secureClubPresenceInfoString;

}