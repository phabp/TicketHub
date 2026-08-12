/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package ticket.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

import ticket.exception.NoSuchTicketException;

import ticket.model.Ticket;

/**
 * The persistence interface for the ticket service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TicketUtil
 * @generated
 */
@ProviderType
public interface TicketPersistence extends BasePersistence<Ticket> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TicketUtil} to access the ticket persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the tickets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching tickets
	 */
	public java.util.List<Ticket> findByUuid(String uuid);

	/**
	 * Returns a range of all the tickets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TicketModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tickets
	 * @param end the upper bound of the range of tickets (not inclusive)
	 * @return the range of matching tickets
	 */
	public java.util.List<Ticket> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the tickets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TicketModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tickets
	 * @param end the upper bound of the range of tickets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tickets
	 */
	public java.util.List<Ticket> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Ticket>
			orderByComparator);

	/**
	 * Returns an ordered range of all the tickets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TicketModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tickets
	 * @param end the upper bound of the range of tickets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tickets
	 */
	public java.util.List<Ticket> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Ticket>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ticket in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ticket
	 * @throws NoSuchTicketException if a matching ticket could not be found
	 */
	public Ticket findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Ticket>
				orderByComparator)
		throws NoSuchTicketException;

	/**
	 * Returns the first ticket in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ticket, or <code>null</code> if a matching ticket could not be found
	 */
	public Ticket fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Ticket>
			orderByComparator);

	/**
	 * Returns the last ticket in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ticket
	 * @throws NoSuchTicketException if a matching ticket could not be found
	 */
	public Ticket findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Ticket>
				orderByComparator)
		throws NoSuchTicketException;

	/**
	 * Returns the last ticket in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ticket, or <code>null</code> if a matching ticket could not be found
	 */
	public Ticket fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Ticket>
			orderByComparator);

	/**
	 * Returns the tickets before and after the current ticket in the ordered set where uuid = &#63;.
	 *
	 * @param ticketId the primary key of the current ticket
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ticket
	 * @throws NoSuchTicketException if a ticket with the primary key could not be found
	 */
	public Ticket[] findByUuid_PrevAndNext(
			long ticketId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Ticket>
				orderByComparator)
		throws NoSuchTicketException;

	/**
	 * Removes all the tickets where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of tickets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching tickets
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the ticket where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTicketException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ticket
	 * @throws NoSuchTicketException if a matching ticket could not be found
	 */
	public Ticket findByUUID_G(String uuid, long groupId)
		throws NoSuchTicketException;

	/**
	 * Returns the ticket where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ticket, or <code>null</code> if a matching ticket could not be found
	 */
	public Ticket fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the ticket where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ticket, or <code>null</code> if a matching ticket could not be found
	 */
	public Ticket fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the ticket where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ticket that was removed
	 */
	public Ticket removeByUUID_G(String uuid, long groupId)
		throws NoSuchTicketException;

	/**
	 * Returns the number of tickets where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching tickets
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the tickets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching tickets
	 */
	public java.util.List<Ticket> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the tickets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TicketModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tickets
	 * @param end the upper bound of the range of tickets (not inclusive)
	 * @return the range of matching tickets
	 */
	public java.util.List<Ticket> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the tickets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TicketModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tickets
	 * @param end the upper bound of the range of tickets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tickets
	 */
	public java.util.List<Ticket> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Ticket>
			orderByComparator);

	/**
	 * Returns an ordered range of all the tickets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TicketModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tickets
	 * @param end the upper bound of the range of tickets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tickets
	 */
	public java.util.List<Ticket> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Ticket>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ticket in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ticket
	 * @throws NoSuchTicketException if a matching ticket could not be found
	 */
	public Ticket findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Ticket>
				orderByComparator)
		throws NoSuchTicketException;

	/**
	 * Returns the first ticket in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ticket, or <code>null</code> if a matching ticket could not be found
	 */
	public Ticket fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Ticket>
			orderByComparator);

	/**
	 * Returns the last ticket in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ticket
	 * @throws NoSuchTicketException if a matching ticket could not be found
	 */
	public Ticket findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Ticket>
				orderByComparator)
		throws NoSuchTicketException;

	/**
	 * Returns the last ticket in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ticket, or <code>null</code> if a matching ticket could not be found
	 */
	public Ticket fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Ticket>
			orderByComparator);

	/**
	 * Returns the tickets before and after the current ticket in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ticketId the primary key of the current ticket
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ticket
	 * @throws NoSuchTicketException if a ticket with the primary key could not be found
	 */
	public Ticket[] findByUuid_C_PrevAndNext(
			long ticketId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Ticket>
				orderByComparator)
		throws NoSuchTicketException;

	/**
	 * Removes all the tickets where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of tickets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching tickets
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the tickets where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching tickets
	 */
	public java.util.List<Ticket> findByGroupId(long groupId);

	/**
	 * Returns a range of all the tickets where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TicketModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of tickets
	 * @param end the upper bound of the range of tickets (not inclusive)
	 * @return the range of matching tickets
	 */
	public java.util.List<Ticket> findByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the tickets where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TicketModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of tickets
	 * @param end the upper bound of the range of tickets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tickets
	 */
	public java.util.List<Ticket> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Ticket>
			orderByComparator);

	/**
	 * Returns an ordered range of all the tickets where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TicketModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of tickets
	 * @param end the upper bound of the range of tickets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tickets
	 */
	public java.util.List<Ticket> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Ticket>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ticket in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ticket
	 * @throws NoSuchTicketException if a matching ticket could not be found
	 */
	public Ticket findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Ticket>
				orderByComparator)
		throws NoSuchTicketException;

	/**
	 * Returns the first ticket in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ticket, or <code>null</code> if a matching ticket could not be found
	 */
	public Ticket fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Ticket>
			orderByComparator);

	/**
	 * Returns the last ticket in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ticket
	 * @throws NoSuchTicketException if a matching ticket could not be found
	 */
	public Ticket findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Ticket>
				orderByComparator)
		throws NoSuchTicketException;

	/**
	 * Returns the last ticket in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ticket, or <code>null</code> if a matching ticket could not be found
	 */
	public Ticket fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Ticket>
			orderByComparator);

	/**
	 * Returns the tickets before and after the current ticket in the ordered set where groupId = &#63;.
	 *
	 * @param ticketId the primary key of the current ticket
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ticket
	 * @throws NoSuchTicketException if a ticket with the primary key could not be found
	 */
	public Ticket[] findByGroupId_PrevAndNext(
			long ticketId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Ticket>
				orderByComparator)
		throws NoSuchTicketException;

	/**
	 * Removes all the tickets where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of tickets where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching tickets
	 */
	public int countByGroupId(long groupId);

	/**
	 * Caches the ticket in the entity cache if it is enabled.
	 *
	 * @param ticket the ticket
	 */
	public void cacheResult(Ticket ticket);

	/**
	 * Caches the tickets in the entity cache if it is enabled.
	 *
	 * @param tickets the tickets
	 */
	public void cacheResult(java.util.List<Ticket> tickets);

	/**
	 * Creates a new ticket with the primary key. Does not add the ticket to the database.
	 *
	 * @param ticketId the primary key for the new ticket
	 * @return the new ticket
	 */
	public Ticket create(long ticketId);

	/**
	 * Removes the ticket with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ticketId the primary key of the ticket
	 * @return the ticket that was removed
	 * @throws NoSuchTicketException if a ticket with the primary key could not be found
	 */
	public Ticket remove(long ticketId) throws NoSuchTicketException;

	public Ticket updateImpl(Ticket ticket);

	/**
	 * Returns the ticket with the primary key or throws a <code>NoSuchTicketException</code> if it could not be found.
	 *
	 * @param ticketId the primary key of the ticket
	 * @return the ticket
	 * @throws NoSuchTicketException if a ticket with the primary key could not be found
	 */
	public Ticket findByPrimaryKey(long ticketId) throws NoSuchTicketException;

	/**
	 * Returns the ticket with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ticketId the primary key of the ticket
	 * @return the ticket, or <code>null</code> if a ticket with the primary key could not be found
	 */
	public Ticket fetchByPrimaryKey(long ticketId);

	/**
	 * Returns all the tickets.
	 *
	 * @return the tickets
	 */
	public java.util.List<Ticket> findAll();

	/**
	 * Returns a range of all the tickets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TicketModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tickets
	 * @param end the upper bound of the range of tickets (not inclusive)
	 * @return the range of tickets
	 */
	public java.util.List<Ticket> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the tickets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TicketModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tickets
	 * @param end the upper bound of the range of tickets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tickets
	 */
	public java.util.List<Ticket> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Ticket>
			orderByComparator);

	/**
	 * Returns an ordered range of all the tickets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TicketModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tickets
	 * @param end the upper bound of the range of tickets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tickets
	 */
	public java.util.List<Ticket> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Ticket>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tickets from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tickets.
	 *
	 * @return the number of tickets
	 */
	public int countAll();

}