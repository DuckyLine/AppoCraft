package fr.line.appocraft.thirst;

import net.minecraft.world.entity.player.Player;
import net.neoforged.neoforge.capabilities.EntityCapability;

public class ThirstManager {

    public static void onPlayerTick(Player player) {
        // Récupérer la capacité de soif pour le joueur de manière statique
        Thirst playerThirst = (Thirst) EntityCapabilities.getCapability(player, null); // récupère l'instance de Thirst

        // Vérifier que la capacité de soif existe pour le joueur
        if (playerThirst != null) {
            // Ajouter de la soif (par exemple, augmenter la soif de 1)
            playerThirst.setThirst(playerThirst.getThirst() + 1);

            // Afficher le niveau de soif actuel
            System.out.println("Soif actuelle du joueur " + player.getName() + ": " + playerThirst.getThirst());
        } else {
            System.out.println("Aucune capacité de soif trouvée pour le joueur " + player.getName());
        }
    }
}