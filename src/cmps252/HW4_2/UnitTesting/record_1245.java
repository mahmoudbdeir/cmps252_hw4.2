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

@Tag("16")
class Record_1245 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1245: FirstName is Dannie")
	void FirstNameOfRecord1245() {
		assertEquals("Dannie", customers.get(1244).getFirstName());
	}

	@Test
	@DisplayName("Record 1245: LastName is Stakemann")
	void LastNameOfRecord1245() {
		assertEquals("Stakemann", customers.get(1244).getLastName());
	}

	@Test
	@DisplayName("Record 1245: Company is Flowers By Lynda")
	void CompanyOfRecord1245() {
		assertEquals("Flowers By Lynda", customers.get(1244).getCompany());
	}

	@Test
	@DisplayName("Record 1245: Address is 5766 Balcones Dr")
	void AddressOfRecord1245() {
		assertEquals("5766 Balcones Dr", customers.get(1244).getAddress());
	}

	@Test
	@DisplayName("Record 1245: City is Austin")
	void CityOfRecord1245() {
		assertEquals("Austin", customers.get(1244).getCity());
	}

	@Test
	@DisplayName("Record 1245: County is Travis")
	void CountyOfRecord1245() {
		assertEquals("Travis", customers.get(1244).getCounty());
	}

	@Test
	@DisplayName("Record 1245: State is TX")
	void StateOfRecord1245() {
		assertEquals("TX", customers.get(1244).getState());
	}

	@Test
	@DisplayName("Record 1245: ZIP is 78731")
	void ZIPOfRecord1245() {
		assertEquals("78731", customers.get(1244).getZIP());
	}

	@Test
	@DisplayName("Record 1245: Phone is 512-302-7220")
	void PhoneOfRecord1245() {
		assertEquals("512-302-7220", customers.get(1244).getPhone());
	}

	@Test
	@DisplayName("Record 1245: Fax is 512-302-0463")
	void FaxOfRecord1245() {
		assertEquals("512-302-0463", customers.get(1244).getFax());
	}

	@Test
	@DisplayName("Record 1245: Email is dannie@stakemann.com")
	void EmailOfRecord1245() {
		assertEquals("dannie@stakemann.com", customers.get(1244).getEmail());
	}

	@Test
	@DisplayName("Record 1245: Web is http://www.danniestakemann.com")
	void WebOfRecord1245() {
		assertEquals("http://www.danniestakemann.com", customers.get(1244).getWeb());
	}
}
