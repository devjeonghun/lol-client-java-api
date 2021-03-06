package generated;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class LolClashTournamentUpdatedNotification {

	public Integer currentRetry;
	public Integer maxRetry;
	public List<Long> missingPlayerIds;
	public Boolean missingPlayersOnMyTeam;
	public Boolean missingPlayersOnOpposingTeam;
	public LolClashRosterNotifyReason notifyReason;
	public Long retrySeconds;

}