{ inputs, config, pkgs, ... }:{


imports = [
    inputs.ax-shell.homeManagerModules.default
  ];

  programs.ax-shell = {
    enable = true;
    settings = {
    bar = {
        position = "Top"; # "Top", "Bottom", "Left", "Right"
        theme = "Pills";  # "Pills", "Dense", "Edge"
      };
    dock.enable = true; # Disable the dock
      panel.theme = "Notch"; # "Notch", "Panel"
      keybindings.launcher = { prefix = "SUPER"; suffix = "SPACE"; };
    };
  };

  # Ax-Shell needs Hyprland to run. See the integration guide below.
  wayland.windowManager.hyprland = {
    enable = true;
    settings = {
      # ... your other Hyprland settings (monitors, animations, etc.)

      # --- Ax-Shell Integration ---
      # Use the '++' operator to merge Ax-Shell's binds with your own.
      bind = config.programs.ax-shell.hyprlandBinds ++ [
        # Add your custom keybinds here
        "SUPER, return, exec, alacritty"
        "SUPER, C, killactive,"
      ];

      # Merge Ax-Shell's startup commands with your own.
      exec-once = config.programs.ax-shell.hyprlandExecOnce ++ [
        # Your other startup apps
      ];
    };
  };

	home.stateVersion = "25.05";
	home.username = "szyroi";
	home.homeDirectory = "/home/szyroi";
	programs.home-manager.enable = true;
        nixpkgs.config.allowUnfree = true;

	home.packages = with pkgs; [
	nerd-fonts.jetbrains-mono
	papirus-icon-theme
	bibata-cursors
	easyeffects
	obsidian
	vesktop
	fastfetch
	starship
	mpv
	geeqie
	hyprpaper
	vscode
	];
	

	# === Cursor Theme ===
    home.pointerCursor = {
    package = pkgs.bibata-cursors;
    name = "Bibata-Modern-Classic";
    size = 24;
    gtk.enable = true;
    x11.enable = true;
   };

 #	=== Font Settings ===
  fonts.fontconfig.enable = true;

  gtk.font = {
    name = "JetBrainsMono Nerd Font 12";
  };



 # === Hyprland ===
  


 # === Programm Configs ===

  	# == Alacritty ==

	programs.alacritty = {
	enable = true;
	settings = {
		window.opacity = 0.9;
		font.normal = {
			family = "Jetbrains Mono Nerd Font";
			style = "Regular";
		};
		font.size = 12;
	};
    };

 	# == Bash ==

	programs.bash = {
    enable = true;
    bashrcExtra = ''
      if command -v fastfetch >/dev/null 2>&1; then
        fastfetch
      fi
    '';
      };





}
