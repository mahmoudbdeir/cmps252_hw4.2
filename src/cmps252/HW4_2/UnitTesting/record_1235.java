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

@Tag("12")
class Record_1235 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1235: FirstName is Maureen")
	void FirstNameOfRecord1235() {
		assertEquals("Maureen", customers.get(1234).getFirstName());
	}

	@Test
	@DisplayName("Record 1235: LastName is Prinzivalli")
	void LastNameOfRecord1235() {
		assertEquals("Prinzivalli", customers.get(1234).getLastName());
	}

	@Test
	@DisplayName("Record 1235: Company is Neu Tool Design")
	void CompanyOfRecord1235() {
		assertEquals("Neu Tool Design", customers.get(1234).getCompany());
	}

	@Test
	@DisplayName("Record 1235: Address is 1425 Wynnton Rd")
	void AddressOfRecord1235() {
		assertEquals("1425 Wynnton Rd", customers.get(1234).getAddress());
	}

	@Test
	@DisplayName("Record 1235: City is Columbus")
	void CityOfRecord1235() {
		assertEquals("Columbus", customers.get(1234).getCity());
	}

	@Test
	@DisplayName("Record 1235: County is Muscogee")
	void CountyOfRecord1235() {
		assertEquals("Muscogee", customers.get(1234).getCounty());
	}

	@Test
	@DisplayName("Record 1235: State is GA")
	void StateOfRecord1235() {
		assertEquals("GA", customers.get(1234).getState());
	}

	@Test
	@DisplayName("Record 1235: ZIP is 31906")
	void ZIPOfRecord1235() {
		assertEquals("31906", customers.get(1234).getZIP());
	}

	@Test
	@DisplayName("Record 1235: Phone is 706-323-5042")
	void PhoneOfRecord1235() {
		assertEquals("706-323-5042", customers.get(1234).getPhone());
	}

	@Test
	@DisplayName("Record 1235: Fax is 706-323-2951")
	void FaxOfRecord1235() {
		assertEquals("706-323-2951", customers.get(1234).getFax());
	}

	@Test
	@DisplayName("Record 1235: Email is maureen@prinzivalli.com")
	void EmailOfRecord1235() {
		assertEquals("maureen@prinzivalli.com", customers.get(1234).getEmail());
	}

	@Test
	@DisplayName("Record 1235: Web is http://www.maureenprinzivalli.com")
	void WebOfRecord1235() {
		assertEquals("http://www.maureenprinzivalli.com", customers.get(1234).getWeb());
	}
}
