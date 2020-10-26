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

@Tag("31")
class Record_2885 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2885: FirstName is Gregorio")
	void FirstNameOfRecord2885() {
		assertEquals("Gregorio", customers.get(2884).getFirstName());
	}

	@Test
	@DisplayName("Record 2885: LastName is Dilts")
	void LastNameOfRecord2885() {
		assertEquals("Dilts", customers.get(2884).getLastName());
	}

	@Test
	@DisplayName("Record 2885: Company is Speciale, George H Esq")
	void CompanyOfRecord2885() {
		assertEquals("Speciale, George H Esq", customers.get(2884).getCompany());
	}

	@Test
	@DisplayName("Record 2885: Address is 5900 beam Blvd")
	void AddressOfRecord2885() {
		assertEquals("5900 beam Blvd", customers.get(2884).getAddress());
	}

	@Test
	@DisplayName("Record 2885: City is Pittsburgh")
	void CityOfRecord2885() {
		assertEquals("Pittsburgh", customers.get(2884).getCity());
	}

	@Test
	@DisplayName("Record 2885: County is Allegheny")
	void CountyOfRecord2885() {
		assertEquals("Allegheny", customers.get(2884).getCounty());
	}

	@Test
	@DisplayName("Record 2885: State is PA")
	void StateOfRecord2885() {
		assertEquals("PA", customers.get(2884).getState());
	}

	@Test
	@DisplayName("Record 2885: ZIP is 15206")
	void ZIPOfRecord2885() {
		assertEquals("15206", customers.get(2884).getZIP());
	}

	@Test
	@DisplayName("Record 2885: Phone is 412-362-2877")
	void PhoneOfRecord2885() {
		assertEquals("412-362-2877", customers.get(2884).getPhone());
	}

	@Test
	@DisplayName("Record 2885: Fax is 412-362-5149")
	void FaxOfRecord2885() {
		assertEquals("412-362-5149", customers.get(2884).getFax());
	}

	@Test
	@DisplayName("Record 2885: Email is gregorio@dilts.com")
	void EmailOfRecord2885() {
		assertEquals("gregorio@dilts.com", customers.get(2884).getEmail());
	}

	@Test
	@DisplayName("Record 2885: Web is http://www.gregoriodilts.com")
	void WebOfRecord2885() {
		assertEquals("http://www.gregoriodilts.com", customers.get(2884).getWeb());
	}
}
