# HyperOS Quick Share Tile

I'm fed up with some recent HyperOS versions not showing the Quick Share tile for quick access when needed, this app was created to solve this problem not only for HyperOS but for all other Chinese ROMs as well, allowing for quick access to Quick Share interface.

## Features
- No launcher icon needed
- Quick Share tile is exactly the same as the one of Play Services
- Tap the tile to open
- Long press the tile to open Quick Share settings
- Very SMOLL

## How It Works

The app does not implement Quick Share itself, it acts as a lightweight launcher for the following Google Play Services activities:

`com.google.android.gms.nearby.sharing.main.MainActivity`

`com.google.android.gms.nearby.sharing.main.SettingsMainActivity`

### Quick Settings

```text
Quick Share Tile
       │
       ├── Single press
       │    └── MainActivity
       |
       └── Long press
            └── SettingsMainActivity
```
## Requirements
- Android 14+ (HyperOS 1 and up)
- Basic Google services have been enabled in Accounts & Sync (only for Chinese ROMs)

### This project was NOT CREATED to solve the problem of not having Quick Share, you must first be able to access Quick Share through any activity launcher app

## Build
### Android Studio
- Clone the repository:
```
git clone https://github.com/Lewewe/HyperOS-QuickShareTile.git
cd HyperOS-QuickShareTile
```
- Open the project in Android Studio.
- Sync the gradle
- Build the APK:
```
./gradlew assembleRelease
```
- APK location:
```
app/build/outputs/apk/release/app-release.apk
```
- Install it on your device
- Profit!

## Disclaimer

This is an unofficial third-party project and is not affiliated with,
endorsed by, or sponsored by Google.

"Google", "Quick Share", and related names, logos, and trademarks belong to Google

The Quick Share icon assets included in this project are derived from
Google Play Services and are not claimed as original artwork of this project.

## License

The original source code of this project is licensed under the MIT License.
See LICENSE
