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

@Tag("2")
class Record_4904 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4904: FirstName is Miquel")
	void FirstNameOfRecord4904() {
		assertEquals("Miquel", customers.get(4903).getFirstName());
	}

	@Test
	@DisplayName("Record 4904: LastName is Dilick")
	void LastNameOfRecord4904() {
		assertEquals("Dilick", customers.get(4903).getLastName());
	}

	@Test
	@DisplayName("Record 4904: Company is Mtn States Fastening Systems")
	void CompanyOfRecord4904() {
		assertEquals("Mtn States Fastening Systems", customers.get(4903).getCompany());
	}

	@Test
	@DisplayName("Record 4904: Address is 4040 W Waters Ave  #-800")
	void AddressOfRecord4904() {
		assertEquals("4040 W Waters Ave  #-800", customers.get(4903).getAddress());
	}

	@Test
	@DisplayName("Record 4904: City is Tampa")
	void CityOfRecord4904() {
		assertEquals("Tampa", customers.get(4903).getCity());
	}

	@Test
	@DisplayName("Record 4904: County is Hillsborough")
	void CountyOfRecord4904() {
		assertEquals("Hillsborough", customers.get(4903).getCounty());
	}

	@Test
	@DisplayName("Record 4904: State is FL")
	void StateOfRecord4904() {
		assertEquals("FL", customers.get(4903).getState());
	}

	@Test
	@DisplayName("Record 4904: ZIP is 33614")
	void ZIPOfRecord4904() {
		assertEquals("33614", customers.get(4903).getZIP());
	}

	@Test
	@DisplayName("Record 4904: Phone is 813-887-6927")
	void PhoneOfRecord4904() {
		assertEquals("813-887-6927", customers.get(4903).getPhone());
	}

	@Test
	@DisplayName("Record 4904: Fax is 813-887-4368")
	void FaxOfRecord4904() {
		assertEquals("813-887-4368", customers.get(4903).getFax());
	}

	@Test
	@DisplayName("Record 4904: Email is miquel@dilick.com")
	void EmailOfRecord4904() {
		assertEquals("miquel@dilick.com", customers.get(4903).getEmail());
	}

	@Test
	@DisplayName("Record 4904: Web is http://www.miqueldilick.com")
	void WebOfRecord4904() {
		assertEquals("http://www.miqueldilick.com", customers.get(4903).getWeb());
	}
}
