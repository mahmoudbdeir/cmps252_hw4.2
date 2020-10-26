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

@Tag("12")
class Record_4691 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4691: FirstName is Lucas")
	void FirstNameOfRecord4691() {
		assertEquals("Lucas", customers.get(4690).getFirstName());
	}

	@Test
	@DisplayName("Record 4691: LastName is Villalon")
	void LastNameOfRecord4691() {
		assertEquals("Villalon", customers.get(4690).getLastName());
	}

	@Test
	@DisplayName("Record 4691: Company is Special Care Chestnut Hill Br")
	void CompanyOfRecord4691() {
		assertEquals("Special Care Chestnut Hill Br", customers.get(4690).getCompany());
	}

	@Test
	@DisplayName("Record 4691: Address is 221 W Market St")
	void AddressOfRecord4691() {
		assertEquals("221 W Market St", customers.get(4690).getAddress());
	}

	@Test
	@DisplayName("Record 4691: City is Derby")
	void CityOfRecord4691() {
		assertEquals("Derby", customers.get(4690).getCity());
	}

	@Test
	@DisplayName("Record 4691: County is Sedgwick")
	void CountyOfRecord4691() {
		assertEquals("Sedgwick", customers.get(4690).getCounty());
	}

	@Test
	@DisplayName("Record 4691: State is KS")
	void StateOfRecord4691() {
		assertEquals("KS", customers.get(4690).getState());
	}

	@Test
	@DisplayName("Record 4691: ZIP is 67037")
	void ZIPOfRecord4691() {
		assertEquals("67037", customers.get(4690).getZIP());
	}

	@Test
	@DisplayName("Record 4691: Phone is 316-788-1275")
	void PhoneOfRecord4691() {
		assertEquals("316-788-1275", customers.get(4690).getPhone());
	}

	@Test
	@DisplayName("Record 4691: Fax is 316-788-9135")
	void FaxOfRecord4691() {
		assertEquals("316-788-9135", customers.get(4690).getFax());
	}

	@Test
	@DisplayName("Record 4691: Email is lucas@villalon.com")
	void EmailOfRecord4691() {
		assertEquals("lucas@villalon.com", customers.get(4690).getEmail());
	}

	@Test
	@DisplayName("Record 4691: Web is http://www.lucasvillalon.com")
	void WebOfRecord4691() {
		assertEquals("http://www.lucasvillalon.com", customers.get(4690).getWeb());
	}
}
