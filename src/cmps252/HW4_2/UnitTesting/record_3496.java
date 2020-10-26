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

@Tag("37")
class Record_3496 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3496: FirstName is Lakysha")
	void FirstNameOfRecord3496() {
		assertEquals("Lakysha", customers.get(3495).getFirstName());
	}

	@Test
	@DisplayName("Record 3496: LastName is Stuckett")
	void LastNameOfRecord3496() {
		assertEquals("Stuckett", customers.get(3495).getLastName());
	}

	@Test
	@DisplayName("Record 3496: Company is Rice, Jeffrey B Esq")
	void CompanyOfRecord3496() {
		assertEquals("Rice, Jeffrey B Esq", customers.get(3495).getCompany());
	}

	@Test
	@DisplayName("Record 3496: Address is 367 Southern Blvd")
	void AddressOfRecord3496() {
		assertEquals("367 Southern Blvd", customers.get(3495).getAddress());
	}

	@Test
	@DisplayName("Record 3496: City is Bronx")
	void CityOfRecord3496() {
		assertEquals("Bronx", customers.get(3495).getCity());
	}

	@Test
	@DisplayName("Record 3496: County is Bronx")
	void CountyOfRecord3496() {
		assertEquals("Bronx", customers.get(3495).getCounty());
	}

	@Test
	@DisplayName("Record 3496: State is NY")
	void StateOfRecord3496() {
		assertEquals("NY", customers.get(3495).getState());
	}

	@Test
	@DisplayName("Record 3496: ZIP is 10454")
	void ZIPOfRecord3496() {
		assertEquals("10454", customers.get(3495).getZIP());
	}

	@Test
	@DisplayName("Record 3496: Phone is 718-292-3564")
	void PhoneOfRecord3496() {
		assertEquals("718-292-3564", customers.get(3495).getPhone());
	}

	@Test
	@DisplayName("Record 3496: Fax is 718-292-3566")
	void FaxOfRecord3496() {
		assertEquals("718-292-3566", customers.get(3495).getFax());
	}

	@Test
	@DisplayName("Record 3496: Email is lakysha@stuckett.com")
	void EmailOfRecord3496() {
		assertEquals("lakysha@stuckett.com", customers.get(3495).getEmail());
	}

	@Test
	@DisplayName("Record 3496: Web is http://www.lakyshastuckett.com")
	void WebOfRecord3496() {
		assertEquals("http://www.lakyshastuckett.com", customers.get(3495).getWeb());
	}
}
