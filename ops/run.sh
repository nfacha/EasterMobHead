#bin/bash
rm -rf test-server/plugins/EasterMobHead.jar
cp target/EasterMobHead.jar test-server/plugins/EasterMobHead.jar
cd test-server
java -DIReallyKnowWhatIAmDoingISwear=true -jar spigot-1.16.5.jar nogui