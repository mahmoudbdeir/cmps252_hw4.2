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

@Tag("5")
class Record_370 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 370: FirstName is Faustino")
	void FirstNameOfRecord370() {
		assertEquals("Faustino", customers.get(369).getFirstName());
	}

	@Test
	@DisplayName("Record 370: LastName is Osso")
	void LastNameOfRecord370() {
		assertEquals("Osso", customers.get(369).getLastName());
	}

	@Test
	@DisplayName("Record 370: Company is Coldwell Bnkr Frank Laiben")
	void CompanyOfRecord370() {
		assertEquals("Coldwell Bnkr Frank Laiben", customers.get(369).getCompany());
	}

	@Test
	@DisplayName("Record 370: Address is 25 Austin Blvd")
	void AddressOfRecord370() {
		assertEquals("25 Austin Blvd", customers.get(369).getAddress());
	}

	@Test
	@DisplayName("Record 370: City is Commack")
	void CityOfRecord370() {
		assertEquals("Commack", customers.get(369).getCity());
	}

	@Test
	@DisplayName("Record 370: County is Suffolk")
	void CountyOfRecord370() {
		assertEquals("Suffolk", customers.get(369).getCounty());
	}

	@Test
	@DisplayName("Record 370: State is NY")
	void StateOfRecord370() {
		assertEquals("NY", customers.get(369).getState());
	}

	@Test
	@DisplayName("Record 370: ZIP is 11725")
	void ZIPOfRecord370() {
		assertEquals("11725", customers.get(369).getZIP());
	}

	@Test
	@DisplayName("Record 370: Phone is 631-543-8451")
	void PhoneOfRecord370() {
		assertEquals("631-543-8451", customers.get(369).getPhone());
	}

	@Test
	@DisplayName("Record 370: Fax is 631-543-1289")
	void FaxOfRecord370() {
		assertEquals("631-543-1289", customers.get(369).getFax());
	}

	@Test
	@DisplayName("Record 370: Email is faustino@osso.com")
	void EmailOfRecord370() {
		assertEquals("faustino@osso.com", customers.get(369).getEmail());
	}

	@Test
	@DisplayName("Record 370: Web is http://www.faustinoosso.com")
	void WebOfRecord370() {
		assertEquals("http://www.faustinoosso.com", customers.get(369).getWeb());
	}
}
