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

@Tag("33")
class Record_4846 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4846: FirstName is Chester")
	void FirstNameOfRecord4846() {
		assertEquals("Chester", customers.get(4845).getFirstName());
	}

	@Test
	@DisplayName("Record 4846: LastName is Galbo")
	void LastNameOfRecord4846() {
		assertEquals("Galbo", customers.get(4845).getLastName());
	}

	@Test
	@DisplayName("Record 4846: Company is Mcghee, John R Esq")
	void CompanyOfRecord4846() {
		assertEquals("Mcghee, John R Esq", customers.get(4845).getCompany());
	}

	@Test
	@DisplayName("Record 4846: Address is 3101 P G A Blvd")
	void AddressOfRecord4846() {
		assertEquals("3101 P G A Blvd", customers.get(4845).getAddress());
	}

	@Test
	@DisplayName("Record 4846: City is Palm Beach Gardens")
	void CityOfRecord4846() {
		assertEquals("Palm Beach Gardens", customers.get(4845).getCity());
	}

	@Test
	@DisplayName("Record 4846: County is Palm Beach")
	void CountyOfRecord4846() {
		assertEquals("Palm Beach", customers.get(4845).getCounty());
	}

	@Test
	@DisplayName("Record 4846: State is FL")
	void StateOfRecord4846() {
		assertEquals("FL", customers.get(4845).getState());
	}

	@Test
	@DisplayName("Record 4846: ZIP is 33410")
	void ZIPOfRecord4846() {
		assertEquals("33410", customers.get(4845).getZIP());
	}

	@Test
	@DisplayName("Record 4846: Phone is 561-622-4480")
	void PhoneOfRecord4846() {
		assertEquals("561-622-4480", customers.get(4845).getPhone());
	}

	@Test
	@DisplayName("Record 4846: Fax is 561-622-4768")
	void FaxOfRecord4846() {
		assertEquals("561-622-4768", customers.get(4845).getFax());
	}

	@Test
	@DisplayName("Record 4846: Email is chester@galbo.com")
	void EmailOfRecord4846() {
		assertEquals("chester@galbo.com", customers.get(4845).getEmail());
	}

	@Test
	@DisplayName("Record 4846: Web is http://www.chestergalbo.com")
	void WebOfRecord4846() {
		assertEquals("http://www.chestergalbo.com", customers.get(4845).getWeb());
	}
}
