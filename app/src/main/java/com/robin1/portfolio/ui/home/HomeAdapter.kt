package com.robin1.portfolio.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.robin1.portfolio.R
import com.robin1.portfolio.data.entities.HomeItemModel
import com.robin1.portfolio.data.entities.HomeItemType
import com.robin1.portfolio.databinding.ItemHomeSubtitleBinding
import com.robin1.portfolio.databinding.ItemHomeTitleBinding

class HomeAdapter(private val viewModel: HomeViewModel) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var homeItemArray = arrayListOf<HomeItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            TYPE_TITLE -> HomeTitleViewHolder(
                DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.item_home_title,
                    parent,
                    false
                )
            )
            TYPE_SUBTITLE -> HomeSubtitleViewHolder(
                DataBindingUtil.inflate(
                    LayoutInflater.from(
                        parent.context
                    ), R.layout.item_home_subtitle, parent, false
                )
            )
            else -> onCreateViewHolder(parent, viewType)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is HomeTitleViewHolder -> {
                (holder.itemView.layoutParams as StaggeredGridLayoutManager.LayoutParams).isFullSpan = true
                holder.onBind(homeItemArray[position])
            }
            is HomeSubtitleViewHolder -> {
                holder.onBind(homeItemArray[position])
            }
        }
    }

    override fun getItemCount() = homeItemArray.size

    override fun getItemViewType(position: Int): Int {
        return when (homeItemArray[position].type) {
            HomeItemType.TITLE -> TYPE_TITLE
            HomeItemType.SUBTITLE -> TYPE_SUBTITLE
        }
    }

    fun setItem(array: ArrayList<HomeItemModel>) {
        homeItemArray = array
        notifyItemRangeInserted(0, array.size)
    }


    inner class HomeTitleViewHolder(private val binding: ItemHomeTitleBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(homeItemModel: HomeItemModel) {
            binding.apply {
                model = homeItemModel
            }
        }
    }

    inner class HomeSubtitleViewHolder(private val binding: ItemHomeSubtitleBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(homeItemModel: HomeItemModel) {
            binding.apply {
                vm = viewModel
                model = homeItemModel
            }
        }
    }

    companion object {
        private const val TYPE_TITLE = 0
        private const val TYPE_SUBTITLE = 1
    }
}