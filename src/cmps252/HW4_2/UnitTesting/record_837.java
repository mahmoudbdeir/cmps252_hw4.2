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

@Tag("15")
class Record_837 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 837: FirstName is Daisy")
	void FirstNameOfRecord837() {
		assertEquals("Daisy", customers.get(836).getFirstName());
	}

	@Test
	@DisplayName("Record 837: LastName is Stoudamire")
	void LastNameOfRecord837() {
		assertEquals("Stoudamire", customers.get(836).getLastName());
	}

	@Test
	@DisplayName("Record 837: Company is Chauffeured Occasions Inc")
	void CompanyOfRecord837() {
		assertEquals("Chauffeured Occasions Inc", customers.get(836).getCompany());
	}

	@Test
	@DisplayName("Record 837: Address is 6005 Excelsior Blvd")
	void AddressOfRecord837() {
		assertEquals("6005 Excelsior Blvd", customers.get(836).getAddress());
	}

	@Test
	@DisplayName("Record 837: City is Minneapolis")
	void CityOfRecord837() {
		assertEquals("Minneapolis", customers.get(836).getCity());
	}

	@Test
	@DisplayName("Record 837: County is Hennepin")
	void CountyOfRecord837() {
		assertEquals("Hennepin", customers.get(836).getCounty());
	}

	@Test
	@DisplayName("Record 837: State is MN")
	void StateOfRecord837() {
		assertEquals("MN", customers.get(836).getState());
	}

	@Test
	@DisplayName("Record 837: ZIP is 55416")
	void ZIPOfRecord837() {
		assertEquals("55416", customers.get(836).getZIP());
	}

	@Test
	@DisplayName("Record 837: Phone is 952-922-1028")
	void PhoneOfRecord837() {
		assertEquals("952-922-1028", customers.get(836).getPhone());
	}

	@Test
	@DisplayName("Record 837: Fax is 952-922-6494")
	void FaxOfRecord837() {
		assertEquals("952-922-6494", customers.get(836).getFax());
	}

	@Test
	@DisplayName("Record 837: Email is daisy@stoudamire.com")
	void EmailOfRecord837() {
		assertEquals("daisy@stoudamire.com", customers.get(836).getEmail());
	}

	@Test
	@DisplayName("Record 837: Web is http://www.daisystoudamire.com")
	void WebOfRecord837() {
		assertEquals("http://www.daisystoudamire.com", customers.get(836).getWeb());
	}
}
