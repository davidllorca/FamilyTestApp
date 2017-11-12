package me.test.davidllorca.familyapp.ui.listchildren;

import java.util.List;

import me.test.davidllorca.familyapp.data.model.Member;

/**
 * Contract between the View and the Presenter.
 *
 * Created by David Llorca <davidllorcabaron@gmail.com> on 11/11/17.
 */

public interface ListChildrenContract {

    interface View {

        void showChildren(List<Member> members);

    }

    interface Presenter {

        void loadData();

    }
}