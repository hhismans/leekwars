/*---------------------
CHOSE GAME CONTEXT
----------------------*/
include("fightContextGarden");
include("fightContextChallenge");
//include('fightContextTeam');
//include('fightContextFarmer');
//include('fightContextTournament');

var fightContext = getFightContext();
var fightType = getFightType();
var myFriends = ["FTpoireau", "177", "leekarantedeu", "Silicat", "null"];

if (fightContext == FIGHT_CONTEXT_GARDEN || fightContext == FIGHT_CONTEXT_TOURNAMENT)
{
	debug('fight context garden');
	if (fightType == FIGHT_TYPE_SOLO)
	{
		debug('fight type solo');
		fightContextGarden();
	}
	else if (fightType == FIGHT_TYPE_TEAM)
	{
		debug('fight type team');
		fightContextGarden();
	}
	else if (fightType == FIGHT_TYPE_FARMER)
	{
		debug('fight type farmer');
		fightContextGarden();
	}
}
else if (fightContext == FIGHT_CONTEXT_TEST)
{
	debug('fight context test');
	if (fightType == FIGHT_TYPE_SOLO)
	{
		debug('fight type farmer');
		fightContextGarden();
	}
	else if (fightType == FIGHT_TYPE_TEAM)
	{
		debug('fight type farmer');
		fightContextGarden();
	}
	else if (fightType == FIGHT_TYPE_FARMER)
	{
		debug('fight type farmer');
		fightContextGarden();
	}
}
else if (fightContext == FIGHT_CONTEXT_CHALLENGE)
{
	debug('fight context challenge');
	var i = 0;
	var enemyName = getName(getNearestEnemy());

	while (myFriends[i] != "null")
	{
		if (myFriends[i] == enemyName)
		{
			debug('Fight type friend');
			fightContextGarden();
			return ;
		}
		i++;
	}
	debug('fight type !friend');
	fightContextChallenge();
}

