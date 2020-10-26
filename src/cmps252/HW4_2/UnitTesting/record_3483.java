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

@Tag("4")
class Record_3483 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3483: FirstName is Tamika")
	void FirstNameOfRecord3483() {
		assertEquals("Tamika", customers.get(3482).getFirstName());
	}

	@Test
	@DisplayName("Record 3483: LastName is Lindbo")
	void LastNameOfRecord3483() {
		assertEquals("Lindbo", customers.get(3482).getLastName());
	}

	@Test
	@DisplayName("Record 3483: Company is Banner Publishing Co")
	void CompanyOfRecord3483() {
		assertEquals("Banner Publishing Co", customers.get(3482).getCompany());
	}

	@Test
	@DisplayName("Record 3483: Address is 500 W 1st St")
	void AddressOfRecord3483() {
		assertEquals("500 W 1st St", customers.get(3482).getAddress());
	}

	@Test
	@DisplayName("Record 3483: City is Sanford")
	void CityOfRecord3483() {
		assertEquals("Sanford", customers.get(3482).getCity());
	}

	@Test
	@DisplayName("Record 3483: County is Seminole")
	void CountyOfRecord3483() {
		assertEquals("Seminole", customers.get(3482).getCounty());
	}

	@Test
	@DisplayName("Record 3483: State is FL")
	void StateOfRecord3483() {
		assertEquals("FL", customers.get(3482).getState());
	}

	@Test
	@DisplayName("Record 3483: ZIP is 32771")
	void ZIPOfRecord3483() {
		assertEquals("32771", customers.get(3482).getZIP());
	}

	@Test
	@DisplayName("Record 3483: Phone is 407-323-4646")
	void PhoneOfRecord3483() {
		assertEquals("407-323-4646", customers.get(3482).getPhone());
	}

	@Test
	@DisplayName("Record 3483: Fax is 407-323-1486")
	void FaxOfRecord3483() {
		assertEquals("407-323-1486", customers.get(3482).getFax());
	}

	@Test
	@DisplayName("Record 3483: Email is tamika@lindbo.com")
	void EmailOfRecord3483() {
		assertEquals("tamika@lindbo.com", customers.get(3482).getEmail());
	}

	@Test
	@DisplayName("Record 3483: Web is http://www.tamikalindbo.com")
	void WebOfRecord3483() {
		assertEquals("http://www.tamikalindbo.com", customers.get(3482).getWeb());
	}
}
