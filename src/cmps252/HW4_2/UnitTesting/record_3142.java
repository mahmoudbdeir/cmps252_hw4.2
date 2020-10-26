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
class Record_3142 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3142: FirstName is Lourdes")
	void FirstNameOfRecord3142() {
		assertEquals("Lourdes", customers.get(3141).getFirstName());
	}

	@Test
	@DisplayName("Record 3142: LastName is Cyprian")
	void LastNameOfRecord3142() {
		assertEquals("Cyprian", customers.get(3141).getLastName());
	}

	@Test
	@DisplayName("Record 3142: Company is Mida Denticare Of Virginia")
	void CompanyOfRecord3142() {
		assertEquals("Mida Denticare Of Virginia", customers.get(3141).getCompany());
	}

	@Test
	@DisplayName("Record 3142: Address is 14587 Southern Blvd")
	void AddressOfRecord3142() {
		assertEquals("14587 Southern Blvd", customers.get(3141).getAddress());
	}

	@Test
	@DisplayName("Record 3142: City is Loxahatchee")
	void CityOfRecord3142() {
		assertEquals("Loxahatchee", customers.get(3141).getCity());
	}

	@Test
	@DisplayName("Record 3142: County is Palm Beach")
	void CountyOfRecord3142() {
		assertEquals("Palm Beach", customers.get(3141).getCounty());
	}

	@Test
	@DisplayName("Record 3142: State is FL")
	void StateOfRecord3142() {
		assertEquals("FL", customers.get(3141).getState());
	}

	@Test
	@DisplayName("Record 3142: ZIP is 33470")
	void ZIPOfRecord3142() {
		assertEquals("33470", customers.get(3141).getZIP());
	}

	@Test
	@DisplayName("Record 3142: Phone is 561-795-8221")
	void PhoneOfRecord3142() {
		assertEquals("561-795-8221", customers.get(3141).getPhone());
	}

	@Test
	@DisplayName("Record 3142: Fax is 561-795-7461")
	void FaxOfRecord3142() {
		assertEquals("561-795-7461", customers.get(3141).getFax());
	}

	@Test
	@DisplayName("Record 3142: Email is lourdes@cyprian.com")
	void EmailOfRecord3142() {
		assertEquals("lourdes@cyprian.com", customers.get(3141).getEmail());
	}

	@Test
	@DisplayName("Record 3142: Web is http://www.lourdescyprian.com")
	void WebOfRecord3142() {
		assertEquals("http://www.lourdescyprian.com", customers.get(3141).getWeb());
	}
}
