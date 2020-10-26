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

@Tag("36")
class Record_3723 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3723: FirstName is Lois")
	void FirstNameOfRecord3723() {
		assertEquals("Lois", customers.get(3722).getFirstName());
	}

	@Test
	@DisplayName("Record 3723: LastName is Seybert")
	void LastNameOfRecord3723() {
		assertEquals("Seybert", customers.get(3722).getLastName());
	}

	@Test
	@DisplayName("Record 3723: Company is Sutherland Chevrolet Geo")
	void CompanyOfRecord3723() {
		assertEquals("Sutherland Chevrolet Geo", customers.get(3722).getCompany());
	}

	@Test
	@DisplayName("Record 3723: Address is 1401 Cleveland Ave")
	void AddressOfRecord3723() {
		assertEquals("1401 Cleveland Ave", customers.get(3722).getAddress());
	}

	@Test
	@DisplayName("Record 3723: City is National City")
	void CityOfRecord3723() {
		assertEquals("National City", customers.get(3722).getCity());
	}

	@Test
	@DisplayName("Record 3723: County is San Diego")
	void CountyOfRecord3723() {
		assertEquals("San Diego", customers.get(3722).getCounty());
	}

	@Test
	@DisplayName("Record 3723: State is CA")
	void StateOfRecord3723() {
		assertEquals("CA", customers.get(3722).getState());
	}

	@Test
	@DisplayName("Record 3723: ZIP is 91950")
	void ZIPOfRecord3723() {
		assertEquals("91950", customers.get(3722).getZIP());
	}

	@Test
	@DisplayName("Record 3723: Phone is 619-474-9410")
	void PhoneOfRecord3723() {
		assertEquals("619-474-9410", customers.get(3722).getPhone());
	}

	@Test
	@DisplayName("Record 3723: Fax is 619-474-7761")
	void FaxOfRecord3723() {
		assertEquals("619-474-7761", customers.get(3722).getFax());
	}

	@Test
	@DisplayName("Record 3723: Email is lois@seybert.com")
	void EmailOfRecord3723() {
		assertEquals("lois@seybert.com", customers.get(3722).getEmail());
	}

	@Test
	@DisplayName("Record 3723: Web is http://www.loisseybert.com")
	void WebOfRecord3723() {
		assertEquals("http://www.loisseybert.com", customers.get(3722).getWeb());
	}
}
