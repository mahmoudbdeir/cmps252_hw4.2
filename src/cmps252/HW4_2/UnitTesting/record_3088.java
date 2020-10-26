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
class Record_3088 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3088: FirstName is Megan")
	void FirstNameOfRecord3088() {
		assertEquals("Megan", customers.get(3087).getFirstName());
	}

	@Test
	@DisplayName("Record 3088: LastName is Suprenant")
	void LastNameOfRecord3088() {
		assertEquals("Suprenant", customers.get(3087).getLastName());
	}

	@Test
	@DisplayName("Record 3088: Company is Affiliated Paper Co")
	void CompanyOfRecord3088() {
		assertEquals("Affiliated Paper Co", customers.get(3087).getCompany());
	}

	@Test
	@DisplayName("Record 3088: Address is 175 5th Ave")
	void AddressOfRecord3088() {
		assertEquals("175 5th Ave", customers.get(3087).getAddress());
	}

	@Test
	@DisplayName("Record 3088: City is New York")
	void CityOfRecord3088() {
		assertEquals("New York", customers.get(3087).getCity());
	}

	@Test
	@DisplayName("Record 3088: County is New York")
	void CountyOfRecord3088() {
		assertEquals("New York", customers.get(3087).getCounty());
	}

	@Test
	@DisplayName("Record 3088: State is NY")
	void StateOfRecord3088() {
		assertEquals("NY", customers.get(3087).getState());
	}

	@Test
	@DisplayName("Record 3088: ZIP is 10010")
	void ZIPOfRecord3088() {
		assertEquals("10010", customers.get(3087).getZIP());
	}

	@Test
	@DisplayName("Record 3088: Phone is 212-529-2073")
	void PhoneOfRecord3088() {
		assertEquals("212-529-2073", customers.get(3087).getPhone());
	}

	@Test
	@DisplayName("Record 3088: Fax is 212-529-0424")
	void FaxOfRecord3088() {
		assertEquals("212-529-0424", customers.get(3087).getFax());
	}

	@Test
	@DisplayName("Record 3088: Email is megan@suprenant.com")
	void EmailOfRecord3088() {
		assertEquals("megan@suprenant.com", customers.get(3087).getEmail());
	}

	@Test
	@DisplayName("Record 3088: Web is http://www.megansuprenant.com")
	void WebOfRecord3088() {
		assertEquals("http://www.megansuprenant.com", customers.get(3087).getWeb());
	}
}
