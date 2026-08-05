/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package ticket.service.impl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

import ticket.service.base.TicketLocalServiceBaseImpl;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=ticket.model.Ticket",
	service = AopService.class
)
public class TicketLocalServiceImpl extends TicketLocalServiceBaseImpl {
}
// LIFERAY-SERVICE-BUILDER-HASH:1612458912