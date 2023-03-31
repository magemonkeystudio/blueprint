package fr.weefle.constructor.extra;

import com.denizenscript.denizen.npc.traits.AssignmentTrait;
import com.denizenscript.denizen.objects.NPCTag;
import com.denizenscript.denizen.utilities.implementation.BukkitScriptEntryData;
import com.denizenscript.denizencore.scripts.ScriptRegistry;
import com.denizenscript.denizencore.scripts.containers.core.TaskScriptContainer;
import net.citizensnpcs.api.npc.NPC;

public class DenizenSupport {

    public static boolean runTask(String taskName, NPC npc) {
        NPCTag              dnpc = new NPCTag(npc);
        TaskScriptContainer task = ScriptRegistry.getScriptContainerAs(taskName, TaskScriptContainer.class);
        if (task != null) {
            task.run(new BukkitScriptEntryData(null, dnpc), null);
            return true;
        }
        return false;
    }

    public static void runAction(NPC npc, String action) throws Exception {
        if (npc.hasTrait(AssignmentTrait.class)) {
            NPCTag dnpc = new NPCTag(npc);
            dnpc.action(action, null);
        }
    }
}