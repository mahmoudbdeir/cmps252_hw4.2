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

@Tag("42")
class Record_2514 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2514: FirstName is Gale")
	void FirstNameOfRecord2514() {
		assertEquals("Gale", customers.get(2513).getFirstName());
	}

	@Test
	@DisplayName("Record 2514: LastName is Curbow")
	void LastNameOfRecord2514() {
		assertEquals("Curbow", customers.get(2513).getLastName());
	}

	@Test
	@DisplayName("Record 2514: Company is Sun Motel")
	void CompanyOfRecord2514() {
		assertEquals("Sun Motel", customers.get(2513).getCompany());
	}

	@Test
	@DisplayName("Record 2514: Address is 4600 Edges Mill Rd")
	void AddressOfRecord2514() {
		assertEquals("4600 Edges Mill Rd", customers.get(2513).getAddress());
	}

	@Test
	@DisplayName("Record 2514: City is Downingtown")
	void CityOfRecord2514() {
		assertEquals("Downingtown", customers.get(2513).getCity());
	}

	@Test
	@DisplayName("Record 2514: County is Chester")
	void CountyOfRecord2514() {
		assertEquals("Chester", customers.get(2513).getCounty());
	}

	@Test
	@DisplayName("Record 2514: State is PA")
	void StateOfRecord2514() {
		assertEquals("PA", customers.get(2513).getState());
	}

	@Test
	@DisplayName("Record 2514: ZIP is 19335")
	void ZIPOfRecord2514() {
		assertEquals("19335", customers.get(2513).getZIP());
	}

	@Test
	@DisplayName("Record 2514: Phone is 610-269-8805")
	void PhoneOfRecord2514() {
		assertEquals("610-269-8805", customers.get(2513).getPhone());
	}

	@Test
	@DisplayName("Record 2514: Fax is 610-269-9652")
	void FaxOfRecord2514() {
		assertEquals("610-269-9652", customers.get(2513).getFax());
	}

	@Test
	@DisplayName("Record 2514: Email is gale@curbow.com")
	void EmailOfRecord2514() {
		assertEquals("gale@curbow.com", customers.get(2513).getEmail());
	}

	@Test
	@DisplayName("Record 2514: Web is http://www.galecurbow.com")
	void WebOfRecord2514() {
		assertEquals("http://www.galecurbow.com", customers.get(2513).getWeb());
	}
}
