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

@Tag("34")
class Record_4698 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4698: FirstName is Esther")
	void FirstNameOfRecord4698() {
		assertEquals("Esther", customers.get(4697).getFirstName());
	}

	@Test
	@DisplayName("Record 4698: LastName is Falson")
	void LastNameOfRecord4698() {
		assertEquals("Falson", customers.get(4697).getLastName());
	}

	@Test
	@DisplayName("Record 4698: Company is Eti Environmental Services")
	void CompanyOfRecord4698() {
		assertEquals("Eti Environmental Services", customers.get(4697).getCompany());
	}

	@Test
	@DisplayName("Record 4698: Address is 6101 Ball Rd  #-206b")
	void AddressOfRecord4698() {
		assertEquals("6101 Ball Rd  #-206b", customers.get(4697).getAddress());
	}

	@Test
	@DisplayName("Record 4698: City is Cypress")
	void CityOfRecord4698() {
		assertEquals("Cypress", customers.get(4697).getCity());
	}

	@Test
	@DisplayName("Record 4698: County is Orange")
	void CountyOfRecord4698() {
		assertEquals("Orange", customers.get(4697).getCounty());
	}

	@Test
	@DisplayName("Record 4698: State is CA")
	void StateOfRecord4698() {
		assertEquals("CA", customers.get(4697).getState());
	}

	@Test
	@DisplayName("Record 4698: ZIP is 90630")
	void ZIPOfRecord4698() {
		assertEquals("90630", customers.get(4697).getZIP());
	}

	@Test
	@DisplayName("Record 4698: Phone is 714-995-5627")
	void PhoneOfRecord4698() {
		assertEquals("714-995-5627", customers.get(4697).getPhone());
	}

	@Test
	@DisplayName("Record 4698: Fax is 714-995-5224")
	void FaxOfRecord4698() {
		assertEquals("714-995-5224", customers.get(4697).getFax());
	}

	@Test
	@DisplayName("Record 4698: Email is esther@falson.com")
	void EmailOfRecord4698() {
		assertEquals("esther@falson.com", customers.get(4697).getEmail());
	}

	@Test
	@DisplayName("Record 4698: Web is http://www.estherfalson.com")
	void WebOfRecord4698() {
		assertEquals("http://www.estherfalson.com", customers.get(4697).getWeb());
	}
}
