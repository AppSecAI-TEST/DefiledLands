package lykrast.defiledlands.client.render.entity;

import lykrast.defiledlands.common.entity.EntityShambler;
import lykrast.defiledlands.core.DefiledLands;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelEnderman;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerEndermanEyes;
import net.minecraft.client.renderer.entity.layers.LayerHeldBlock;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderShambler extends RenderLiving<EntityShambler> {
	
	private static final ResourceLocation TEXTURES = new ResourceLocation(DefiledLands.MODID + ":textures/entity/shambler.png");
	
    public static final Factory FACTORY = new Factory();
	
	public RenderShambler(RenderManager renderManagerIn)
    {
        super(renderManagerIn, new ModelEnderman(0.0F), 0.5F);
    }

    public ModelEnderman getMainModel()
    {
        return (ModelEnderman)super.getMainModel();
    }
    
    public void doRender(EntityShambler entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        ModelEnderman modelenderman = this.getMainModel();

        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }
	
    protected ResourceLocation getEntityTexture(EntityShambler entity)
    {
        return TEXTURES;
    }

    public static class Factory implements IRenderFactory<EntityShambler> {

        @Override
        public Render<? super EntityShambler> createRenderFor(RenderManager manager) {
            return new RenderShambler(manager);
        }

    }

}