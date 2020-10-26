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
class Record_3821 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3821: FirstName is Zack")
	void FirstNameOfRecord3821() {
		assertEquals("Zack", customers.get(3820).getFirstName());
	}

	@Test
	@DisplayName("Record 3821: LastName is Lafoy")
	void LastNameOfRecord3821() {
		assertEquals("Lafoy", customers.get(3820).getLastName());
	}

	@Test
	@DisplayName("Record 3821: Company is Unique Printing Service Inc")
	void CompanyOfRecord3821() {
		assertEquals("Unique Printing Service Inc", customers.get(3820).getCompany());
	}

	@Test
	@DisplayName("Record 3821: Address is 23 N Central Ave")
	void AddressOfRecord3821() {
		assertEquals("23 N Central Ave", customers.get(3820).getAddress());
	}

	@Test
	@DisplayName("Record 3821: City is Canonsburg")
	void CityOfRecord3821() {
		assertEquals("Canonsburg", customers.get(3820).getCity());
	}

	@Test
	@DisplayName("Record 3821: County is Washington")
	void CountyOfRecord3821() {
		assertEquals("Washington", customers.get(3820).getCounty());
	}

	@Test
	@DisplayName("Record 3821: State is PA")
	void StateOfRecord3821() {
		assertEquals("PA", customers.get(3820).getState());
	}

	@Test
	@DisplayName("Record 3821: ZIP is 15317")
	void ZIPOfRecord3821() {
		assertEquals("15317", customers.get(3820).getZIP());
	}

	@Test
	@DisplayName("Record 3821: Phone is 724-746-6178")
	void PhoneOfRecord3821() {
		assertEquals("724-746-6178", customers.get(3820).getPhone());
	}

	@Test
	@DisplayName("Record 3821: Fax is 724-746-5541")
	void FaxOfRecord3821() {
		assertEquals("724-746-5541", customers.get(3820).getFax());
	}

	@Test
	@DisplayName("Record 3821: Email is zack@lafoy.com")
	void EmailOfRecord3821() {
		assertEquals("zack@lafoy.com", customers.get(3820).getEmail());
	}

	@Test
	@DisplayName("Record 3821: Web is http://www.zacklafoy.com")
	void WebOfRecord3821() {
		assertEquals("http://www.zacklafoy.com", customers.get(3820).getWeb());
	}
}
