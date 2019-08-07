package com.example.actionbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Created by User on 2/28/2017.
 */

public class Tab2Fragment extends Fragment implements CompoundButton.OnCheckedChangeListener{

    ToggleButton BFSword;
    boolean BFSwordStatus;
    ToggleButton GiantsBelt;
    boolean GiantsBeltStatus;
    ToggleButton Rod;
    boolean RodStatus;
    ToggleButton Vest;
    boolean VestStatus;
    ToggleButton Bow;
    boolean BowStatus;
    ToggleButton Tear;
    boolean TearStatus;
    ToggleButton Cloak;
    boolean CloakStatus;
    ToggleButton Spat;
    boolean SpatStatus;

    ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout,container,false);
        BFSword = (ToggleButton) view.findViewById(R.id.toggleBF);
        GiantsBelt = (ToggleButton) view.findViewById(R.id.toggleGB);
        Rod = (ToggleButton) view.findViewById(R.id.toggleRod);
        Vest = (ToggleButton) view.findViewById(R.id.toggleCV);
        Bow = (ToggleButton) view.findViewById(R.id.toggleBow);
        Tear = (ToggleButton) view.findViewById(R.id.toggleTear);
        Cloak = (ToggleButton) view.findViewById(R.id.toggleCloak);
        Spat = (ToggleButton) view.findViewById(R.id.toggleSpat);



        BFSword.setOnCheckedChangeListener(this);
        GiantsBelt.setOnCheckedChangeListener(this);
        Rod.setOnCheckedChangeListener(this);
        Vest.setOnCheckedChangeListener(this);
        Bow.setOnCheckedChangeListener(this);
        Tear.setOnCheckedChangeListener(this);
        Cloak.setOnCheckedChangeListener(this);
        Spat.setOnCheckedChangeListener(this);


        imageView = (ImageView) view.findViewById(R.id.combinedItem);

        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        if(compoundButton == BFSword){
            if(isChecked){//BFSword is Clicked
                BFSwordStatus = true;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.infinityedge));
                if(GiantsBeltStatus){//clicked and giants belt
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.zeke));
                }
                else if (RodStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.hextech));
                }
                else if (VestStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.guardiansangel));
                }
                else if(BowStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.sworddivine));
                }
                else if(TearStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.shojin));
                }
                else if(CloakStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.bloodthirster));
                }
                else if(SpatStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.youmuu));
                }

            }
            else{
                BFSwordStatus = false;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.tfticon));
            }
        }
        else if(compoundButton == GiantsBelt){
            if(isChecked){
                GiantsBeltStatus = true;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.warmogs));
                if(BFSwordStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.zeke));
                }
                else if(RodStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.morello));
                }
                else if(VestStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.redbuff));
                }
                else if(BowStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.titanic));
                }
                else if(TearStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.redemption));
                }
                else if(CloakStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.zephyr));
                }
                else if(SpatStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.forzenmallet));
                }
            }
            else{
                GiantsBeltStatus = false;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.tfticon));
            }
        }
        else if(compoundButton == Rod){
            if(isChecked){
                RodStatus = true;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.rabadons));
                if(BFSwordStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.hextech));
                }
                else if (GiantsBeltStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.morello));
                }
                else if(VestStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.locket));
                }
                else if (BowStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.guinsoo));
                }
                else if(TearStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.luden));
                }
                else if(CloakStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ionic));
                }
                else if(SpatStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.yuumi));
                }
            }
            else{
                RodStatus = false;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.tfticon));
            }
        }
        else if(compoundButton == Vest){
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.thornmail));
            if(isChecked){
                VestStatus = true;
                if(BFSwordStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.guardiansangel));
                }
                else if (GiantsBeltStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.redbuff));
                }
                else if (RodStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.locket));
                }
                else if (BowStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.phantom));
                }
                else if(TearStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.frozenh));
                }
                else if(CloakStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.swordbreaker));
                }
                else if(SpatStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.knightsvow));
                }
            }
            else{
                VestStatus = false;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.tfticon));
            }
        }
        else if(compoundButton == Bow){
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.rfc));
            if(isChecked){
                BowStatus = true;
                if(BFSwordStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.sworddivine));
                }
                else if (GiantsBeltStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.titanic));
                }
                else if (RodStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.guinsoo));
                }
                else if (VestStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.phantom));
                }
                else if(TearStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.shiv));
                }
                else if(CloakStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.cursedblade));
                }
                else if(SpatStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.bork));
                }
            }
            else{
                BowStatus = false;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.tfticon));
            }
        }
        else if(compoundButton == Tear){
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.seraphs));
            if(isChecked){
                TearStatus = true;
                if(BFSwordStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.shojin));
                }
                else if (GiantsBeltStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.redemption));
                }
                else if (RodStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.luden));
                }
                else if (VestStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.frozenh));
                }
                else if(BowStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.shiv));
                }
                else if(CloakStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.hush));
                }
                else if(SpatStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.darkin));
                }
            }
            else{
                TearStatus = false;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.tfticon));
            }
        }
        else if(compoundButton == Cloak){
            if(isChecked){
                CloakStatus = true;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.dragonclaw));
                if(BFSwordStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.bloodthirster));
                }
                else if (GiantsBeltStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.zephyr));
                }
                else if (RodStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ionic));
                }
                else if (VestStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.swordbreaker));
                }
                else if(BowStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.cursedblade));
                }
                else if(TearStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.hush));
                }
                else if(SpatStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.runann));
                }
            }
            else{
                CloakStatus = false;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.tfticon));
            }
        }
        else if(compoundButton == Spat){
            if(isChecked){
                SpatStatus = true;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.forceofnature));
                if(BFSwordStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.youmuu));
                }
                else if (GiantsBeltStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.forzenmallet));
                }
                else if (RodStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.yuumi));
                }
                else if (VestStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.knightsvow));
                }
                else if(BowStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.bork));
                }
                else if(TearStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.darkin));
                }
                else if (CloakStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.runann));
                }
            }
            else{
                SpatStatus = false;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.tfticon));
            }
        }
    }
}