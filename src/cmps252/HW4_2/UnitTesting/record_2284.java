package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("35")
class Record_2284 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2284: FirstName is Araceli")
	void FirstNameOfRecord2284() {
		assertEquals("Araceli", customers.get(2283).getFirstName());
	}

	@Test
	@DisplayName("Record 2284: LastName is Lafaso")
	void LastNameOfRecord2284() {
		assertEquals("Lafaso", customers.get(2283).getLastName());
	}

	@Test
	@DisplayName("Record 2284: Company is Brooks & Goldman Realty")
	void CompanyOfRecord2284() {
		assertEquals("Brooks & Goldman Realty", customers.get(2283).getCompany());
	}

	@Test
	@DisplayName("Record 2284: Address is 2700 Westhaven Vlg")
	void AddressOfRecord2284() {
		assertEquals("2700 Westhaven Vlg", customers.get(2283).getAddress());
	}

	@Test
	@DisplayName("Record 2284: City is Amarillo")
	void CityOfRecord2284() {
		assertEquals("Amarillo", customers.get(2283).getCity());
	}

	@Test
	@DisplayName("Record 2284: County is Randall")
	void CountyOfRecord2284() {
		assertEquals("Randall", customers.get(2283).getCounty());
	}

	@Test
	@DisplayName("Record 2284: State is TX")
	void StateOfRecord2284() {
		assertEquals("TX", customers.get(2283).getState());
	}

	@Test
	@DisplayName("Record 2284: ZIP is 79109")
	void ZIPOfRecord2284() {
		assertEquals("79109", customers.get(2283).getZIP());
	}

	@Test
	@DisplayName("Record 2284: Phone is 806-356-7869")
	void PhoneOfRecord2284() {
		assertEquals("806-356-7869", customers.get(2283).getPhone());
	}

	@Test
	@DisplayName("Record 2284: Fax is 806-356-7668")
	void FaxOfRecord2284() {
		assertEquals("806-356-7668", customers.get(2283).getFax());
	}

	@Test
	@DisplayName("Record 2284: Email is araceli@lafaso.com")
	void EmailOfRecord2284() {
		assertEquals("araceli@lafaso.com", customers.get(2283).getEmail());
	}

	@Test
	@DisplayName("Record 2284: Web is http://www.aracelilafaso.com")
	void WebOfRecord2284() {
		assertEquals("http://www.aracelilafaso.com", customers.get(2283).getWeb());
	}
}
