<recipe>
cd     <#include "../common/recipe_simple_menu.xml.ftl" />

    <instantiate from="root/res/layout/activity_fragment_container.xml.ftl"
                   to="${escapeXmlAttribute(resOut)}/layout/${simpleLayoutName}.xml" />

    <instantiate from="root/res/layout/fragment_simple.xml.ftl"
                   to="${escapeXmlAttribute(resOut)}/layout/${fragmentLayoutName}.xml" />

    <instantiate from="root/src/app_package/SimpleActivityFragment.ftl"
                   to="${escapeXmlAttribute(srcOut)}/${fragmentClass}.java" />
</recipe>
