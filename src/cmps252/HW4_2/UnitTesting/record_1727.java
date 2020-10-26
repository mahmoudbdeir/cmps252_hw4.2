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

@Tag("40")
class Record_1727 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1727: FirstName is Wilber")
	void FirstNameOfRecord1727() {
		assertEquals("Wilber", customers.get(1726).getFirstName());
	}

	@Test
	@DisplayName("Record 1727: LastName is Howze")
	void LastNameOfRecord1727() {
		assertEquals("Howze", customers.get(1726).getLastName());
	}

	@Test
	@DisplayName("Record 1727: Company is Crown Of Texas Hospice")
	void CompanyOfRecord1727() {
		assertEquals("Crown Of Texas Hospice", customers.get(1726).getCompany());
	}

	@Test
	@DisplayName("Record 1727: Address is 19715 La Grange Rd")
	void AddressOfRecord1727() {
		assertEquals("19715 La Grange Rd", customers.get(1726).getAddress());
	}

	@Test
	@DisplayName("Record 1727: City is Mokena")
	void CityOfRecord1727() {
		assertEquals("Mokena", customers.get(1726).getCity());
	}

	@Test
	@DisplayName("Record 1727: County is Will")
	void CountyOfRecord1727() {
		assertEquals("Will", customers.get(1726).getCounty());
	}

	@Test
	@DisplayName("Record 1727: State is IL")
	void StateOfRecord1727() {
		assertEquals("IL", customers.get(1726).getState());
	}

	@Test
	@DisplayName("Record 1727: ZIP is 60448")
	void ZIPOfRecord1727() {
		assertEquals("60448", customers.get(1726).getZIP());
	}

	@Test
	@DisplayName("Record 1727: Phone is 708-479-8750")
	void PhoneOfRecord1727() {
		assertEquals("708-479-8750", customers.get(1726).getPhone());
	}

	@Test
	@DisplayName("Record 1727: Fax is 708-479-5468")
	void FaxOfRecord1727() {
		assertEquals("708-479-5468", customers.get(1726).getFax());
	}

	@Test
	@DisplayName("Record 1727: Email is wilber@howze.com")
	void EmailOfRecord1727() {
		assertEquals("wilber@howze.com", customers.get(1726).getEmail());
	}

	@Test
	@DisplayName("Record 1727: Web is http://www.wilberhowze.com")
	void WebOfRecord1727() {
		assertEquals("http://www.wilberhowze.com", customers.get(1726).getWeb());
	}
}
