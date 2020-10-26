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
class Record_1778 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1778: FirstName is Kimberley")
	void FirstNameOfRecord1778() {
		assertEquals("Kimberley", customers.get(1777).getFirstName());
	}

	@Test
	@DisplayName("Record 1778: LastName is Kissner")
	void LastNameOfRecord1778() {
		assertEquals("Kissner", customers.get(1777).getLastName());
	}

	@Test
	@DisplayName("Record 1778: Company is European Express")
	void CompanyOfRecord1778() {
		assertEquals("European Express", customers.get(1777).getCompany());
	}

	@Test
	@DisplayName("Record 1778: Address is 19838 47th Ave Ne")
	void AddressOfRecord1778() {
		assertEquals("19838 47th Ave Ne", customers.get(1777).getAddress());
	}

	@Test
	@DisplayName("Record 1778: City is Seattle")
	void CityOfRecord1778() {
		assertEquals("Seattle", customers.get(1777).getCity());
	}

	@Test
	@DisplayName("Record 1778: County is King")
	void CountyOfRecord1778() {
		assertEquals("King", customers.get(1777).getCounty());
	}

	@Test
	@DisplayName("Record 1778: State is WA")
	void StateOfRecord1778() {
		assertEquals("WA", customers.get(1777).getState());
	}

	@Test
	@DisplayName("Record 1778: ZIP is 98155")
	void ZIPOfRecord1778() {
		assertEquals("98155", customers.get(1777).getZIP());
	}

	@Test
	@DisplayName("Record 1778: Phone is 206-364-8504")
	void PhoneOfRecord1778() {
		assertEquals("206-364-8504", customers.get(1777).getPhone());
	}

	@Test
	@DisplayName("Record 1778: Fax is 206-364-4188")
	void FaxOfRecord1778() {
		assertEquals("206-364-4188", customers.get(1777).getFax());
	}

	@Test
	@DisplayName("Record 1778: Email is kimberley@kissner.com")
	void EmailOfRecord1778() {
		assertEquals("kimberley@kissner.com", customers.get(1777).getEmail());
	}

	@Test
	@DisplayName("Record 1778: Web is http://www.kimberleykissner.com")
	void WebOfRecord1778() {
		assertEquals("http://www.kimberleykissner.com", customers.get(1777).getWeb());
	}
}
