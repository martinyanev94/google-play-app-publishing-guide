@Override
public void onTitlesListItemSelected(int position) {
    Bundle args = new Bundle();
    args.putInt("Position", position);
    ViewFragment fragment = new ViewFragment();
    fragment.setArguments(args);
    getFragmentManager().beginTransaction().replace(R.id.fragmentHolder, fragment).commit();
}
